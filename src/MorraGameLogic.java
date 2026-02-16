import java.sql.Connection;
import java.util.Scanner;

public class MorraGameLogic {
    public static int finalScore = 0;
    public static String winnerOfMorra = null;
    public static String LooserOfMorra = null;
    public static boolean opponent = false;
    public static boolean user = false;
    public static int oppFinalScore = 0;

    public static void morraLogic(String userName, Connection conn) throws InterruptedException {
        Scanner sc = new Scanner(System.in);
//         int finalScore = 0;
//         String winnerOfMorra = null;
//         String LooserOfMorra = null;

        int min = 1;
        int max = 5;
        int OpponentFingCounts = 0;

        int min1To10 = 1;
        int max1tO10 = 10;
        int OpponentCount = (int) (Math.floor(Math.random() * (max1tO10 - min1To10 + 1) + min1To10)); /* by default it starts from 0.0 to 0.999 , the floor
         also will give 0.0 double , that's why we typecasting it to "int"*/

        // ------------------------------------ Opponent is picking it's favourite rating to give to the player -------------------------------

        double[] arr = {1.0, 1.1, 1.2, 1.3, 1.4, 1.5, 1.6, 1.7, 1.8, 1.9, 2.0, 2.1, 2.2, 2.3, 2.4, 2.5, 2.6, 2.7, 2.8, 2.9, 3.0, 3.1,
                3.2, 3.3, 3.4, 3.5, 3.6, 3.7, 3.8, 3.9, 4.0, 4.1, 4.2, 4.3, 4.5, 4.6, 4.7, 4.8, 4.9, 5.0};

        double minRating = 0;
        double maxRating = arr.length - 1;

        int oppRTP = (int) Math.floor(Math.random() * (maxRating - minRating + 1) + minRating);
        double oppRatingToPlayer = arr[oppRTP];
//        System.out.println("oppRatingToPlayer : "+oppRatingToPlayer);

        // -----------------------------------------------------------------------------------------------------------------------------------

        // ----------------------------------------------- Newly created user Vs Already Existed User -----------------------------------------

        String finalUser = null;
        String newUser = SavingUserDataToDB.newlyCreatedUser;

        if (userName.length() == 0) {
            finalUser = newUser;
        } else {
            finalUser = userName;
        }

//        System.out.println(finalUser);
//        System.out.println("newUser from Morra : "+newUser);

        // ------------------------------------------------------------------------------------------------------------------------------------

        System.out.println();

        while (opponent != true || user != true) {
//             System.out.println("Current User from DB (Morra) :- "+userName);
//             System.out.println("length of user stored in DB(Morra) :- "+userName.length());

            int OpponentFingCount = (int) (Math.floor(Math.random() * (max - min + 1) + min)); /* by default it starts from 0.0 to 0.999 , the floor
         also will give 0.0 double , that's why we typecasting it to "int"*/

            OpponentFingCounts += OpponentFingCount;

            // ------------------------------- Printing : User's Turn ----------------------------------------------------------

            System.out.println("            " + finalUser + " : ◈ ——— [ \uD835\uDDB3\uD835\uDDB4\uD835\uDDB1\uD835\uDDAD \uD835\uDDA5\uD835" +
                    "\uDDA8\uD835\uDDB1\uD835\uDDB2\uD835\uDDB3 ] ——— ◈ ");

            // ------------------------------------------------------------------------------------------------------------------

            // Printing ------  𝖳𝖺𝗄𝖾 𝗈𝗎𝗍 𝖺𝗇𝗒 𝗇𝗎𝗆𝖻𝖾𝗋 𝗈𝖿 𝖿𝗂𝗇𝗀𝖾𝗋𝗌 𝖿𝗋𝗈𝗆 𝗍𝗁𝖾 𝖿𝗂𝗏𝖾 𝖿𝗂𝗇𝗀𝖾𝗋𝗌 𝗈𝖿 𝗈𝗇𝖾 𝗁𝖺𝗇𝖽 𝖻𝗎𝗍 𝗂𝗍 𝗌𝗁𝗈𝗎𝗅𝖽 𝗍𝗁𝖺𝗇 𝗈𝗋 𝖾𝗊𝗎𝖺𝗅 𝗍𝗈 𝟧.---------------------------

            System.out.print("            " + finalUser + " : \uD835\uDDB3\uD835\uDDBA\uD835\uDDC4\uD835\uDDBE \uD835\uDDC8\uD835" +
                    "\uDDCE\uD835\uDDCD \uD835\uDDBA\uD835\uDDC7\uD835\uDDD2 \uD835\uDDC7\uD835\uDDCE\uD835\uDDC6\uD835\uDDBB" +
                    "\uD835\uDDBE\uD835\uDDCB \uD835\uDDC8\uD835\uDDBF \uD835\uDDBF\uD835\uDDC2\uD835\uDDC7\uD835\uDDC0\uD835" +
                    "\uDDBE\uD835\uDDCB\uD835\uDDCC \uD835\uDDBF\uD835\uDDCB\uD835\uDDC8\uD835\uDDC6 \uD835\uDDCD\uD835\uDDC1" +
                    "\uD835\uDDBE \uD835\uDDBF\uD835\uDDC2\uD835\uDDCF\uD835\uDDBE \uD835\uDDBF\uD835\uDDC2\uD835\uDDC7\uD835" +
                    "\uDDC0\uD835\uDDBE\uD835\uDDCB\uD835\uDDCC \uD835\uDDC8\uD835\uDDBF \uD835\uDDC8\uD835\uDDC7\uD835\uDDBE " +
                    "\uD835\uDDC1\uD835\uDDBA\uD835\uDDC7\uD835\uDDBD \uD835\uDDBB\uD835\uDDCE\uD835\uDDCD \uD835\uDDC2\uD835" +
                    "\uDDCD \uD835\uDDCC\uD835\uDDC1\uD835\uDDC8\uD835\uDDCE\uD835\uDDC5\uD835\uDDBD \uD835\uDDCD\uD835\uDDC1" +
                    "\uD835\uDDBA\uD835\uDDC7 \uD835\uDDC8\uD835\uDDCB \uD835\uDDBE\uD835\uDDCA\uD835\uDDCE\uD835\uDDBA\uD835" +
                    "\uDDC5 \uD835\uDDCD\uD835\uDDC8 \uD835\uDFE7 : ");
            int userChoice = sc.nextInt();
            if (userChoice >= 1 && userChoice <= 5) {
                // -------------------------------------------- Printing : Choose a number between 1 to 10 -----------------------------------

                System.out.print("            " + finalUser + " : \uD835\uDDA2\uD835\uDDC1\uD835\uDDC8\uD835\uDDC8\uD835\uDDCC\uD835\uDDBE " +
                        "\uD835\uDDBA \uD835\uDDC7\uD835\uDDCE\uD835\uDDC6\uD835\uDDBB\uD835\uDDBE\uD835\uDDCB \uD835\uDDBB\uD835\uDDBE" +
                        "\uD835\uDDCD\uD835\uDDD0\uD835\uDDBE\uD835\uDDBE\uD835\uDDC7 \uD835\uDFE3 \uD835\uDDCD\uD835\uDDC8 \uD835\uDFE3" +
                        "\uD835\uDFE2 : ");

                // ----------------------------------------------------------------------------------------------------------------------------

                int userNumChoice = sc.nextInt();
                if (userNumChoice >= 1 && userNumChoice <= 10) {
                    System.out.println("            Everything is going well");
                    System.out.println();
                    System.out.println("            Opponent's : ◈ ——— [ \uD835\uDDB3\uD835\uDDB4\uD835\uDDB1\uD835\uDDAD \uD835" +
                            "\uDDB2\uD835\uDDA4\uD835\uDDA2\uD835\uDDAE\uD835\uDDAD\uD835\uDDA3 ] ——— ◈");
                    Thread.sleep(400);

                    // Printing ------  𝖳𝖺𝗄𝖾 𝗈𝗎𝗍 𝖺𝗇𝗒 𝗇𝗎𝗆𝖻𝖾𝗋 𝗈𝖿 𝖿𝗂𝗇𝗀𝖾𝗋𝗌 𝖿𝗋𝗈𝗆 𝗍𝗁𝖾 𝖿𝗂𝗏𝖾 𝖿𝗂𝗇𝗀𝖾𝗋𝗌 𝗈𝖿 𝗈𝗇𝖾 𝗁𝖺𝗇𝖽 𝖻𝗎𝗍 𝗂𝗍 𝗌𝗁𝗈𝗎𝗅𝖽 𝗍𝗁𝖺𝗇 𝗈𝗋 𝖾𝗊𝗎𝖺𝗅 𝗍𝗈 𝟧.---------------------------

                    System.out.println("            Opponent : \uD835\uDDB3\uD835\uDDBA\uD835\uDDC4\uD835\uDDBE \uD835\uDDC8\uD835\uDDCE" +
                            "\uD835\uDDCD \uD835\uDDBA\uD835\uDDC7\uD835\uDDD2 \uD835\uDDC7\uD835\uDDCE\uD835\uDDC6\uD835\uDDBB\uD835" +
                            "\uDDBE\uD835\uDDCB \uD835\uDDC8\uD835\uDDBF \uD835\uDDBF\uD835\uDDC2\uD835\uDDC7\uD835\uDDC0\uD835\uDDBE" +
                            "\uD835\uDDCB\uD835\uDDCC \uD835\uDDBF\uD835\uDDCB\uD835\uDDC8\uD835\uDDC6 \uD835\uDDCD\uD835\uDDC1\uD835" +
                            "\uDDBE \uD835\uDDBF\uD835\uDDC2\uD835\uDDCF\uD835\uDDBE \uD835\uDDBF\uD835\uDDC2\uD835\uDDC7\uD835\uDDC0" +
                            "\uD835\uDDBE\uD835\uDDCB\uD835\uDDCC \uD835\uDDC8\uD835\uDDBF \uD835\uDDC8\uD835\uDDC7\uD835\uDDBE \uD835" +
                            "\uDDC1\uD835\uDDBA\uD835\uDDC7\uD835\uDDBD \uD835\uDDBB\uD835\uDDCE\uD835\uDDCD \uD835\uDDC2\uD835\uDDCD " +
                            "\uD835\uDDCC\uD835\uDDC1\uD835\uDDC8\uD835\uDDCE\uD835\uDDC5\uD835\uDDBD \uD835\uDDCD\uD835\uDDC1\uD835\uDDBA" +
                            "\uD835\uDDC7 \uD835\uDDC8\uD835\uDDCB \uD835\uDDBE\uD835\uDDCA\uD835\uDDCE\uD835\uDDBA\uD835\uDDC5 \uD835\uDDCD" +
                            "\uD835\uDDC8 \uD835\uDFE7 : " + OpponentFingCount);

                    // --------------------------------------------------------------------------------------------------------------------------

                    // -------------------------------------------- Printing : Choose a number between 1 to 10 -----------------------------------

                    Thread.sleep(400);

                    System.out.print("            " + "Opponent" + " : \uD835\uDDA2\uD835\uDDC1\uD835\uDDC8\uD835\uDDC8\uD835\uDDCC\uD835\uDDBE " +
                            "\uD835\uDDBA \uD835\uDDC7\uD835\uDDCE\uD835\uDDC6\uD835\uDDBB\uD835\uDDBE\uD835\uDDCB \uD835\uDDBB\uD835\uDDBE" +
                            "\uD835\uDDCD\uD835\uDDD0\uD835\uDDBE\uD835\uDDBE\uD835\uDDC7 \uD835\uDFE3 \uD835\uDDCD\uD835\uDDC8 \uD835\uDFE3" +
                            "\uD835\uDFE2 : " + OpponentCount);
                    System.out.println();
                    // ----------------------------------- deciding who is the winner ------------------------------------------------------
                    if (userChoice + OpponentFingCount == userNumChoice && OpponentFingCount + userChoice != OpponentCount) {
                        winnerOfMorra = finalUser;
                        LooserOfMorra = "Opponent";
                        finalScore += 1;
                        oppFinalScore -= 1;
                        user = true;
                        System.out.println();
                        System.out.println("                " + finalUser + " : \uD835\uDC16\uD835\uDC0E\uD835\uDC0D \uD835\uDC13\uD835\uDC07" +
                                "\uD835\uDC04 " +
                                "\uD835\uDC06\uD835\uDC00\uD835\uDC0C\uD835\uDC04 🎉🎉🎉🎉🎉🎉🎊🎊🎊🎊");
                        System.out.println("                Opponent : ║ ⊗ [ \uD835\uDC0B\uD835\uDC0E\uD835\uDC0E\uD835\uDC12\uD835\uDC04 " +
                                "\uD835\uDC13\uD835\uDC07\uD835\uDC04 \uD835\uDC06\uD835\uDC00\uD835\uDC0C\uD835\uDC04 ] ⊗ ║ 😔😔🥺🥺😞😞");

                        // ------------------------- Printing : The Current Score of Players ------------------------------------------------------
                        System.out.println();
                        System.out.println("               "+finalUser+" Got : [ "+finalScore+" ] ");
                        System.out.println("                 Opponent Got : [ "+oppFinalScore+" ]");

                        //


// -------------------------------------------------------------------------------------------------------------------------------------------------

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

                            // ------------------------------- Saving Morra Game's Metadata To DB --------------------------------------------

                            String finalUser1 = finalUser;
                            Thread t4 = new Thread(() ->
                            {
                                int finalScoreOFDB = SavingUserDataToDB.gettingScoreOfUser(conn, "morra"); // getting userScore from DB.
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


                                String message = SavingUserDataToDB.updatingUserMetadataToDB(TotalFinalScore, oppRatingToPlayer, "morra", conn);
                                System.out.println("                " + message);
                            }, "Thread-morraMetaDataHandler");
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

                                if(gameNameOfUser.equals(finalUser))
                                {
                                    Thread t5 = new Thread(() ->
                                    {
                                        SavingUserDataToDB.deleteUser(conn,gameNameOfUser);
                                    });
                                    t5.start();
                                    t5.join();

                                }
                                else
                                {
                                    System.out.println();
                                    // -------------------------- Printing : gameNameOfUser not Recognized , User Not Found ---------------------------
                                    System.err.println("         "+gameNameOfUser+" \uD835\uDC0D\uD835\uDC28\uD835\uDC2D \uD835\uDC11\uD835" +
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

                        } else {
                            System.err.println("Invalid Input Entered");
                            System.exit(400);

                        }

// -------------------------------------------------------------------------------------------------------------------------------------------------


                        // ---------------------------------------------------------------------------------------------------------------------

                        return;
                    } else if (OpponentFingCount + userChoice == OpponentCount && userChoice + OpponentFingCount != userNumChoice) {
                        winnerOfMorra = "Opponent";
                        LooserOfMorra = finalUser;
                        int scoreFromDb = SavingUserDataToDB.gettingScoreOfUser(conn, "morra");
                        oppFinalScore += 1;
                        if (scoreFromDb == 0) {
                            finalScore += 0;
                        } else {
                            finalScore -= 1;
                        }
                        opponent = true;
                        System.out.println();
                        System.out.println("                 Opponent : \uD835\uDC16\uD835\uDC0E\uD835\uDC0D \uD835\uDC13\uD835\uDC07\uD835\uDC04 " +
                                "\uD835\uDC06\uD835\uDC00\uD835\uDC0C\uD835\uDC04 🎉🎉🎉🎉🎉🎉🎊🎊🎊🎊");
                        System.out.println("                 " + finalUser + " : ║ ⊗ [ \uD835\uDC0B\uD835\uDC0E\uD835\uDC0E\uD835\uDC12\uD835\uDC04 " +
                                "\uD835\uDC13\uD835\uDC07\uD835\uDC04 \uD835\uDC06\uD835\uDC00\uD835\uDC0C\uD835\uDC04 ] ⊗ ║ 😔😔🥺🥺😞😞");


                        // ------------------------- Printing : The Current Score of Players ------------------------------------------------------
                        System.out.println();
                        System.out.println("               "+finalUser+" Got : [ "+finalScore+" ] ");
                        System.out.println("                 Opponent Got : [ "+oppFinalScore+" ]");

                        //





// -------------------------------------------------------------------------------------------------------------------------------------------

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

                        if (userPlayGameChoice == 5)
                        {
                            continue;
                        }

                        else if (userPlayGameChoice == 6) {
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

                            // ------------------------------- Saving Morra Game's Metadata To DB --------------------------------------------

                            String finalUser2 = finalUser;
                            Thread t4 = new Thread(() ->
                            {
                                int finalScoreOFDB = SavingUserDataToDB.gettingScoreOfUser(conn, "morra"); // getting userScore from DB.
//                                 System.out.println("finalScoreOFDB : "+finalScoreOFDB);
                                int TotalFinalScore = finalScore + finalScoreOFDB;


                                // --------------------- Printing the Scores ----------------------------------------------------------------

                                System.out.println();
                                System.out.println("             " + finalUser2 + " : ❯❯❱ \uD835\uDC12\uD835\uDC02\uD835\uDC0E\uD835"
                                        + "\uDC11\uD835\uDC04 ❰❮❮ : " + TotalFinalScore);
                                System.out.println("             Opponent : ❯❯❱ \uD835\uDC12\uD835\uDC02\uD835\uDC0E" +
                                        "\uD835\uDC11\uD835\uDC04 ❰❮❮ : " + oppFinalScore);

                                // ---------------------------------------------------------------------------------------------------------


                                String message = SavingUserDataToDB.updatingUserMetadataToDB(TotalFinalScore, oppRatingToPlayer, "morra", conn);
                                System.out.println("                " + message);
                            }, "Thread-morraMetaDataHandler");
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

                                if(gameNameOfUser.equals(finalUser) && gameNameOfUser instanceof String)
                                {
                                    Thread t5 = new Thread(() ->
                                    {
                                        SavingUserDataToDB.deleteUser(conn,gameNameOfUser);
                                    });
                                    t5.start();
                                    t5.join();

                                }
                                else
                                {
                                    System.out.println();
                                    // -------------------------- Printing : gameNameOfUser not Recognized , User Not Found ---------------------------
                                    System.err.println("         "+gameNameOfUser+" \uD835\uDC0D\uD835\uDC28\uD835\uDC2D \uD835\uDC11\uD835" +
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

                        } else {
                            System.err.println("Invalid Input Entered");
                            System.exit(400);

                        }

// ------------------------------------------------------------------------------------------------------------------------------------------------
                    }

                    // Not able to return multiple values in java

                    // --------------------------------------------------------------------------------------------------------------------

                    else {

                        // --------------------------------------------- Match DRAW ------------------------------------------------------

                        System.out.println();
                        System.out.println("            ╳ ▬▬▬▬▬▬ [ \uD835\uDDAC\uD835\uDDA0\uD835\uDDB3\uD835\uDDA2\uD835\uDDA7 " +
                                "\uD835\uDDA3\uD835" +
                                "\uDDB1\uD835\uDDA0\uD835\uDDB6 ] ▬▬▬▬▬▬ ╳");
                        System.out.println();
                        continue;

                        // --------------------------------------------------------------------------------------------------------------
                    }

                    // ----------------------------------------------------------------------------------------------------------------------------
                } else {
                    System.err.println("Invalid Number Entered");
                    break;
                }

            } else {
                System.err.println("Invalid Number Entered");
                break;
            }


        }
    }
}
