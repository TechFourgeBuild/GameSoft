import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SavingUserDataToDB {

    public static String newlyCreatedUser = "";
    public static String universalUserNameFromDB = "";

    // -------------------------------- Actual Code for NEW ACCOUNT Addition to Database -------------------------------------------

    public static void userCredentialHandler(String userName, Connection conn) {
        System.out.println("   I'm : " + Thread.currentThread().getName() + " from user Credentials Handler Method");
        try {
            PreparedStatement ps1 = conn.prepareStatement("INSERT INTO credentials(name) VALUES(?)");
            ps1.setString(1, userName);

            int rowsAffected = ps1.executeUpdate();
            newlyCreatedUser = userName;
            if (rowsAffected > 0) {
                System.out.println("   User Credential Added to DB Successfully");
            } else {
                System.out.println("   Failed to add user credential");
            }
//            }
        } catch (SQLException e) {
            String sqlError = e.getMessage();
            if (sqlError.startsWith("Duplicate")) {
                System.err.println("   Username is Already Taken");
                System.exit(409);
            }
            System.out.println("SQL Error while saving user to db : " + e.getMessage());
            System.exit(0);
        } catch (Exception e) {
            System.out.println("Error while Saving user Credentials to DB : " + e.getMessage());
            System.exit(0);
        }

    }

    // ------------------------------------------------------------------------------------------------------------------------------


    // -------------------- Code For Getting the UserName From Database For Checking if the User Already Exists in DB or not -----------------

    // ---------------------------- Here we've created this variable to get the userName for displaying it while playing the game --------------

    // ----------------------------------------------------------------------------------------------------------------------------------------

    public static String userSendsToMain(Connection conn, String userName) {
        String userNameFromDB = "";
        try {
             /*------------------------------- Checking weather the user already exist in db or not and Searching User From DB to get UserName--
            ---------------------------------- */

            String searchingForAlreadyExistedUser = "SELECT name FROM credentials WHERE name = ?";
            PreparedStatement ps2 = conn.prepareStatement(searchingForAlreadyExistedUser);
            ps2.setString(1, userName);

            try (ResultSet rs = ps2.executeQuery()) {
                if (rs.next()) {
                    String dbUserName = rs.getString("name");
                    userNameFromDB = dbUserName;
                    universalUserNameFromDB = userNameFromDB;
//                    System.out.println("dbUserName : "+dbUserName);
                }
            }
        } catch (SQLException e) {
            System.out.println("SQL Error while just fetching user From DB : " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Error while just fetching user From DB : " + e.getMessage());
        }

        return userNameFromDB;
    }

    // ------------------------------------------------------------------------------------------------------------------------------------------

    // --------------------------------------------- This method will just return the userName -----------------------------------------------

    public static String userNameReturnerFromDB() {
        return universalUserNameFromDB;
    }

    // -------------------------------------------------------------------------------------------------------------------------------------

    // --------------------------------------------------------------------------------------------------------------------------------------


    public static String updatingUserMetadataToDB(int finalScore, double oppRatingToPlayer, String gameName, Connection conns) {

        String actualPlayr = null; // this for handling both newly created user and already existed user.

        // -------------------------------------- formatting the userName ------------------------------------------------------------------

        if (newlyCreatedUser.isEmpty()) {
            actualPlayr = universalUserNameFromDB;
        } else {
            actualPlayr = newlyCreatedUser;
        }

        // ------------------------------------------------------------------------------------------------------------------------------------

        System.out.println();
        System.out.println();

        String Message = null; // here the success/failed message of updatingUserMetadataToDB will be stored


        String sqlMorra = "UPDATE credentials SET morrascore = ?, ratingofplayer = ? WHERE name = ?";
        String sqlMorra1 = "UPDATE credentials SET rpsscore = ?, ratingofplayer = ? WHERE name = ?";
        String sqlMorra2 = "UPDATE credentials SET numgscore = ?, ratingofplayer = ? WHERE name = ?";

        if (gameName.equals("morra")) {

            try {
                PreparedStatement ps = conns.prepareStatement(sqlMorra);
                ps.setInt(1, finalScore);
                ps.setDouble(2, oppRatingToPlayer);
                ps.setString(3, actualPlayr);

                int rowsUpdated = ps.executeUpdate();

                if (rowsUpdated > 0) {
                    // System.out.println("✅ Player data updated successfully!");
                    Message = "✅ Player data updated successfully!";
                } else {
                    // System.out.println("❌ Update failed: No player found with that name.");
                    Message = "❌ Update failed: No player found with that name.";
                }

            } catch (SQLException e) {
                System.out.println("SQL Error User meta data of morra not updated to DB : " + e.getMessage());
            } catch (Exception e) {
                System.out.println(" User meta data of morra not updated to DB :  " + e.getMessage());
            }
        } else if (gameName.equals("rps")) {
            try {
                PreparedStatement ps = conns.prepareStatement(sqlMorra1);
                ps.setInt(1, finalScore);
                ps.setDouble(2, oppRatingToPlayer);
                ps.setString(3, actualPlayr);

                int rowsUpdated = ps.executeUpdate();

                if (rowsUpdated > 0) {
                    // System.out.println("✅ Player data updated successfully!");
                    Message = "✅ Player data updated successfully!";
                } else {
                    // System.out.println("❌ Update failed: No player found with that name.");
                    Message = "❌ Update failed: No player found with that name.";
                }
            } catch (SQLException e) {
                System.out.println("SQL Error User meta data of morra not updated to DB : " + e.getMessage());
            } catch (Exception e) {
                System.out.println(" User meta data of morra not updated to DB :  " + e.getMessage());
            }
        } else if (gameName.equals("numguess")) {
            try {
                PreparedStatement ps = conns.prepareStatement(sqlMorra2);
                ps.setInt(1, finalScore);
                ps.setDouble(2, oppRatingToPlayer);
                ps.setString(3, actualPlayr);

                int rowsUpdated = ps.executeUpdate();

                if (rowsUpdated > 0) {
//                    System.out.println("✅ Player data updated successfully!");
                    Message = "✅ Player data updated successfully!";
                } else {
//                    System.out.println("❌ Update failed: No player found with that name.");
                    Message = "❌ Update failed: No player found with that name.";
                }

            } catch (SQLException e) {
                System.out.println("SQL Error User meta data of morra not updated to DB : " + e.getMessage());
            } catch (Exception e) {
                System.out.println(" User meta data of morra not updated to DB :  " + e.getMessage());
            }
        } else {
            System.err.println("Invalid Game Name Provided");
            System.exit(410);
        }

        System.out.println("               " + Thread.currentThread().getName() + " Successfully arrived And Completed it's work successfully");

        return Message;
    }

    // ----------------------------------- Getting Scores of the User from DB ---------------------------------------------------------


    public static int gettingScoreOfUser(Connection conn, String gameName) {
        // -------------------------------------- formatting the userName ------------------------------------------------------------------
        String actualPlayr = null;

        int finalScoreGetFromDB = 0;

        if (newlyCreatedUser.isEmpty()) {
            actualPlayr = universalUserNameFromDB;
        } else {
            actualPlayr = newlyCreatedUser;
        }

        // ------------------------------------------------------------------------------------------------------------------------------------

        String sql1 = "SELECT morrascore FROM credentials WHERE name = ?";
        String sql2 = "SELECT rpsscore FROM credentials WHERE name = ?";
        String sql3 = "SELECT numgscore FROM credentials WHERE name = ?";

        if (gameName.equals("morra")) {
            try {
                PreparedStatement ps = conn.prepareStatement(sql1);
                ps.setString(1, actualPlayr);

                ResultSet rs = ps.executeQuery();
                if (rs.next()) {
                    int finalScoreFromDB = rs.getInt("morrascore");
                    finalScoreGetFromDB = finalScoreFromDB;
//                    System.out.println("dbUserName : "+dbUserName);
                } else {
                    System.out.println("Not Found finalUserScore from DB");
                }
            } catch (SQLException e) {
                System.out.println("SQL Error while getting userScore : " + e.getMessage());
            } catch (Exception e) {
                System.out.println("Error while getting userScore : " + e.getMessage());
                e.printStackTrace();
            }
        } else if (gameName.equals("rps")) {
            try {
                PreparedStatement ps = conn.prepareStatement(sql2);
                ps.setString(1, actualPlayr);

                ResultSet rs = ps.executeQuery();
                if (rs.next()) {
                    int finalScoreFromDB = rs.getInt("rpsscore");
                    finalScoreGetFromDB = finalScoreFromDB;
//                    System.out.println("dbUserName : "+dbUserName);
                } else {
                    System.out.println("Not Found finalUserScore from DB");
                }
            } catch (SQLException e) {
                System.out.println("SQL Error while getting userScore : " + e.getMessage());
            } catch (Exception e) {
                System.out.println("Error while getting userScore : " + e.getMessage());
                e.printStackTrace();
            }
        } else if (gameName.equals("numguess")) {
            try {
                PreparedStatement ps = conn.prepareStatement(sql3);
                ps.setString(1, actualPlayr);

                ResultSet rs = ps.executeQuery();
                if (rs.next()) {
                    int finalScoreFromDB = rs.getInt("numgscore");
                    finalScoreGetFromDB = finalScoreFromDB;
//                    System.out.println("dbUserName : "+dbUserName);
                } else {
                    System.out.println("Not Found finalUserScore from DB");
                }
            } catch (SQLException e) {
                System.out.println("SQL Error while getting userScore : " + e.getMessage());
            } catch (Exception e) {
                System.out.println("Error while getting userScore : " + e.getMessage());
                e.printStackTrace();
            }
        } else {
            System.err.println("Invalid Game Name Entered");
            System.exit(411);
        }

        return finalScoreGetFromDB;
    }

    // ------------------------------------------ Deleting The User From the System -----------------------------------------------------

    public static void deleteUser(Connection conn, String gameNameUser) {

        try {
            PreparedStatement ps = conn.prepareStatement("DELETE FROM credentials WHERE name = ?");
            ps.setString(1, gameNameUser);

            // ------------------------------------------------ Execute the DELETE --------------------------------------
            int rowsDeleted = ps.executeUpdate();  // returns number of rows affected

            // -------------------------------------------- Check if the delete was successful -----------------------------
            System.out.println();
            if (rowsDeleted > 0) {

                // ------------------------------ Printing : Shutting Down the System -----------------------------------------
                String shut = "                      ❌❌❌ \uD835\uDC12\uD835\uDC21\uD835\uDC2E\uD835\uDC2D\uD835\uDC2D\uD835\uDC22\uD835" +
                        "\uDC27\uD835" +
                        "\uDC20 \uD835\uDC03\uD835\uDC28\uD835\uDC30\uD835\uDC27 \uD835\uDC2D\uD835\uDC21\uD835\uDC1E \uD835" +
                        "\uDC12\uD835\uDC32\uD835\uDC2C\uD835\uDC2D\uD835\uDC1E\uD835\uDC26..... ❌❌❌";

                System.out.println("            " + gameNameUser + "'s Account deleted successfully ✅✅✅");
                System.out.println();
                for (int i = 0; i < shut.length(); i++) {
                    System.err.print(shut.charAt(i));
                    Thread.sleep(90);
                }
                System.out.println();
                System.exit(200);
            } else {
                System.out.println("            ❌ No user found with name: " + gameNameUser);
            }
        } catch (SQLException e) {
            System.err.println("SQL Error user while deleting the User : " + e.getMessage());
        } catch (Exception e) {
            System.err.println("Error while deleting the User : " + e.getMessage());
        }
    }
}
