import java.sql.Connection;
import java.util.Scanner;

public class NumberGuessGameLogic {
    public static int finalScore = 0;
    public static String winnerOfnumguess = null;
    public static boolean user = false;
    public static int oppFinalScore = 0;
    public static String LooserOfnumguess = null;

    public static void numGuessLogic(String userName, Connection conn) throws InterruptedException {
        Scanner sc = new Scanner(System.in);

        int min = 1;
        int max = 100;
        int randNumGen = 0;

        // ----------------------------------------------- Newly created user Vs Already Existed User -----------------------------------------

        String finalUser = null;
        String newUser = SavingUserDataToDB.newlyCreatedUser;

        if (userName.length() == 0) {
            finalUser = newUser;
        } else {
            finalUser = userName;
        }


        // ------------------------------------ Opponent is picking it's favourite rating to give to the player -------------------------------

        double[] arr = {1.0, 1.1, 1.2, 1.3, 1.4, 1.5, 1.6, 1.7, 1.8, 1.9, 2.0, 2.1, 2.2, 2.3, 2.4, 2.5, 2.6, 2.7, 2.8, 2.9, 3.0, 3.1,
                3.2, 3.3, 3.4, 3.5, 3.6, 3.7, 3.8, 3.9, 4.0, 4.1, 4.2, 4.3, 4.5, 4.6, 4.7, 4.8, 4.9, 5.0};

        double minRating = 0;
        double maxRating = arr.length - 1;

        int oppRTP = (int) Math.floor(Math.random() * (maxRating - minRating + 1) + minRating);
        double oppRatingToPlayer = arr[oppRTP];
//        System.out.println("oppRatingToPlayer : "+oppRatingToPlayer);

        // -----------------------------------------------------------------------------------------------------------------------------------

        // System.out.println(finalUser);
        // System.out.println("newUser from Morra : "+newUser);

        // System.out.println("I'm not entering in the loop to start num guess. ");
        // ------------------------------------------------------------------------------------------------------------------------------------
        int count = 0;
        // ---------------------------------------- Main Logic of the Game -------------------------------------------------------------------
        while (user == true || count <= 10) {

            // ----------------------------- Generating Number in Loop so that each time num is different ----------------------------------
            int temp = (int) (Math.floor(Math.random() * (max - min + 1) + min)); /* by default it starts from 0.0 to 0.999 ,
               the floor also will give 0.0 double , that's why we typecasting it to "int"*/

            randNumGen = temp;

            // System.out.println("Connection String : "+conn);
            //System.out.println("userName : "+finalUser);
//            System.out.println("randNumGen : " + randNumGen);
            // -----------------------------------------------------------------------------------------------------------------------------

            // ----------------------------------- Printing How many attempts Player have left ---------------------------------------------
            System.out.println();

            // --------------- Printing : You've " + (11 - count) + " Attempts To Win This Game ..... ------------------------------

            System.out.println("            \uD835\uDC18\uD835\uDC28\uD835\uDC2E'\uD835\uDC2F\uD835\uDC1E [ "+ (10-count) +" ] \uD835\uDC00\uD835\uDC2D\uD835\uDC2D" +
                    "\uD835\uDC1E\uD835\uDC26\uD835\uDC29\uD835\uDC2D\uD835\uDC2C \uD835\uDC13\uD835\uDC28 \uD835\uDC16\uD835\uDC22\uD835" +
                    "\uDC27 \uD835\uDC13\uD835\uDC21\uD835\uDC22\uD835\uDC2C \uD835\uDC06\uD835\uDC1A\uD835\uDC26\uD835\uDC1E .....");

            // ---------------------------------------------------------------------------------------------------------------------

            // ----------------------------------------------------------------------------------------------------------------------------

            // System.out.println();

            // ---------------------------- Printing : Choose The number Between 1 to 100 :  -----------------------------------------
            System.out.print("             \uD835\uDC02\uD835\uDC21\uD835\uDC28\uD835\uDC28\uD835\uDC2C\uD835\uDC1E \uD835\uDC13\uD835\uDC21" +
                    "\uD835\uDC1E \uD835\uDC27\uD835\uDC2E\uD835\uDC26\uD835\uDC1B\uD835\uDC1E\uD835\uDC2B \uD835\uDC01\uD835\uDC1E" +
                    "\uD835\uDC2D\uD835\uDC30\uD835\uDC1E\uD835\uDC1E\uD835\uDC27 [ \uD835\uDFCF \uD835\uDC2D\uD835\uDC28 \uD835\uDFCF" +
                    "\uD835\uDFCE\uD835\uDFCE ] : ");
            // ----------------------------------------------------------------------------------------------------------------------

            int userNum = sc.nextInt();

            if (userNum >= 1 && userNum <= 100) {
                if (userNum > randNumGen) {
                    System.out.println();
                    // System.out.println("Current count : "+count);
                    if ((10 - count) == 1 || (10 - count) == 0) {
                        // ------------------- Printing : Actual Value : ---------------------------------------------------------------
                        System.out.println("             \uD835\uDC00\uD835\uDC1C\uD835\uDC2D\uD835\uDC2E\uD835\uDC1A\uD835\uDC25 " +
                                "\uD835\uDC15\uD835\uDC1A\uD835\uDC25\uD835\uDC2E\uD835" +
                                "\uDC1E : " + randNumGen); /* Printing the actual value if user chances becomes 0
                        // -------------------------------------------------------------------------------------------------------------
                      and when user loose it*/
                    } else {
                        // -------------------------------- Printing : Kindly Enter lower Number ------------------------------------
                        System.out.println("             \uD835\uDC0A\uD835\uDC22\uD835\uDC27\uD835\uDC1D\uD835\uDC25\uD835\uDC32 " +
                                "\uD835\uDC04\uD835\uDC27\uD835\uDC2D\uD835\uDC1E\uD835\uDC2B \uD835\uDC25\uD835\uDC28" +
                                "\uD835\uDC30\uD835\uDC1E\uD835\uDC2B \uD835\uDC0D\uD835\uDC2E\uD835\uDC26\uD835\uDC1B\uD835\uDC1E\uD835\uDC2B ");
                        // ----------------------------------------------------------------------------------------------------------
                    }
                    user = false;
                } else if (userNum < randNumGen) {
                    System.out.println();
                    // System.out.println("Current count : "+count);
                    if ((10 - count) == 1 || (10 - count) == 0) {
                        // ------------------- Printing : Actual Value : ---------------------------------------------------------------
                        System.out.println("              \uD835\uDC00\uD835\uDC1C\uD835\uDC2D\uD835\uDC2E\uD835\uDC1A\uD835\uDC25 " +
                                "\uD835\uDC15\uD835\uDC1A\uD835\uDC25\uD835\uDC2E\uD835" +
                                "\uDC1E : " + randNumGen); /* Printing the actual value if user chances becomes 0
                        // -------------------------------------------------------------------------------------------------------------
                      and when user loose it*/
                    } else {
                        // --------------------------------- Printing : Kindly Enter Greater Number ------------------------------------------
                        System.out.println("             \uD835\uDDAA\uD835\uDDC2\uD835\uDDC7\uD835\uDDBD\uD835\uDDC5\uD835\uDDD2 \uD835\uDDA4\uD835\uDDC7" +
                                "\uD835\uDDCD\uD835\uDDBE\uD835\uDDCB \uD835\uDDA6\uD835\uDDCB\uD835\uDDBE\uD835\uDDBA\uD835\uDDCD\uD835" +
                                "\uDDBE\uD835\uDDCB \uD835\uDDAD\uD835\uDDCE\uD835\uDDC6\uD835\uDDBB\uD835\uDDBE\uD835\uDDCB");
                        // -------------------------------------------------------------------------------------------------------------------
                    }
                    user = false;
                } else if (userNum == randNumGen) {
                    System.out.println();
                    // ---------------------------- Printing : Win The Game ------------------------------------------------------
                    System.out.println("             "+finalUser + " : \uD835\uDC80\uD835\uDC90\uD835\uDC96 \uD835\uDC6F\uD835\uDC82\uD835\uDC97" +
                            "\uD835\uDC86 \uD835\uDC7E\uD835\uDC90\uD835\uDC8F \uD835\uDC7B\uD835\uDC89\uD835\uDC86 \uD835\uDC6E" +
                            "\uD835\uDC82\uD835\uDC8E\uD835\uDC86 🏆🏆🏆🎊🎊🎊🎉🎉🎉");
                    // ---------------------------------------------------------------------------------------------------------

                    // ------------------------ Printing : Actual Number ------------------------------------------------------
                    System.out.println("             "+"\uD835\uDDA0\uD835\uDDBC\uD835\uDDCD\uD835\uDDCE\uD835\uDDBA\uD835\uDDC5 \uD835\uDDAD\uD835" +
                            "\uDDCE\uD835\uDDC6\uD835\uDDBB\uD835\uDDBE\uD835\uDDCB : " + randNumGen);
                    // -------------------------------------------------------------------------------------------------------

                    winnerOfnumguess = finalUser;
                    finalScore += 1;
                    user = true;

                    // ------------------------- Printing : The Current Score of Players ------------------------------------------------------
                    System.out.println();
                    System.out.println("               "+finalUser+" Got : [ "+finalScore+" ] ");
//                    System.out.println("                 Opponent Got : [ "+oppFinalScore+" ]");

                    // -------------------------------------------------------------------------------------------------------------------------

// 🟰🟰🟰🟰🟰🟰🟰🟰🟰🟰🟰🟰🟰🟰🟰🟰🟰🟰🟰🟰🟰🟰🟰🟰🟰🟰🟰🟰🟰🟰🟰🟰🟰🟰🟰🟰🟰🟰🟰🟰🟰🟰🟰🟰🟰🟰🟰🟰🟰🟰🟰🟰🟰🟰🟰🟰🟰🟰🟰🟰🟰🟰🟰🟰🟰🟰🟰🟰🟰🟰🟰🟰🟰


                    // ------------------------------- Asking User if He/She Want's to play the Game Again ---------------------------------

                    System.out.println();
                    // --------------------------------- Printing : CLICK 5 : To Continue The Game -----------------------------------------
                    System.out.println("                ❯❯ ❱ \uD835\uDC02\uD835\uDC0B\uD835\uDC08\uD835\uDC02\uD835\uDC0A \uD835\uDFD3 : " +
                            "\uD835\uDC13\uD835\uDC28 \uD835\uDC02\uD835\uDC28\uD835\uDC27\uD835\uDC2D\uD835\uDC22\uD835\uDC27\uD835" +
                            "\uDC2E\uD835\uDC1E \uD835\uDC13\uD835\uDC21\uD835\uDC1E \uD835\uDC06\uD835\uDC1A\uD835\uDC26\uD835\uDC1E  ❰ ❮❮");

                    // ---------------------------------------------------------------------------------------------------------------------

                    // -------------------------------- Printing : CLICK 6 : To Exit From Game --------------------------------------------
                    System.out.println("                ❯❯ ❱ \uD835\uDC02\uD835\uDC0B\uD835\uDC08\uD835\uDC02\uD835\uDC0A \uD835\uDFD4 : " +
                            "\uD835\uDC13\uD835\uDC28 \uD835\uDC04\uD835\uDC31\uD835\uDC22\uD835\uDC2D \uD835\uDC05\uD835\uDC2B\uD835" +
                            "\uDC28\uD835\uDC26 \uD835\uDC06\uD835\uDC1A\uD835\uDC26\uD835\uDC1E ❰ ❮❮");

                    // -------------------------------------------------------------------------------------------------------------------

                    // ------------------------------- Printing : Pick One Out Above Options : -------------------------------------------
                    System.out.println();
                    System.out.print("                  ❯❯❯❯❯ \uD835\uDDAF\uD835\uDDC2\uD835\uDDBC\uD835\uDDC4 \uD835\uDDAE\uD835\uDDC7" +
                            "\uD835\uDDBE \uD835\uDDAE\uD835\uDDCE\uD835\uDDCD \uD835\uDDA0\uD835\uDDBB\uD835\uDDC8\uD835\uDDCF" +
                            "\uD835\uDDBE \uD835\uDDAE\uD835\uDDC9\uD835\uDDCD\uD835\uDDC2\uD835\uDDC8\uD835\uDDC7\uD835\uDDCC : ");

                    int userPlayGameChoice = sc.nextInt();
                    System.out.println();
                    if (userPlayGameChoice == 5) {
                        count = 1;
                        continue;
                    } else if (userPlayGameChoice == 6) {

                        // ----------------------------- Rating that Opponent will give, to the player -------------------------------------

                        System.out.println();
                        System.out.println("            ┃ ╔════════════════════════════════════════════╗");
                        System.out.println("            ┃  ❯❯ ❱  \uD835\uDC0E\uD835\uDC0F\uD835\uDC0F\uD835\uDC0E\uD835\uDC0D" +
                                "\uD835\uDC04\uD835\uDC0D\uD835\uDC13 \uD835\uDC11\uD835\uDC04\uD835\uDC15\uD835\uDC08\uD835" +
                                "\uDC04\uD835\uDC16 :  ❰ ❮❮");
                        System.out.println("               **┃  \" \uD835\uDDB3\uD835\uDDC1\uD835\uDDBE \uD835" +
                                "\uDDB1\uD835\uDDBA\uD835\uDDCD\uD835\uDDC2\uD835" +
                                "\uDDC7\uD835\uDDC0 \uD835\uDDD0\uD835\uDDC1\uD835\uDDC2\uD835\uDDBC\uD835\uDDC1 " +
                                "\uD835\uDDAE\uD835\uDDC9\uD835\uDDC9\uD835\uDDC8\uD835\uDDC7\uD835\uDDBE\uD835\uDDC7" +
                                "\uD835\uDDCD \uD835\uDDC5\uD835\uDDC2\uD835\uDDC4\uD835\uDDBE \uD835\uDDCD\uD835\uDDC8 " +
                                "\uD835\uDDC0\uD835\uDDC2\uD835\uDDCF\uD835\uDDBE \uD835\uDDD2\uD835\uDDC8\uD835\uDDCE **");
                        System.out.println("                 ┃  \uD835\uDDC8\uD835\uDDC7 \uD835\uDDBB\uD835\uDDBE\uD835\uDDC1" +
                                "\uD835\uDDBA\uD835\uDDC5\uD835\uDDBF \uD835\uDDC8\uD835\uDDBF \uD835\uDDCD" +
                                "\uD835\uDDC1\uD835\uDDBE \uD835\uDDA6\uD835\uDDBA\uD835\uDDC6\uD835\uDDBE\uD835" +
                                "\uDDAF\uD835\uDDC5\uD835\uDDBA\uD835\uDDD2 : [ " + oppRatingToPlayer + " / 5 ] \"");
                        System.out.println("            ┃ ╚════════════════════════════════════════════╝");

//                             System.out.println("                The Rating which Opponent like to give you on behalf " +
//                                     "of the GamePlay : "+oppRatingToPlayer+"/5");

                        // ------------------------------- Saving numguess Game's Metadata To DB --------------------------------------------

                        String finalUser1 = finalUser;
                        Thread t4 = new Thread(() ->
                        {
                            int finalScoreOFDB = SavingUserDataToDB.gettingScoreOfUser(conn, "numguess"); // getting userScore from DB.
//                                 System.out.println("finalScoreOFDB : "+finalScoreOFDB);
                            int TotalFinalScore = finalScore + finalScoreOFDB;
//                                System.out.println("finalScore From line 234 : "+finalScore);

                            // --------------------- Printing the Final Scores ----------------------------------------------------------------

                            System.out.println();
                            System.out.println("             " + finalUser1 + " : ❯❯❱ \uD835\uDC12\uD835\uDC02\uD835\uDC0E\uD835"
                                    + "\uDC11\uD835\uDC04 ❰❮❮ : " + TotalFinalScore);
                            System.out.println("             Opponent : ❯❯❱ \uD835\uDC12\uD835\uDC02\uD835\uDC0E" +
                                    "\uD835\uDC11\uD835\uDC04 ❰❮❮ : " + oppFinalScore);

                            // ---------------------------------------------------------------------------------------------------------


                            String message = SavingUserDataToDB.updatingUserMetadataToDB(TotalFinalScore, oppRatingToPlayer, "numguess", conn);
                            System.out.println("                " + message);
                        }, "Thread-numguessMetaDataHandler");
                        t4.start();

                        t4.join();

                        // ---------------------------------------------------------------------------------------------------------------

                        // ---------------------------------------- Asking User if he/she wants to get rid of the System ----------------------------

                        System.out.println();

                        // ---------------------------------- Printing : ⚠ [ 𝐖𝐀𝐑𝐍𝐈𝐍𝐆: 𝐂𝐑𝐈𝐓𝐈𝐂𝐀𝐋 𝐂𝐇𝐎𝐈𝐂𝐄 ] -----------------------------

                        System.out.println("      ⚠ [ \uD835\uDC16\uD835\uDC00\uD835\uDC11\uD835\uDC0D\uD835\uDC08\uD835\uDC0D\uD835" +
                                "\uDC06: \uD835\uDC02\uD835\uDC11\uD835\uDC08\uD835\uDC13\uD835\uDC08\uD835\uDC02\uD835\uDC00" +
                                "\uD835\uDC0B \uD835\uDC02\uD835\uDC07\uD835\uDC0E\uD835\uDC08\uD835\uDC02\uD835\uDC04 ]");

                        // ----------------------------------------------------------------------------------------------------------

                        // ---------------------------- Printing : Do You Want to Get Rid of The System , if yes -----------------
                        System.out.println("       ❯❯ ❱ \uD835\uDC03\uD835\uDC28 \uD835\uDC18\uD835\uDC28\uD835\uDC2E " +
                                "\uD835\uDC16\uD835\uDC1A\uD835\uDC27\uD835\uDC2D \uD835\uDC2D\uD835\uDC28 " +
                                "\uD835\uDC06\uD835\uDC1E\uD835\uDC2D \uD835\uDC11\uD835\uDC22\uD835\uDC1D " +
                                "\uD835\uDC28\uD835\uDC1F \uD835\uDC13\uD835\uDC21\uD835\uDC1E \uD835\uDC12\uD835\uDC32" +
                                "\uD835\uDC2C\uD835\uDC2D\uD835\uDC1E\uD835\uDC26 , \uD835\uDC22\uD835\uDC1F \uD835\uDC32" +
                                "\uD835\uDC1E\uD835\uDC2C ❰ ❮❮");
                        // -------------------------------------------------------------------------------------------------------
                        System.out.println();
                        // ---------------------------- Printing : Type Y : For Account Deletion -------------------------------
                        System.out.println("             ❱ \uD835\uDC13\uD835\uDC32\uD835\uDC29\uD835\uDC1E \uD835\uDC18 : \uD835" +
                                "\uDC05\uD835\uDC28\uD835\uDC2B \uD835\uDC00\uD835\uDC1C\uD835\uDC1C\uD835\uDC28\uD835" +
                                "\uDC2E\uD835\uDC27\uD835\uDC2D \uD835\uDC03\uD835\uDC1E\uD835\uDC25\uD835\uDC1E\uD835" +
                                "\uDC2D\uD835\uDC22\uD835\uDC28\uD835\uDC27 , ❰ ");
                        // -------------------------------------------------------------------------------------------------------

                        // ---------------------------- Printing : Type N : For Be The Part of The System------------------------
                        System.out.println("             ❱ \uD835\uDC13\uD835\uDC32\uD835\uDC29\uD835\uDC1E \uD835\uDC0D : " +
                                "\uD835\uDC05\uD835\uDC28\uD835\uDC2B \uD835\uDC01\uD835\uDC1E \uD835\uDC13\uD835" +
                                "\uDC21\uD835\uDC1E \uD835\uDC0F\uD835\uDC1A\uD835\uDC2B\uD835\uDC2D \uD835\uDC28" +
                                "\uD835\uDC1F \uD835\uDC13\uD835\uDC21\uD835\uDC1E \uD835\uDC12\uD835\uDC32\uD835\uDC2C" +
                                "\uD835\uDC2D\uD835\uDC1E\uD835\uDC26 ❰");
                        // -------------------------------------------------------------------------------------------------------
                        System.out.println();
                        // ---------------------------- Printing : Enter Your Appropriate Choice : ------------------------------
                        System.out.print("                \uD835\uDC04\uD835\uDC27\uD835\uDC2D\uD835\uDC1E\uD835\uDC2B \uD835\uDC18\uD835" +
                                "\uDC28\uD835\uDC2E\uD835\uDC2B \uD835\uDC00\uD835\uDC29\uD835\uDC29\uD835\uDC2B\uD835\uDC28" +
                                "\uD835\uDC29\uD835\uDC2B\uD835\uDC22\uD835\uDC1A\uD835\uDC2D\uD835\uDC1E \uD835\uDC02\uD835" +
                                "\uDC21\uD835\uDC28\uD835\uDC22\uD835\uDC1C\uD835\uDC1E : ");
                        // -------------------------------------------------------------------------------------------------------

//                            System.out.println();
                        String userInput = sc.next();
                        String actualInput = userInput.toLowerCase();
//                            finalUser
                        if (actualInput.equals("y")) {

                            // ---------------------------------------- Printing : Enter Your Gaming Name : ----------------------------
                            System.out.print("             \uD835\uDC04\uD835\uDC27\uD835\uDC2D\uD835\uDC1E\uD835\uDC2B \uD835\uDC18" +
                                    "\uD835\uDC28\uD835\uDC2E\uD835\uDC2B \uD835\uDC06\uD835\uDC1A\uD835\uDC26\uD835\uDC22\uD835\uDC27" +
                                    "\uD835\uDC20 \uD835\uDC0D\uD835\uDC1A\uD835\uDC26\uD835\uDC1E : ");
                            // ---------------------------------------------------------------------------------------------------------

                            String gameNameOfUser = sc.next();

                            if (gameNameOfUser.equals(finalUser)) {
                                Thread t5 = new Thread(() ->
                                {
                                    SavingUserDataToDB.deleteUser(conn, gameNameOfUser);
                                });
                                t5.start();
                                t5.join();

                            } else {
                                System.out.println();
                                // -------------------------- Printing : gameNameOfUser not Recognized , User Not Found ---------------------------
                                System.err.println("         " + gameNameOfUser + " \uD835\uDC0D\uD835\uDC28\uD835\uDC2D \uD835\uDC11\uD835" +
                                        "\uDC1E\uD835\uDC1C\uD835\uDC28\uD835\uDC20\uD835\uDC27\uD835\uDC22\uD835\uDC33\uD835\uDC1E" +
                                        "\uD835\uDC1D , \uD835\uDC14\uD835\uDC2C\uD835\uDC1E\uD835\uDC2B \uD835\uDC0D\uD835\uDC28\uD835" +
                                        "\uDC2D \uD835\uDC05\uD835\uDC28\uD835\uDC2E\uD835\uDC27\uD835\uDC1D");
                                System.exit(404);
                            }

                        } else if (actualInput.equals("n")) {

                            // ------------------------------------------------------------ Kicking out the  User From Game -------------------

                            System.out.println();

                            System.out.print("Exiting");
                            for (int i = 0; i < 4; i++) {
                                System.out.print("․");
                                Thread.sleep(213);
                            }

                            System.out.print("\nExiting From");
                            for (int i = 0; i < 10; i++) {
                                System.out.print("․");
                                Thread.sleep(293);
                            }

                            String exits = "     ✖✖✖✖✖✖ \uD835\uDC04\uD835\uDC17\uD835\uDC08\uD835\uDC13\uD835\uDC04\uD835\uDC03 " +
                                    "\uD835\uDC05\uD835\uDC11\uD835\uDC0E\uD835\uDC0C " +
                                    "\uD835\uDC06\uD835\uDC00\uD835\uDC0C\uD835\uDC04 " +
                                    "\uD835\uDC12\uD835\uDC14\uD835\uDC02\uD835\uDC02\uD835\uDC04\uD835\uDC12\uD835\uDC12\uD835\uDC05" +
                                    "\uD835\uDC14\uD835\uDC0B\uD835\uDC0B\uD835\uDC18 ✖✖✖✖✖✖";

                            System.out.println();
                            System.out.println();
                            for (int i = 0; i < exits.length(); i++) {
                                System.err.print(exits.charAt(i));
                                Thread.sleep(30);
                            }

//                             System.err.println("Invalid Input Entered");
                            System.exit(400);

                            // ------------------------------------------------------------------------------------------------------------------
                        } else {
                            System.err.println("Invalid Input");
                            System.exit(413);
                        }

                        // --------------------------------------------------------------------------------------------------------------------------


// 🟰🟰🟰🟰🟰🟰🟰🟰🟰🟰🟰🟰🟰🟰🟰🟰🟰🟰🟰🟰🟰🟰🟰🟰🟰🟰🟰🟰🟰🟰🟰🟰🟰🟰🟰🟰🟰🟰🟰🟰🟰🟰🟰🟰🟰🟰🟰🟰🟰🟰🟰🟰🟰🟰🟰🟰🟰🟰🟰🟰🟰🟰🟰🟰🟰🟰🟰🟰🟰🟰🟰🟰🟰


                        return;
                    } else {
                        System.out.println("All is not Well....");
                    }
                } else {
                    System.err.println("Invalid Input Entered");
                    System.exit(415);
                }

//                System.out.println("Counter : " + count);

                if ((10 - count) == 1 || (10 - count) == 0) {
//                    System.out.println("User loose the game");
                    System.out.println("             "+finalUser + " : \uD835\uDC0B\uD835\uDC28\uD835\uDC28\uD835\uDC2C\uD835\uDC1E " +
                            "\uD835\uDC13\uD835\uDC21\uD835\uDC1E \uD835\uDC06\uD835\uDC1A\uD835\uDC26\uD835\uDC1E 😔😔😔😔😔");

                    // ------------------------ Printing : Actual Number ------------------------------------------------------
                    System.out.println("             "+"\uD835\uDDA0\uD835\uDDBC\uD835\uDDCD\uD835\uDDCE\uD835\uDDBA\uD835\uDDC5 \uD835\uDDAD\uD835" +
                            "\uDDCE\uD835\uDDC6\uD835\uDDBB\uD835\uDDBE\uD835\uDDCB : " + randNumGen);
                    // -------------------------------------------------------------------------------------------------------

                    LooserOfnumguess = finalUser;
                    finalScore -= 1;
                    user = false;

                    // ------------------------- Printing : The Current Score of Players ------------------------------------------------------
                    System.out.println();
                    System.out.println("               "+finalUser+" Got : [ "+finalScore+" ] ");
                    System.out.println("                 Opponent Got : [ "+oppFinalScore+" ]");

                    // -------------------------------------------------------------------------------------------------------------------------

// 🟰🟰🟰🟰🟰🟰🟰🟰🟰🟰🟰🟰🟰🟰🟰🟰🟰🟰🟰🟰🟰🟰🟰🟰🟰🟰🟰🟰🟰🟰🟰🟰🟰🟰🟰🟰🟰🟰🟰🟰🟰🟰🟰🟰🟰🟰🟰🟰🟰🟰🟰🟰🟰🟰🟰🟰🟰🟰🟰🟰🟰🟰🟰🟰🟰🟰🟰🟰🟰🟰🟰🟰🟰


                    // ------------------------------- Asking User if He/She Want's to play the Game Again ---------------------------------

                    System.out.println();
                    // --------------------------------- Printing : CLICK 5 : To Continue The Game -----------------------------------------
                    System.out.println("                ❯❯ ❱ \uD835\uDC02\uD835\uDC0B\uD835\uDC08\uD835\uDC02\uD835\uDC0A \uD835\uDFD3 : " +
                            "\uD835\uDC13\uD835\uDC28 \uD835\uDC02\uD835\uDC28\uD835\uDC27\uD835\uDC2D\uD835\uDC22\uD835\uDC27\uD835" +
                            "\uDC2E\uD835\uDC1E \uD835\uDC13\uD835\uDC21\uD835\uDC1E \uD835\uDC06\uD835\uDC1A\uD835\uDC26\uD835\uDC1E  ❰ ❮❮");

                    // ---------------------------------------------------------------------------------------------------------------------

                    // -------------------------------- Printing : CLICK 6 : To Exit From Game --------------------------------------------
                    System.out.println("                ❯❯ ❱ \uD835\uDC02\uD835\uDC0B\uD835\uDC08\uD835\uDC02\uD835\uDC0A \uD835\uDFD4 : " +
                            "\uD835\uDC13\uD835\uDC28 \uD835\uDC04\uD835\uDC31\uD835\uDC22\uD835\uDC2D \uD835\uDC05\uD835\uDC2B\uD835" +
                            "\uDC28\uD835\uDC26 \uD835\uDC06\uD835\uDC1A\uD835\uDC26\uD835\uDC1E ❰ ❮❮");

                    // -------------------------------------------------------------------------------------------------------------------

                    // ------------------------------- Printing : Pick One Out Above Options : -------------------------------------------
                    System.out.println();
                    System.out.print("                  ❯❯❯❯❯ \uD835\uDDAF\uD835\uDDC2\uD835\uDDBC\uD835\uDDC4 \uD835\uDDAE\uD835\uDDC7" +
                            "\uD835\uDDBE \uD835\uDDAE\uD835\uDDCE\uD835\uDDCD \uD835\uDDA0\uD835\uDDBB\uD835\uDDC8\uD835\uDDCF" +
                            "\uD835\uDDBE \uD835\uDDAE\uD835\uDDC9\uD835\uDDCD\uD835\uDDC2\uD835\uDDC8\uD835\uDDC7\uD835\uDDCC : ");

                    int userPlayGameChoice = sc.nextInt();
                    System.out.println();
                    if (userPlayGameChoice == 5) {
                        count = 1;
                        continue;
                    } else if (userPlayGameChoice == 6) {

                        // ----------------------------- Rating that Opponent will give, to the player -------------------------------------

                        System.out.println();
                        System.out.println("            ┃ ╔════════════════════════════════════════════╗");
                        System.out.println("            ┃  ❯❯ ❱  \uD835\uDC0E\uD835\uDC0F\uD835\uDC0F\uD835\uDC0E\uD835\uDC0D" +
                                "\uD835\uDC04\uD835\uDC0D\uD835\uDC13 \uD835\uDC11\uD835\uDC04\uD835\uDC15\uD835\uDC08\uD835" +
                                "\uDC04\uD835\uDC16 :  ❰ ❮❮");
                        System.out.println("               **┃  \" \uD835\uDDB3\uD835\uDDC1\uD835\uDDBE \uD835" +
                                "\uDDB1\uD835\uDDBA\uD835\uDDCD\uD835\uDDC2\uD835" +
                                "\uDDC7\uD835\uDDC0 \uD835\uDDD0\uD835\uDDC1\uD835\uDDC2\uD835\uDDBC\uD835\uDDC1 " +
                                "\uD835\uDDAE\uD835\uDDC9\uD835\uDDC9\uD835\uDDC8\uD835\uDDC7\uD835\uDDBE\uD835\uDDC7" +
                                "\uD835\uDDCD \uD835\uDDC5\uD835\uDDC2\uD835\uDDC4\uD835\uDDBE \uD835\uDDCD\uD835\uDDC8 " +
                                "\uD835\uDDC0\uD835\uDDC2\uD835\uDDCF\uD835\uDDBE \uD835\uDDD2\uD835\uDDC8\uD835\uDDCE **");
                        System.out.println("                 ┃  \uD835\uDDC8\uD835\uDDC7 \uD835\uDDBB\uD835\uDDBE\uD835\uDDC1" +
                                "\uD835\uDDBA\uD835\uDDC5\uD835\uDDBF \uD835\uDDC8\uD835\uDDBF \uD835\uDDCD" +
                                "\uD835\uDDC1\uD835\uDDBE \uD835\uDDA6\uD835\uDDBA\uD835\uDDC6\uD835\uDDBE\uD835" +
                                "\uDDAF\uD835\uDDC5\uD835\uDDBA\uD835\uDDD2 : [ " + oppRatingToPlayer + " / 5 ] \"");
                        System.out.println("            ┃ ╚════════════════════════════════════════════╝");

//                             System.out.println("                The Rating which Opponent like to give you on behalf " +
//                                     "of the GamePlay : "+oppRatingToPlayer+"/5");

                        // ------------------------------- Saving numguess Game's Metadata To DB --------------------------------------------

                        String finalUser1 = finalUser;
                        Thread t4 = new Thread(() ->
                        {
                            int finalScoreOFDB = SavingUserDataToDB.gettingScoreOfUser(conn, "numguess"); // getting userScore from DB.
//                                 System.out.println("finalScoreOFDB : "+finalScoreOFDB);
                            int TotalFinalScore = finalScore + finalScoreOFDB;
//                                System.out.println("finalScore From line 234 : "+finalScore);

                            // --------------------- Printing the Final Scores ----------------------------------------------------------------

                            System.out.println();
                            System.out.println("             " + finalUser1 + " : ❯❯❱ \uD835\uDC12\uD835\uDC02\uD835\uDC0E\uD835"
                                    + "\uDC11\uD835\uDC04 ❰❮❮ : " + TotalFinalScore);
                            System.out.println("             Opponent : ❯❯❱ \uD835\uDC12\uD835\uDC02\uD835\uDC0E" +
                                    "\uD835\uDC11\uD835\uDC04 ❰❮❮ : " + oppFinalScore);

                            // ---------------------------------------------------------------------------------------------------------


                            String message = SavingUserDataToDB.updatingUserMetadataToDB(TotalFinalScore, oppRatingToPlayer, "numguess", conn);
                            System.out.println("                " + message);
                        }, "Thread-numguessMetaDataHandler");
                        t4.start();

                        t4.join();

                        // ---------------------------------------------------------------------------------------------------------------

                        // ---------------------------------------- Asking User if he/she wants to get rid of the System ----------------------------

                        System.out.println();

                        // ---------------------------------- Printing : ⚠ [ 𝐖𝐀𝐑𝐍𝐈𝐍𝐆: 𝐂𝐑𝐈𝐓𝐈𝐂𝐀𝐋 𝐂𝐇𝐎𝐈𝐂𝐄 ] -----------------------------

                        System.out.println("      ⚠ [ \uD835\uDC16\uD835\uDC00\uD835\uDC11\uD835\uDC0D\uD835\uDC08\uD835\uDC0D\uD835" +
                                "\uDC06: \uD835\uDC02\uD835\uDC11\uD835\uDC08\uD835\uDC13\uD835\uDC08\uD835\uDC02\uD835\uDC00" +
                                "\uD835\uDC0B \uD835\uDC02\uD835\uDC07\uD835\uDC0E\uD835\uDC08\uD835\uDC02\uD835\uDC04 ]");

                        // ----------------------------------------------------------------------------------------------------------

                        // ---------------------------- Printing : Do You Want to Get Rid of The System , if yes -----------------
                        System.out.println("       ❯❯ ❱ \uD835\uDC03\uD835\uDC28 \uD835\uDC18\uD835\uDC28\uD835\uDC2E " +
                                "\uD835\uDC16\uD835\uDC1A\uD835\uDC27\uD835\uDC2D \uD835\uDC2D\uD835\uDC28 " +
                                "\uD835\uDC06\uD835\uDC1E\uD835\uDC2D \uD835\uDC11\uD835\uDC22\uD835\uDC1D " +
                                "\uD835\uDC28\uD835\uDC1F \uD835\uDC13\uD835\uDC21\uD835\uDC1E \uD835\uDC12\uD835\uDC32" +
                                "\uD835\uDC2C\uD835\uDC2D\uD835\uDC1E\uD835\uDC26 , \uD835\uDC22\uD835\uDC1F \uD835\uDC32" +
                                "\uD835\uDC1E\uD835\uDC2C ❰ ❮❮");
                        // -------------------------------------------------------------------------------------------------------
                        System.out.println();
                        // ---------------------------- Printing : Type Y : For Account Deletion -------------------------------
                        System.out.println("             ❱ \uD835\uDC13\uD835\uDC32\uD835\uDC29\uD835\uDC1E \uD835\uDC18 : \uD835" +
                                "\uDC05\uD835\uDC28\uD835\uDC2B \uD835\uDC00\uD835\uDC1C\uD835\uDC1C\uD835\uDC28\uD835" +
                                "\uDC2E\uD835\uDC27\uD835\uDC2D \uD835\uDC03\uD835\uDC1E\uD835\uDC25\uD835\uDC1E\uD835" +
                                "\uDC2D\uD835\uDC22\uD835\uDC28\uD835\uDC27 , ❰ ");
                        // -------------------------------------------------------------------------------------------------------

                        // ---------------------------- Printing : Type N : For Be The Part of The System------------------------
                        System.out.println("             ❱ \uD835\uDC13\uD835\uDC32\uD835\uDC29\uD835\uDC1E \uD835\uDC0D : " +
                                "\uD835\uDC05\uD835\uDC28\uD835\uDC2B \uD835\uDC01\uD835\uDC1E \uD835\uDC13\uD835" +
                                "\uDC21\uD835\uDC1E \uD835\uDC0F\uD835\uDC1A\uD835\uDC2B\uD835\uDC2D \uD835\uDC28" +
                                "\uD835\uDC1F \uD835\uDC13\uD835\uDC21\uD835\uDC1E \uD835\uDC12\uD835\uDC32\uD835\uDC2C" +
                                "\uD835\uDC2D\uD835\uDC1E\uD835\uDC26 ❰");
                        // -------------------------------------------------------------------------------------------------------
                        System.out.println();
                        // ---------------------------- Printing : Enter Your Appropriate Choice : ------------------------------
                        System.out.print("                \uD835\uDC04\uD835\uDC27\uD835\uDC2D\uD835\uDC1E\uD835\uDC2B \uD835\uDC18\uD835" +
                                "\uDC28\uD835\uDC2E\uD835\uDC2B \uD835\uDC00\uD835\uDC29\uD835\uDC29\uD835\uDC2B\uD835\uDC28" +
                                "\uD835\uDC29\uD835\uDC2B\uD835\uDC22\uD835\uDC1A\uD835\uDC2D\uD835\uDC1E \uD835\uDC02\uD835" +
                                "\uDC21\uD835\uDC28\uD835\uDC22\uD835\uDC1C\uD835\uDC1E : ");
                        // -------------------------------------------------------------------------------------------------------

//                            System.out.println();
                        String userInput = sc.next();
                        String actualInput = userInput.toLowerCase();
//                            finalUser
                        if (actualInput.equals("y")) {

                            // ---------------------------------------- Printing : Enter Your Gaming Name : ----------------------------
                            System.out.print("             \uD835\uDC04\uD835\uDC27\uD835\uDC2D\uD835\uDC1E\uD835\uDC2B \uD835\uDC18" +
                                    "\uD835\uDC28\uD835\uDC2E\uD835\uDC2B \uD835\uDC06\uD835\uDC1A\uD835\uDC26\uD835\uDC22\uD835\uDC27" +
                                    "\uD835\uDC20 \uD835\uDC0D\uD835\uDC1A\uD835\uDC26\uD835\uDC1E : ");
                            // ---------------------------------------------------------------------------------------------------------

                            String gameNameOfUser = sc.next();

                            if (gameNameOfUser.equals(finalUser)) {
                                Thread t5 = new Thread(() ->
                                {
                                    SavingUserDataToDB.deleteUser(conn, gameNameOfUser);
                                });
                                t5.start();
                                t5.join();

                            } else {
                                System.out.println();
                                // -------------------------- Printing : gameNameOfUser not Recognized , User Not Found ---------------------------
                                System.err.println("         " + gameNameOfUser + " \uD835\uDC0D\uD835\uDC28\uD835\uDC2D \uD835\uDC11\uD835" +
                                        "\uDC1E\uD835\uDC1C\uD835\uDC28\uD835\uDC20\uD835\uDC27\uD835\uDC22\uD835\uDC33\uD835\uDC1E" +
                                        "\uD835\uDC1D , \uD835\uDC14\uD835\uDC2C\uD835\uDC1E\uD835\uDC2B \uD835\uDC0D\uD835\uDC28\uD835" +
                                        "\uDC2D \uD835\uDC05\uD835\uDC28\uD835\uDC2E\uD835\uDC27\uD835\uDC1D");
                                System.exit(404);
                            }

                        } else if (actualInput.equals("n")) {

                            // ------------------------------------------------------------ Kicking out the  User From Game -------------------

                            System.out.println();

                            System.out.print("Exiting");
                            for (int i = 0; i < 4; i++) {
                                System.out.print("․");
                                Thread.sleep(213);
                            }

                            System.out.print("\nExiting From");
                            for (int i = 0; i < 10; i++) {
                                System.out.print("․");
                                Thread.sleep(293);
                            }

                            String exits = "     ✖✖✖✖✖✖ \uD835\uDC04\uD835\uDC17\uD835\uDC08\uD835\uDC13\uD835\uDC04\uD835\uDC03 " +
                                    "\uD835\uDC05\uD835\uDC11\uD835\uDC0E\uD835\uDC0C " +
                                    "\uD835\uDC06\uD835\uDC00\uD835\uDC0C\uD835\uDC04 " +
                                    "\uD835\uDC12\uD835\uDC14\uD835\uDC02\uD835\uDC02\uD835\uDC04\uD835\uDC12\uD835\uDC12\uD835\uDC05" +
                                    "\uD835\uDC14\uD835\uDC0B\uD835\uDC0B\uD835\uDC18 ✖✖✖✖✖✖";

                            System.out.println();
                            System.out.println();
                            for (int i = 0; i < exits.length(); i++) {
                                System.err.print(exits.charAt(i));
                                Thread.sleep(30);
                            }

//                             System.err.println("Invalid Input Entered");
                            System.exit(400);

                            // ------------------------------------------------------------------------------------------------------------------
                        } else {
                            System.err.println("Invalid Input");
                            System.exit(413);
                        }

                        // --------------------------------------------------------------------------------------------------------------------------


// 🟰🟰🟰🟰🟰🟰🟰🟰🟰🟰🟰🟰🟰🟰🟰🟰🟰🟰🟰🟰🟰🟰🟰🟰🟰🟰🟰🟰🟰🟰🟰🟰🟰🟰🟰🟰🟰🟰🟰🟰🟰🟰🟰🟰🟰🟰🟰🟰🟰🟰🟰🟰🟰🟰🟰🟰🟰🟰🟰🟰🟰🟰🟰🟰🟰🟰🟰🟰🟰🟰🟰🟰🟰


                    } else {
                        System.out.println();
                    }
                    count++;

                }

                count++;
                // -----------------------------------------------------------------------------------------------------------------------------------
            }
        }
    }
}