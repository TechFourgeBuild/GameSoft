import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class WinnersWorld {

    // -------------------------------------------- Getting Dhurandhar of the GameSoft ---------------------------------------------------
    public static void gettingDhurandhar(Connection conn, String playerName) {
        try {
            String SQL = "SELECT id,name,morrascore,rpsscore,numgscore,(morrascore + rpsscore + numgscore) AS total_score " +
                    "FROM credentials ORDER BY total_score DESC LIMIT 1;";

            PreparedStatement ps = conn.prepareStatement(SQL);
            // Execute the query
            ResultSet rs = ps.executeQuery();

            // Check if a result exists
            if (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                int morraScore = rs.getInt("morrascore");
                int rpsScore = rs.getInt("rpsscore");
                int numGScore = rs.getInt("numgscore");
                int totalScore = rs.getInt("total_score");

                // Print or use the data
                System.out.println();
                System.out.println("                         Top Player: " + name);
                System.out.println("                         Morra Score: " + morraScore);
                System.out.println("                         RPS Score: " + rpsScore);
                System.out.println("                         Number Guess Score: " + numGScore);
                System.out.println("                         Total Score: " + totalScore);
            } else {
                System.out.println("              No players found in the database.");
            }
        } catch (SQLException e) {
            System.err.println("Got SQL Error while getting Dhurandhar : " + e.getMessage());
            System.exit(500);
        } catch (Exception e) {
            System.err.println("Error while getting Dhurandhar : " + e.getMessage());
            System.exit(500);
        }
    }

    // -----------------------------------------------------------------------------------------------------------------------------------

    // -------------------------------------------- Getting Top Rated Player of the GameSoft ---------------------------------------------------
    public static void topRatedPlayer(Connection conn, String playerName) {
        try {
            String sql = "SELECT id, name, morrascore, rpsscore, numgscore, ratingofplayer FROM credentials ORDER BY ratingofplayer DESC LIMIT 1;";
            PreparedStatement ps = conn.prepareStatement(sql);

            // Execute the query
            ResultSet rs = ps.executeQuery();

            // Check if a result exists
            if (rs.next()) {
//                int id = rs.getInt("id");
                String name = rs.getString("name");
//                int morraScore = rs.getInt("morrascore");
//                int rpsScore = rs.getInt("rpsscore");
//                int numGScore = rs.getInt("numgscore");
                double rating = rs.getDouble("ratingofplayer");

                // Print or use the data
                System.out.println();
                System.out.println("                         Top Rated Player Name: " + name);
                System.out.println("                         Rating: " + rating);
            } else {
                System.out.println("              No players found in the database.");
            }

        }
        catch(SQLException e)
        {
            System.err.println("Got SQL Error while getting Dhurandhar : "+e.getMessage());
            System.exit(500);
        }
        catch (Exception e) {
            System.err.println("Error while getting Dhurandhar : " + e.getMessage());
            System.exit(500);
        }
    }

    // -----------------------------------------------------------------------------------------------------------------------------------

}
