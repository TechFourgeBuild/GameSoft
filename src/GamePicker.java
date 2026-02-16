import java.sql.Connection;
import java.util.Scanner;

public class GamePicker extends Thread {

    // ---------------------------------------- Code For Animation when the Game is about to Load --------------------------------
    public static void pickGame(int fav, String userNameOfDB, Connection conn)  {
        try {

            Scanner sc = new Scanner(System.in);

            // ----------------------------- Call another class method to get the OG's of the GameSoft --------------------------------
            Thread t4 = new Thread(() ->
            {
//                System.out.println("userName for actual : "+userNameOfDB);
                ActualOgPicker.OGPicker(conn, userNameOfDB);
            });

            t4.start();
            t4.join();
            // ------------------------------------------------------------------------------------------------------------------------


            // ---------------------------- String of the name of Game along with emojis that'll be displayed in front of User -------------------

//        System.out.println(Thread.currentThread().getName()+ " : Arrived Successfully to pick the game");
            String firstGame = " 🫵🫵🫵🫵🫵 \uD835\uDD50\uD835\uDD46\uD835\uDD4Cℝ ℙ\uD835\uDD40ℂ\uD835\uDD42: " +
                    "「\uD835\uDFD9」 ≫ \uD835\uDD38ℂ\uD835\uDD4B\uD835\uDD40\uD835\uDD4D\uD835\uDD38\uD835\uDD4B\uD835\uDD40ℕ\uD835\uDD3E: " +
                    "\uD835\uDD44\uD835\uDD46ℝℝ\uD835\uDD38 🫵🫵🫵🫵🫵 ";

            String secondGame = " 🫵🫵🫵🫵🫵 \uD835\uDD50\uD835\uDD46\uD835\uDD4Cℝ ℙ\uD835\uDD40ℂ\uD835\uDD42: 「\uD835\uDFDA」 ≫ " +
                    "\uD835\uDD38ℂ\uD835\uDD4B\uD835\uDD40\uD835\uDD4D\uD835\uDD38\uD835\uDD4B\uD835\uDD40ℕ\uD835\uDD3E: " +
                    "ℝ\uD835\uDD46ℂ\uD835\uDD42 ℙ\uD835\uDD38ℙ\uD835\uDD3Cℝ \uD835\uDD4Aℂ\uD835\uDD40\uD835\uDD4A\uD835\uDD4A\uD835\uDD46ℝ 🫵🫵🫵🫵🫵 ";

            String thirdGame = " 🫵🫵🫵🫵🫵 \uD835\uDD50\uD835\uDD46\uD835\uDD4Cℝ ℙ\uD835\uDD40ℂ\uD835\uDD42: 「\uD835\uDFDB」 ≫ " +
                    "\uD835\uDD38ℂ\uD835\uDD4B\uD835\uDD40\uD835\uDD4D\uD835\uDD38\uD835\uDD4B\uD835\uDD40ℕ\uD835\uDD3E: " +
                    "ℕ\uD835\uDD4C\uD835\uDD44\uD835\uDD39\uD835\uDD3Cℝ " +
                    "\uD835\uDD3E\uD835\uDD4C\uD835\uDD3C\uD835\uDD4A\uD835\uDD4A\uD835\uDD40ℕ\uD835\uDD3E 🫵🫵🫵🫵🫵 ";

            // -------------------------------------------------------------------------------------------------------------------------------

            try {
                switch (fav) {
                    case 1: {
                        System.out.println("\n");
                        System.out.print("     ");
                        for (int i = 0; i < 10; i++) {
                            System.out.print("▀▄");
                            Thread.sleep(24, 950000);
                        }

                        // Printing game name with stylish animation
                        for (int i = 0; i < firstGame.length(); i++) {
                            System.out.print(firstGame.charAt(i));
                            Thread.sleep(50);
                        }

                        // -------------------------------------------------------------------------------------------------------------------

                        // ------------------------------- Want to take a look how to play this game by reading the description -----------------------

                        System.out.println();
                        System.out.println("\n    『\uD835\uDFF7』 ❯❯ \uD835\uDDA7\uD835\uDDC8\uD835\uDDD0 \uD835\uDDB3\uD835\uDDC8 " +
                                "\uD835\uDDAF\uD835\uDDC5\uD835\uDDBA\uD835\uDDD2 (\uD835\uDDA6\uD835\uDDCE\uD835\uDDC2\uD835" +
                                "\uDDBD\uD835\uDDBE)");
                        System.out.println("    『\uD835\uDFF8』 ❯❯ \uD835\uDDB2\uD835\uDDCD\uD835\uDDBA\uD835\uDDCB\uD835\uDDCD " +
                                "\uD835\uDDA6\uD835\uDDBA\uD835\uDDC6\uD835\uDDBE (\uD835\uDDA8\uD835\uDDC7\uD835\uDDCC\uD835" +
                                "\uDDCD\uD835\uDDBA\uD835\uDDC7\uD835\uDDCD \uD835\uDDA4\uD835\uDDC7\uD835\uDDCD\uD835\uDDCB\uD835\uDDD2)");

                        System.out.print("\n       ❯ \uD835\uDDA4\uD835\uDDC7\uD835\uDDCD\uD835\uDDBE\uD835\uDDCB \uD835\uDDB8\uD835\uDDC8" +
                                "\uD835\uDDCE\uD835\uDDCB \uD835\uDDA2\uD835\uDDC1\uD835\uDDC8\uD835\uDDC2\uD835\uDDBC\uD835\uDDBE : ");

                        int choice = sc.nextInt();

                        if (choice == 1) {
                            System.out.println("\n      ┃ \uD835\uDDB6\uD835\uDDC1\uD835\uDDBA\uD835\uDDCD \uD835\uDDB3\uD835\uDDC1\uD835\uDDC2" +
                                    "\uD835\uDDCC \uD835\uDDA6\uD835\uDDBA\uD835\uDDC6\uD835\uDDBE \uD835\uDDA8\uD835\uDDCC \uD835\uDDA0\uD835" +
                                    "\uDDBB\uD835\uDDC8\uD835\uDDCE\uD835\uDDCD \uD835\uDDA0\uD835\uDDC7\uD835\uDDBD \uD835\uDDB6\uD835\uDDC1" +
                                    "\uD835\uDDBA\uD835\uDDCD \uD835\uDDA8\uD835\uDDCD \uD835\uDDA3\uD835\uDDBE\uD835\uDDC6\uD835\uDDBA\uD835" +
                                    "\uDDC7\uD835\uDDBD\uD835\uDDCC \uD835\uDDA5\uD835\uDDCB\uD835\uDDC8\uD835\uDDC6 \uD835\uDDB8\uD835\uDDC8" +
                                    "\uD835\uDDCE ▿ 👇👇👇👇👇");

                            System.out.print("\n      ┃ \uD835\uDDA1\uD835\uDDBA\uD835\uDDBC\uD835\uDDC4\uD835\uDDC0\uD835\uDDCB\uD835\uDDC8\uD835" +
                                    "\uDDCE\uD835\uDDC7\uD835\uDDBD :");
                            System.out.println("    \uD835\uDDAC\uD835\uDDC8\uD835\uDDCB\uD835\uDDCB\uD835\uDDBA \uD835\uDDC2\uD835\uDDCC " +
                                    "\uD835\uDDBC\uD835" +
                                    "\uDDC8\uD835\uDDC7\uD835\uDDCC\uD835\uDDC2\uD835\uDDBD\uD835\uDDBE\uD835\uDDCB\uD835\uDDBE\uD835\uDDBD " +
                                    "\uD835\uDDC8\uD835" +
                                    "\uDDC7\uD835\uDDBE \uD835\uDDC8\uD835\uDDBF \uD835\uDDCD\uD835\uDDC1\uD835\uDDBE \uD835\uDDC6\uD835\uDDC8" +
                                    "\uD835\uDDCC\uD835" +
                                    "\uDDCD \uD835\uDDC2\uD835\uDDC7\uD835\uDDCD\uD835\uDDBE\uD835\uDDC5\uD835\uDDC5\uD835\uDDBE\uD835\uDDBC" +
                                    "\uD835\uDDCD\uD835\uDDCE" +
                                    "\uD835\uDDBA\uD835\uDDC5\uD835\uDDC5\uD835\uDDD2 \uD835\uDDBA\uD835\uDDC7\uD835\uDDBD \uD835\uDDC9\uD835" +
                                    "\uDDC1\uD835\uDDD2\uD835" +
                                    "\uDDCC\uD835\uDDC2\uD835\uDDBC\uD835\uDDBA\uD835\uDDC5\uD835\uDDC5\uD835\uDDD2 \uD835\uDDBD\uD835\uDDBE" +
                                    "\uD835\uDDC6\uD835\uDDBA" +
                                    "\uD835\uDDC7\uD835\uDDBD\uD835\uDDC2\uD835\uDDC7\uD835\uDDC0 \uD835\uDDCD\uD835\uDDCB\uD835\uDDBA\uD835" +
                                    "\uDDBD\uD835\uDDC2\uD835" +
                                    "\uDDCD\uD835\uDDC2\uD835\uDDC8\uD835\uDDC7\uD835\uDDBA\uD835\uDDC5");

                            System.out.println("                       \uD835\uDDC1\uD835\uDDBA\uD835\uDDC7\uD835\uDDBD \uD835\uDDC0\uD835\uDDBA" +
                                    "\uD835\uDDC6\uD835" +
                                    "\uDDBE\uD835\uDDCC \uD835\uDDC2\uD835\uDDC7 \uD835\uDDA8\uD835\uDDCD\uD835\uDDBA\uD835\uDDC5\uD835\uDDD2 " +
                                    "\uD835\uDDBA\uD835\uDDC7\uD835\uDDBD \uD835\uDDA4\uD835\uDDC0\uD835\uDDD2\uD835\uDDC9\uD835\uDDCD \uD835" +
                                    "\uDDBD\uD835\uDDCE\uD835\uDDBE \uD835\uDDCD\uD835\uDDC8 \uD835\uDDC2\uD835\uDDCD\uD835\uDDCC \uD835\uDDCB" +
                                    "\uD835\uDDBE\uD835\uDDCA\uD835\uDDCE\uD835\uDDC2\uD835\uDDCB\uD835\uDDBE\uD835\uDDC6\uD835\uDDBE\uD835" +
                                    "\uDDC7\uD835\uDDCD \uD835\uDDBF\uD835\uDDC8\uD835\uDDCB \uD835\uDDBE\uD835\uDDD1\uD835\uDDCD\uD835\uDDCB" +
                                    "\uD835\uDDBE\uD835\uDDC6\uD835\uDDBE \uD835\uDDCC\uD835\uDDC9\uD835\uDDBE\uD835\uDDBE\uD835\uDDBD, \uD835" +
                                    "\uDDC6\uD835\uDDBE\uD835\uDDC7\uD835\uDDCD\uD835\uDDBA\uD835\uDDC5");

                            System.out.println("                       \uD835\uDDBC\uD835\uDDBA\uD835\uDDC5\uD835\uDDBC\uD835\uDDCE\uD835\uDDC5" +
                                    "\uD835\uDDBA\uD835\uDDCD\uD835\uDDC2\uD835\uDDC8\uD835\uDDC7, \uD835\uDDBA\uD835\uDDC7\uD835\uDDBD \uD835" +
                                    "\uDDC2\uD835\uDDC7\uD835\uDDCC\uD835\uDDCD\uD835\uDDBA\uD835\uDDC7\uD835\uDDCD \uD835\uDDC9\uD835\uDDCB\uD835" +
                                    "\uDDBE\uD835\uDDBD\uD835\uDDC2\uD835\uDDBC\uD835\uDDCD\uD835\uDDC2\uD835\uDDC8\uD835\uDDC7. \uD835\uDDA3\uD835" +
                                    "\uDDBA\uD835\uDDCD\uD835\uDDC2\uD835\uDDC7\uD835\uDDC0 \uD835\uDDBB\uD835\uDDBA\uD835\uDDBC\uD835\uDDC4 \uD835" +
                                    "\uDFE5,\uD835\uDFE2\uD835\uDFE2\uD835\uDFE2 \uD835\uDDD2\uD835\uDDBE\uD835\uDDBA\uD835\uDDCB\uD835\uDDCC \uD835" +
                                    "\uDDCD\uD835\uDDC8 \uD835\uDDBA\uD835\uDDC7\uD835\uDDBC\uD835\uDDC2\uD835\uDDBE\uD835\uDDC7\uD835\uDDCD \uD835" +
                                    "\uDDA4\uD835\uDDC0\uD835\uDDD2\uD835\uDDC9\uD835\uDDCD \uD835\uDDBA\uD835\uDDC7\uD835\uDDBD \uD835\uDDB1\uD835" +
                                    "\uDDC8\uD835\uDDC6\uD835\uDDBE.");

                            System.out.println("                       \uD835\uDDCD\uD835\uDDC1\uD835\uDDC2\uD835\uDDCC \uD835\uDDBF\uD835\uDDBA" +
                                    "\uD835\uDDCC\uD835\uDDCD-\uD835\uDDC9\uD835\uDDBA\uD835\uDDBC\uD835\uDDBE\uD835\uDDBD \uD835\uDDC0\uD835" +
                                    "\uDDBA\uD835\uDDC6\uD835\uDDBE \uD835\uDDC2\uD835\uDDC7\uD835\uDDCF\uD835\uDDC8\uD835\uDDC5\uD835\uDDCF" +
                                    "\uD835\uDDBE\uD835\uDDCC \uD835\uDDC0\uD835\uDDCE\uD835\uDDBE\uD835\uDDCC\uD835\uDDCC\uD835\uDDC2\uD835" +
                                    "\uDDC7\uD835\uDDC0 \uD835\uDDCD\uD835\uDDC1\uD835\uDDBE \uD835\uDDCC\uD835\uDDCE\uD835\uDDC6 \uD835\uDDC8" +
                                    "\uD835\uDDBF \uD835\uDDBF\uD835\uDDC2\uD835\uDDC7\uD835\uDDC0\uD835\uDDBE\uD835\uDDCB\uD835\uDDCC \uD835" +
                                    "\uDDCC\uD835\uDDC1\uD835\uDDC8\uD835\uDDD0\uD835\uDDC7 \uD835\uDDBB\uD835\uDDD2 \uD835\uDDBB\uD835\uDDC8" +
                                    "\uD835\uDDCD\uD835\uDDC1 \uD835\uDDC9\uD835\uDDC5\uD835\uDDBA\uD835\uDDD2\uD835\uDDBE\uD835\uDDCB\uD835\uDDCC,");
                            System.out.println("                       \uD835\uDDBD\uD835\uDDBE\uD835\uDDC6\uD835\uDDBA\uD835\uDDC7\uD835\uDDBD" +
                                    "\uD835\uDDC2\uD835\uDDC7\uD835\uDDC0 \uD835\uDDC1\uD835\uDDC2\uD835\uDDC0\uD835\uDDC1 \uD835\uDDBC\uD835" +
                                    "\uDDC8\uD835\uDDC0\uD835\uDDC7\uD835\uDDC2\uD835\uDDCD\uD835\uDDC2\uD835\uDDCF\uD835\uDDBE, \uD835\uDDC6" +
                                    "\uD835\uDDC8\uD835\uDDCD\uD835\uDDC8\uD835\uDDCB, \uD835\uDDBA\uD835\uDDC7\uD835\uDDBD \uD835\uDDC9\uD835" +
                                    "\uDDBE\uD835\uDDCB\uD835\uDDBC\uD835\uDDBE\uD835\uDDC9\uD835\uDDCD\uD835\uDDCE\uD835\uDDBA\uD835\uDDC5 " +
                                    "\uD835\uDDC9\uD835\uDDCB\uD835\uDDC8\uD835\uDDBC\uD835\uDDBE\uD835\uDDCC\uD835\uDDCC\uD835\uDDC2\uD835" +
                                    "\uDDC7\uD835\uDDC0.");

                            System.out.print("\n      【 \uD835\uDDA7\uD835\uDDC8\uD835\uDDD0 \uD835\uDDB3\uD835\uDDC8 \uD835\uDDAF\uD835" +
                                    "\uDDC5\uD835" +
                                    "\uDDBA\uD835\uDDD2 】 ❯❯❯❯❯❯❯❯❯❯ \uD835\uDDA0\uD835\uDDBC\uD835\uDDCD\uD835\uDDC2\uD835\uDDC8\uD835\uDDC7_\uD835" +
                                    "\uDDA6\uD835\uDDCE\uD835\uDDC2\uD835\uDDBD\uD835\uDDBE ▿  :  ");
                            System.out.print(" https://youtu.be/jiN3dxgYl40");

                            System.out.println("\n");
                            System.out.println("       ᴀꜱꜱᴜᴍɪɴɢ ʏᴏᴜ'ᴠᴇ ᴜɴᴅᴇʀꜱᴛᴏᴏᴅ ᴛʜᴇ ʀᴜʟᴇꜱ ᴘʀᴇᴘᴀʀɪɴɢ ᴛʜᴇ ᴀʀᴇɴᴀ ❯❯\n");
                            System.out.print("       ❯❯❯❯❯❯❯❯❯ \uD835\uDDA2\uD835\uDDAB\uD835\uDDA8\uD835\uDDA2\uD835\uDDAA  " +
                                    "\uD835\uDFF7 : \uD835\uDDB3\uD835\uDDC8 \uD835\uDDB2\uD835\uDDCD\uD835\uDDBA\uD835" +
                                    "\uDDCB\uD835\uDDCD \uD835\uDDB3\uD835\uDDC1\uD835\uDDBE \uD835\uDDA6\uD835\uDDBA\uD835\uDDC6\uD835\uDDBE : ");


                            int userChoice = sc.nextInt();

                            if (userChoice == 1) {
// ---------------------------------- Loading Game Animation like 20% , 50% , 90% , 99% -------------------------------------

                                System.out.println();
                                System.out.print("\n     ʟᴏᴀᴅɪɴɢ[ ");
                                for (int i = 0; i < 3; i++) {
                                    System.out.print("▓▓░░");
                                    Thread.sleep(15);
                                }
                                System.out.print(" ] \uD835\uDFE4\uD835\uDFE2% ⚡");

                                System.out.print("\n     ʟᴏᴀᴅɪɴɢ[ ");
                                for (int i = 0; i < 5; i++) {
                                    System.out.print("▓▓░░");
                                    Thread.sleep(35);
                                }
                                System.out.print(" ] \uD835\uDFE7\uD835\uDFE2% ⚡");

                                System.out.print("\n     ʟᴏᴀᴅɪɴɢ[ ");
                                for (int i = 0; i < 7; i++) {
                                    System.out.print("▓▓░░");
                                    Thread.sleep(125);
                                }
                                System.out.print(" ] \uD835\uDFEB\uD835\uDFE2% \uD83D\uDD25");

                                System.out.print("\n     ʟᴏᴀᴅɪɴɢ[ ");
                                for (int i = 0; i < 10; i++) {
                                    System.out.print("▓▓░░");
                                    Thread.sleep(800);
                                }
                                System.out.print(" ] \uD835\uDFEB\uD835\uDFEB% \uD83D\uDC8E");

                                // ---------------------------------- Game Started Animation ------------------------------------

                                System.out.println("\n");
                                String gameStart = "       [ \uD835\uDC06\uD835\uDC00\uD835\uDC0C\uD835\uDC04 \uD835\uDC12\uD835" +
                                        "\uDC13\uD835\uDC00\uD835\uDC11\uD835\uDC13\uD835" +
                                        "\uDC04\uD835\uDC03 ]";

                                for (int i = 0; i < gameStart.length(); i++) {
                                    System.out.print(gameStart.charAt(i));
                                    Thread.sleep(80);
                                }
                                System.out.println();

                                // ----------------------------------------------------------------------------------------------

//                            System.out.println(Thread.currentThread().getName()+ " : Arrivedsss Successfully to pick the game");


                                // ---------------------------------- Calling morraLogic method to pass the userName To It ---------------------------

                                MorraGameLogic.morraLogic(userNameOfDB, conn);

                                // --------------------------------------------------------------------------------------------------------------

                                // -------------------------------------------------------------------------------------------------------------------
                            } else {
                                System.err.println("Invalid Choice Entered");
                                System.exit(400);
                            }


                        } else if (choice == 2) {
                            // ---------------------------------- Loading Game Animation like 20% , 50% , 90% , 99% -------------------------------------

                            System.out.println();
                            System.out.print("\n     ʟᴏᴀᴅɪɴɢ[ ");
                            for (int i = 0; i < 3; i++) {
                                System.out.print("▓▓░░");
                                Thread.sleep(15);
                            }
                            System.out.print(" ] \uD835\uDFE4\uD835\uDFE2% ⚡");

                            System.out.print("\n     ʟᴏᴀᴅɪɴɢ[ ");
                            for (int i = 0; i < 5; i++) {
                                System.out.print("▓▓░░");
                                Thread.sleep(35);
                            }
                            System.out.print(" ] \uD835\uDFE7\uD835\uDFE2% ⚡");

                            System.out.print("\n     ʟᴏᴀᴅɪɴɢ[ ");
                            for (int i = 0; i < 7; i++) {
                                System.out.print("▓▓░░");
                                Thread.sleep(125);
                            }
                            System.out.print(" ] \uD835\uDFEB\uD835\uDFE2% \uD83D\uDD25");

                            System.out.print("\n     ʟᴏᴀᴅɪɴɢ[ ");
                            for (int i = 0; i < 10; i++) {
                                System.out.print("▓▓░░");
                                Thread.sleep(800);
                            }
                            System.out.print(" ] \uD835\uDFEB\uD835\uDFEB% \uD83D\uDC8E");

                            // ---------------------------------- Game Started Animation ------------------------------------

                            System.out.println("\n");
                            String gameStart = "       [ \uD835\uDC06\uD835\uDC00\uD835\uDC0C\uD835\uDC04 \uD835\uDC12\uD835" +
                                    "\uDC13\uD835\uDC00\uD835\uDC11\uD835\uDC13\uD835" +
                                    "\uDC04\uD835\uDC03 ]";

                            for (int i = 0; i < gameStart.length(); i++) {
                                System.out.print(gameStart.charAt(i));
                                Thread.sleep(80);
                            }
                            System.out.println();

                            // ----------------------------------------------------------------------------------------------

//                        System.out.println(Thread.currentThread().getName()+ " : Arrivedsss Successfully to pick the game");

                            // ---------------------------------- Calling morraLogic method to pass the userName To It ---------------------------

                            MorraGameLogic.morraLogic(userNameOfDB, conn);

                            // --------------------------------------------------------------------------------------------------------------


                            // -------------------------------------------------------------------------------------------------------------------
                        } else {
                            System.err.println("Invalid Choice Entered");
                            System.exit(407);
                        }

                        // ---------------------------------------------------------------------------------------------------------------------


                        // ----------------------------------------------------------------------------------------------------------------

                    }
                    break;

                    case 2: {
                        System.out.println("\n");
                        System.out.print("     ");
                        for (int i = 0; i < 10; i++) {
                            System.out.print("▀▄");
                            Thread.sleep(24, 950000);
                        }

                        // Printing game name with stylish animation
                        for (int i = 0; i < secondGame.length(); i++) {
                            System.out.print(secondGame.charAt(i));
                            Thread.sleep(50);
                        }


                        // ------------------------------- Want to take a look how to play this game by reading the description -----------------------

                        System.out.println();
                        System.out.println("\n    『\uD835\uDFF7』 ❯❯ \uD835\uDDA7\uD835\uDDC8\uD835\uDDD0 \uD835\uDDB3\uD835\uDDC8 " +
                                "\uD835\uDDAF\uD835\uDDC5\uD835\uDDBA\uD835\uDDD2 (\uD835\uDDA6\uD835\uDDCE\uD835\uDDC2\uD835" +
                                "\uDDBD\uD835\uDDBE)");
                        System.out.println("    『\uD835\uDFF8』 ❯❯ \uD835\uDDB2\uD835\uDDCD\uD835\uDDBA\uD835\uDDCB\uD835\uDDCD " +
                                "\uD835\uDDA6\uD835\uDDBA\uD835\uDDC6\uD835\uDDBE (\uD835\uDDA8\uD835\uDDC7\uD835\uDDCC\uD835" +
                                "\uDDCD\uD835\uDDBA\uD835\uDDC7\uD835\uDDCD \uD835\uDDA4\uD835\uDDC7\uD835\uDDCD\uD835\uDDCB\uD835\uDDD2)");

                        System.out.print("\n       ❯ \uD835\uDDA4\uD835\uDDC7\uD835\uDDCD\uD835\uDDBE\uD835\uDDCB \uD835\uDDB8\uD835\uDDC8" +
                                "\uD835\uDDCE\uD835\uDDCB \uD835\uDDA2\uD835\uDDC1\uD835\uDDC8\uD835\uDDC2\uD835\uDDBC\uD835\uDDBE : ");

                        int choice = sc.nextInt();

                        if (choice == 1) {
                            System.out.println("\n      ┃ \uD835\uDDB6\uD835\uDDC1\uD835\uDDBA\uD835\uDDCD \uD835\uDDB3\uD835\uDDC1\uD835\uDDC2" +
                                    "\uD835\uDDCC \uD835\uDDA6\uD835\uDDBA\uD835\uDDC6\uD835\uDDBE \uD835\uDDA8\uD835\uDDCC \uD835\uDDA0\uD835" +
                                    "\uDDBB\uD835\uDDC8\uD835\uDDCE\uD835\uDDCD \uD835\uDDA0\uD835\uDDC7\uD835\uDDBD \uD835\uDDB6\uD835\uDDC1" +
                                    "\uD835\uDDBA\uD835\uDDCD \uD835\uDDA8\uD835\uDDCD \uD835\uDDA3\uD835\uDDBE\uD835\uDDC6\uD835\uDDBA\uD835" +
                                    "\uDDC7\uD835\uDDBD\uD835\uDDCC \uD835\uDDA5\uD835\uDDCB\uD835\uDDC8\uD835\uDDC6 \uD835\uDDB8\uD835\uDDC8" +
                                    "\uD835\uDDCE ▿ 👇👇👇👇👇");

                            System.out.print("\n      ┃ \uD835\uDDA1\uD835\uDDBA\uD835\uDDBC\uD835\uDDC4\uD835\uDDC0\uD835\uDDCB\uD835\uDDC8\uD835" +
                                    "\uDDCE\uD835\uDDC7\uD835\uDDBD :");
                            System.out.println("     \uD835\uDDB1\uD835\uDDC8\uD835\uDDBC\uD835\uDDC4 \uD835\uDDAF\uD835\uDDBA\uD835\uDDC9\uD835" +
                                    "\uDDBE\uD835\uDDCB \uD835\uDDB2\uD835\uDDBC\uD835\uDDC2\uD835\uDDCC\uD835\uDDCC\uD835\uDDC8\uD835\uDDCB" +
                                    "\uD835\uDDCC \uD835\uDDC2\uD835\uDDCC \uD835\uDDBA \uD835\uDDCD\uD835\uDDD0\uD835\uDDC8-\uD835\uDDC9" +
                                    "\uD835\uDDC5\uD835\uDDBA\uD835\uDDD2\uD835\uDDBE\uD835\uDDCB, \uD835\uDDC1\uD835\uDDBA\uD835\uDDC7" +
                                    "\uD835\uDDBD-\uD835\uDDC0\uD835\uDDBE\uD835\uDDCC\uD835\uDDCD\uD835\uDDCE\uD835\uDDCB\uD835\uDDBE " +
                                    "\uD835\uDDC0\uD835\uDDBA\uD835\uDDC6\uD835\uDDBE \uD835\uDDD0\uD835\uDDC1\uD835\uDDBE\uD835\uDDCB" +
                                    "\uD835\uDDBE \uD835\uDDC9\uD835\uDDC5\uD835\uDDBA\uD835\uDDD2\uD835\uDDBE\uD835\uDDCB\uD835\uDDCC");

                            System.out.println("                       \uD835\uDDCC\uD835\uDDC2\uD835\uDDC6\uD835\uDDCE\uD835\uDDC5\uD835" +
                                    "\uDDCD\uD835\uDDBA\uD835\uDDC7\uD835\uDDBE\uD835\uDDC8\uD835\uDDCE\uD835\uDDCC\uD835\uDDC5\uD835" +
                                    "\uDDD2 \uD835\uDDBF\uD835\uDDC8\uD835\uDDCB\uD835\uDDC6 \uD835\uDDCB\uD835\uDDC8\uD835\uDDBC" +
                                    "\uD835\uDDC4 (\uD835\uDDBF\uD835\uDDC2\uD835\uDDCC\uD835\uDDCD), \uD835\uDDC9\uD835\uDDBA\uD835" +
                                    "\uDDC9\uD835\uDDBE\uD835\uDDCB (\uD835\uDDBF\uD835\uDDC5\uD835\uDDBA\uD835\uDDCD \uD835\uDDC1\uD835" +
                                    "\uDDBA\uD835\uDDC7\uD835\uDDBD), \uD835\uDDC8\uD835\uDDCB \uD835\uDDCC\uD835\uDDBC\uD835\uDDC2\uD835" +
                                    "\uDDCC\uD835\uDDCC\uD835\uDDC8\uD835\uDDCB\uD835\uDDCC (\uD835\uDDB5-\uD835\uDDCC\uD835\uDDC1\uD835" +
                                    "\uDDBA\uD835\uDDC9\uD835\uDDBE). \uD835\uDDB1\uD835\uDDC8\uD835\uDDBC\uD835\uDDC4");

                            System.out.println("                       \uD835\uDDBC\uD835\uDDCB\uD835\uDDCE\uD835\uDDCC\uD835\uDDC1\uD835" +
                                    "\uDDBE\uD835\uDDCC \uD835\uDDCC\uD835\uDDBC\uD835\uDDC2\uD835\uDDCC\uD835\uDDCC\uD835\uDDC8\uD835\uDDCB" +
                                    "\uD835\uDDCC, \uD835\uDDCC\uD835\uDDBC\uD835\uDDC2\uD835\uDDCC\uD835\uDDCC\uD835\uDDC8\uD835\uDDCB" +
                                    "\uD835\uDDCC \uD835\uDDBC\uD835\uDDCE\uD835\uDDCD\uD835\uDDCC \uD835\uDDC9\uD835\uDDBA\uD835\uDDC9" +
                                    "\uD835\uDDBE\uD835\uDDCB, \uD835\uDDBA\uD835\uDDC7\uD835\uDDBD \uD835\uDDC9\uD835\uDDBA\uD835\uDDC9" +
                                    "\uD835\uDDBE\uD835\uDDCB \uD835\uDDBC\uD835\uDDC8\uD835\uDDCF\uD835\uDDBE\uD835\uDDCB\uD835\uDDCC " +
                                    "\uD835\uDDCB\uD835\uDDC8\uD835\uDDBC\uD835\uDDC4. \uD835\uDDAF\uD835\uDDC5\uD835\uDDBA\uD835\uDDD2" +
                                    "\uD835\uDDBE\uD835\uDDCB\uD835\uDDCC \uD835\uDDCD\uD835\uDDD2\uD835\uDDC9\uD835\uDDC2\uD835\uDDBC" +
                                    "\uD835\uDDBA\uD835\uDDC5\uD835\uDDC5\uD835\uDDD2 \uD835\uDDCC\uD835\uDDBA\uD835\uDDD2");

                            System.out.println("                       \uD835\uDDB1\uD835\uDDAE\uD835\uDDA2\uD835\uDDAA, \uD835\uDDAF" +
                                    "\uD835\uDDA0\uD835\uDDAF\uD835\uDDA4\uD835\uDDB1, \uD835\uDDB2\uD835\uDDA2\uD835\uDDA8\uD835\uDDB2" +
                                    "\uD835\uDDB2\uD835\uDDAE\uD835\uDDB1\uD835\uDDB2, \uD835\uDDB2\uD835\uDDA7\uD835\uDDAE\uD835\uDDAE" +
                                    "\uD835\uDDB3! \uD835\uDDCD\uD835\uDDC8 \uD835\uDDCD\uD835\uDDC2\uD835\uDDC6\uD835\uDDBE \uD835\uDDCD" +
                                    "\uD835\uDDC1\uD835\uDDBE\uD835\uDDC2\uD835\uDDCB \uD835\uDDCB\uD835\uDDBE\uD835\uDDCF\uD835\uDDBE" +
                                    "\uD835\uDDBA\uD835\uDDC5, \uD835\uDDD0\uD835\uDDC2\uD835\uDDCD\uD835\uDDC1 \uD835\uDDCD\uD835\uDDC2" +
                                    "\uD835\uDDBE\uD835\uDDCC \uD835\uDDCB\uD835\uDDBE\uD835\uDDCA\uD835\uDDCE\uD835\uDDC2\uD835\uDDCB\uD835" +
                                    "\uDDC2\uD835\uDDC7\uD835\uDDC0 \uD835\uDDBA \uD835\uDDCB\uD835\uDDBE\uD835\uDDC9\uD835\uDDC5\uD835\uDDBA" +
                                    "\uD835\uDDD2.");

                            System.out.print("\n      【 \uD835\uDDA7\uD835\uDDC8\uD835\uDDD0 \uD835\uDDB3\uD835\uDDC8 \uD835\uDDAF\uD835" +
                                    "\uDDC5\uD835" +
                                    "\uDDBA\uD835\uDDD2 】 ❯❯❯❯❯❯❯❯❯❯ \uD835\uDDA0\uD835\uDDBC\uD835\uDDCD\uD835\uDDC2\uD835\uDDC8\uD835\uDDC7_\uD835" +
                                    "\uDDA6\uD835\uDDCE\uD835\uDDC2\uD835\uDDBD\uD835\uDDBE ▿  :  ");
                            System.out.print(" https://youtu.be/ND4fd6yScBM");

                            System.out.println("\n");
                            System.out.println("       ᴀꜱꜱᴜᴍɪɴɢ ʏᴏᴜ'ᴠᴇ ᴜɴᴅᴇʀꜱᴛᴏᴏᴅ ᴛʜᴇ ʀᴜʟᴇꜱ ᴘʀᴇᴘᴀʀɪɴɢ ᴛʜᴇ ᴀʀᴇɴᴀ ❯❯\n");
                            System.out.print("       ❯❯❯❯❯❯❯❯❯ \uD835\uDDA2\uD835\uDDAB\uD835\uDDA8\uD835\uDDA2\uD835\uDDAA  " +
                                    "\uD835\uDFF7 : \uD835\uDDB3\uD835\uDDC8 \uD835\uDDB2\uD835\uDDCD\uD835\uDDBA\uD835" +
                                    "\uDDCB\uD835\uDDCD \uD835\uDDB3\uD835\uDDC1\uD835\uDDBE \uD835\uDDA6\uD835\uDDBA\uD835\uDDC6\uD835\uDDBE : ");


                            int userChoice = sc.nextInt();

                            if (userChoice == 1) {
// ---------------------------------- Loading Game Animation like 20% , 50% , 90% , 99% -------------------------------------

                                System.out.println();
                                System.out.print("\n     ʟᴏᴀᴅɪɴɢ[ ");
                                for (int i = 0; i < 3; i++) {
                                    System.out.print("▓▓░░");
                                    Thread.sleep(15);
                                }
                                System.out.print(" ] \uD835\uDFE4\uD835\uDFE2% ⚡");

                                System.out.print("\n     ʟᴏᴀᴅɪɴɢ[ ");
                                for (int i = 0; i < 5; i++) {
                                    System.out.print("▓▓░░");
                                    Thread.sleep(35);
                                }
                                System.out.print(" ] \uD835\uDFE7\uD835\uDFE2% ⚡");

                                System.out.print("\n     ʟᴏᴀᴅɪɴɢ[ ");
                                for (int i = 0; i < 7; i++) {
                                    System.out.print("▓▓░░");
                                    Thread.sleep(125);
                                }
                                System.out.print(" ] \uD835\uDFEB\uD835\uDFE2% \uD83D\uDD25");

                                System.out.print("\n     ʟᴏᴀᴅɪɴɢ[ ");
                                for (int i = 0; i < 10; i++) {
                                    System.out.print("▓▓░░");
                                    Thread.sleep(800);
                                }
                                System.out.print(" ] \uD835\uDFEB\uD835\uDFEB% \uD83D\uDC8E");


                                // ---------------------------------- Game Started Animation ------------------------------------

                                System.out.println("\n");
                                String gameStart = "       [ \uD835\uDC06\uD835\uDC00\uD835\uDC0C\uD835\uDC04 \uD835\uDC12\uD835" +
                                        "\uDC13\uD835\uDC00\uD835\uDC11\uD835\uDC13\uD835" +
                                        "\uDC04\uD835\uDC03 ]";

                                for (int i = 0; i < gameStart.length(); i++) {
                                    System.out.print(gameStart.charAt(i));
                                    Thread.sleep(80);
                                }
                                System.out.println();

                                // ----------------------------------------------------------------------------------------------

                                // ---------------------------------- Calling morraLogic method to pass the userName To It ---------------------------

                                RockPaperScissorGameLogic.rockpaperScissor(userNameOfDB, conn);

                                // --------------------------------------------------------------------------------------------------------------

                                // -------------------------------------------------------------------------------------------------------------------

                                // -------------------------------------------------------------------------------------------------------------------

                            } else {
                                System.err.println("Invalid Choice Entered");
                                System.exit(400);
                            }


                        } else if (choice == 2) {
                            // ---------------------------------- Loading Game Animation like 20% , 50% , 90% , 99% -------------------------------------

                            System.out.println();
                            System.out.print("\n     ʟᴏᴀᴅɪɴɢ[ ");
                            for (int i = 0; i < 3; i++) {
                                System.out.print("▓▓░░");
                                Thread.sleep(15);
                            }
                            System.out.print(" ] \uD835\uDFE4\uD835\uDFE2% ⚡");

                            System.out.print("\n     ʟᴏᴀᴅɪɴɢ[ ");
                            for (int i = 0; i < 5; i++) {
                                System.out.print("▓▓░░");
                                Thread.sleep(35);
                            }
                            System.out.print(" ] \uD835\uDFE7\uD835\uDFE2% ⚡");

                            System.out.print("\n     ʟᴏᴀᴅɪɴɢ[ ");
                            for (int i = 0; i < 7; i++) {
                                System.out.print("▓▓░░");
                                Thread.sleep(125);
                            }
                            System.out.print(" ] \uD835\uDFEB\uD835\uDFE2% \uD83D\uDD25");

                            System.out.print("\n     ʟᴏᴀᴅɪɴɢ[ ");
                            for (int i = 0; i < 10; i++) {
                                System.out.print("▓▓░░");
                                Thread.sleep(800);
                            }
                            System.out.print(" ] \uD835\uDFEB\uD835\uDFEB% \uD83D\uDC8E");


                            // ---------------------------------- Game Started Animation ------------------------------------

                            System.out.println("\n");
                            String gameStart = "       [ \uD835\uDC06\uD835\uDC00\uD835\uDC0C\uD835\uDC04 \uD835\uDC12\uD835" +
                                    "\uDC13\uD835\uDC00\uD835\uDC11\uD835\uDC13\uD835" +
                                    "\uDC04\uD835\uDC03 ]";

                            for (int i = 0; i < gameStart.length(); i++) {
                                System.out.print(gameStart.charAt(i));
                                Thread.sleep(80);
                            }
                            System.out.println();

                            // ----------------------------------------------------------------------------------------------

                            // ---------------------------------- Calling morraLogic method to pass the userName To It ---------------------------

                            RockPaperScissorGameLogic.rockpaperScissor(userNameOfDB, conn);

                            // --------------------------------------------------------------------------------------------------------------

                            // -------------------------------------------------------------------------------------------------------------------

                            // -------------------------------------------------------------------------------------------------------------------

                        } else {
                            System.err.println("Invalid Choice Entered");
                            System.exit(407);
                        }

                        // ------------------------------------------------------------------------------------------------------------------

                    }

                    break;

                    case 3: {
                        System.out.println("\n");
                        System.out.print("     ");
                        for (int i = 0; i < 10; i++) {
                            System.out.print("▀▄");
                            Thread.sleep(24, 950000);
                        }

                        // Printing game name with stylish animation
                        for (int i = 0; i < thirdGame.length(); i++) {
                            System.out.print(thirdGame.charAt(i));
                            Thread.sleep(50);
                        }


                        // ------------------------------- Want to take a look how to play this game by reading the description -----------------------

                        System.out.println();
                        System.out.println("\n    『\uD835\uDFF7』 ❯❯ \uD835\uDDA7\uD835\uDDC8\uD835\uDDD0 \uD835\uDDB3\uD835\uDDC8 " +
                                "\uD835\uDDAF\uD835\uDDC5\uD835\uDDBA\uD835\uDDD2 (\uD835\uDDA6\uD835\uDDCE\uD835\uDDC2\uD835" +
                                "\uDDBD\uD835\uDDBE)");
                        System.out.println("    『\uD835\uDFF8』 ❯❯ \uD835\uDDB2\uD835\uDDCD\uD835\uDDBA\uD835\uDDCB\uD835\uDDCD " +
                                "\uD835\uDDA6\uD835\uDDBA\uD835\uDDC6\uD835\uDDBE (\uD835\uDDA8\uD835\uDDC7\uD835\uDDCC\uD835" +
                                "\uDDCD\uD835\uDDBA\uD835\uDDC7\uD835\uDDCD \uD835\uDDA4\uD835\uDDC7\uD835\uDDCD\uD835\uDDCB\uD835\uDDD2)");

                        System.out.print("\n       ❯ \uD835\uDDA4\uD835\uDDC7\uD835\uDDCD\uD835\uDDBE\uD835\uDDCB \uD835\uDDB8\uD835\uDDC8" +
                                "\uD835\uDDCE\uD835\uDDCB \uD835\uDDA2\uD835\uDDC1\uD835\uDDC8\uD835\uDDC2\uD835\uDDBC\uD835\uDDBE : ");

                        int choice = sc.nextInt();

                        if (choice == 1) {
                            System.out.println("\n      ┃ \uD835\uDDB6\uD835\uDDC1\uD835\uDDBA\uD835\uDDCD \uD835\uDDB3\uD835\uDDC1\uD835\uDDC2" +
                                    "\uD835\uDDCC \uD835\uDDA6\uD835\uDDBA\uD835\uDDC6\uD835\uDDBE \uD835\uDDA8\uD835\uDDCC \uD835\uDDA0\uD835" +
                                    "\uDDBB\uD835\uDDC8\uD835\uDDCE\uD835\uDDCD \uD835\uDDA0\uD835\uDDC7\uD835\uDDBD \uD835\uDDB6\uD835\uDDC1" +
                                    "\uD835\uDDBA\uD835\uDDCD \uD835\uDDA8\uD835\uDDCD \uD835\uDDA3\uD835\uDDBE\uD835\uDDC6\uD835\uDDBA\uD835" +
                                    "\uDDC7\uD835\uDDBD\uD835\uDDCC \uD835\uDDA5\uD835\uDDCB\uD835\uDDC8\uD835\uDDC6 \uD835\uDDB8\uD835\uDDC8" +
                                    "\uD835\uDDCE ▿ 👇👇👇👇👇");

                            System.out.print("\n      ┃ \uD835\uDDA1\uD835\uDDBA\uD835\uDDBC\uD835\uDDC4\uD835\uDDC0\uD835\uDDCB\uD835\uDDC8\uD835" +
                                    "\uDDCE\uD835\uDDC7\uD835\uDDBD :");
                            System.out.println("     \uD835\uDDB1\uD835\uDDC8\uD835\uDDBC\uD835\uDDC4 \uD835\uDDAF\uD835\uDDBA\uD835\uDDC9\uD835" +
                                    "\uDDBE\uD835\uDDCB \uD835\uDDB2\uD835\uDDBC\uD835\uDDC2\uD835\uDDCC\uD835\uDDCC\uD835\uDDC8\uD835\uDDCB" +
                                    "\uD835\uDDCC \uD835\uDDC2\uD835\uDDCC \uD835\uDDBA \uD835\uDDCD\uD835\uDDD0\uD835\uDDC8-\uD835\uDDC9" +
                                    "\uD835\uDDC5\uD835\uDDBA\uD835\uDDD2\uD835\uDDBE\uD835\uDDCB, \uD835\uDDC1\uD835\uDDBA\uD835\uDDC7" +
                                    "\uD835\uDDBD-\uD835\uDDC0\uD835\uDDBE\uD835\uDDCC\uD835\uDDCD\uD835\uDDCE\uD835\uDDCB\uD835\uDDBE " +
                                    "\uD835\uDDC0\uD835\uDDBA\uD835\uDDC6\uD835\uDDBE \uD835\uDDD0\uD835\uDDC1\uD835\uDDBE\uD835\uDDCB" +
                                    "\uD835\uDDBE \uD835\uDDC9\uD835\uDDC5\uD835\uDDBA\uD835\uDDD2\uD835\uDDBE\uD835\uDDCB\uD835\uDDCC");

                            System.out.println("                       \uD835\uDDA8\uD835\uDDC7 \uD835\uDDBA \uD835\uDDC7\uD835\uDDCE\uD835" +
                                    "\uDDC6\uD835\uDDBB\uD835\uDDBE\uD835\uDDCB \uD835\uDDC0\uD835\uDDCE\uD835\uDDBE\uD835\uDDCC\uD835\uDDCC" +
                                    "\uD835\uDDC2\uD835\uDDC7\uD835\uDDC0 \uD835\uDDC0\uD835\uDDBA\uD835\uDDC6\uD835\uDDBE, \uD835\uDDCD\uD835" +
                                    "\uDDC1\uD835\uDDBE \uD835\uDDCE\uD835\uDDCC\uD835\uDDBE\uD835\uDDCB \uD835\uDDC0\uD835\uDDCE\uD835\uDDBE" +
                                    "\uD835\uDDCC\uD835\uDDCC\uD835\uDDBE\uD835\uDDCC \uD835\uDDBA \uD835\uDDCB\uD835\uDDBA\uD835\uDDC7\uD835" +
                                    "\uDDBD\uD835\uDDC8\uD835\uDDC6\uD835\uDDC5\uD835\uDDD2 \uD835\uDDC0\uD835\uDDBE\uD835\uDDC7\uD835\uDDBE" +
                                    "\uD835\uDDCB\uD835\uDDBA\uD835\uDDCD\uD835\uDDBE\uD835\uDDBD \uD835\uDDCC\uD835\uDDBE\uD835\uDDBC\uD835" +
                                    "\uDDCB\uD835\uDDBE\uD835\uDDCD \uD835\uDDC7\uD835\uDDCE\uD835\uDDC6\uD835\uDDBB\uD835\uDDBE\uD835\uDDCB " +
                                    "\uD835\uDDD0\uD835\uDDC2\uD835\uDDCD\uD835\uDDC1\uD835\uDDC2\uD835\uDDC7");

                            System.out.println("                       \uD835\uDDBA\uD835\uDDCD\uD835\uDDCD\uD835\uDDBE\uD835\uDDC6\uD835\uDDC9" +
                                    "\uD835\uDDCD\uD835\uDDCC. \uD835\uDDA0\uD835\uDDBF\uD835\uDDCD\uD835\uDDBE\uD835\uDDCB \uD835\uDDBE\uD835" +
                                    "\uDDBA\uD835\uDDBC\uD835\uDDC1 \uD835\uDDC0\uD835\uDDCE\uD835\uDDBE\uD835\uDDCC\uD835\uDDCC, \uD835\uDDCD" +
                                    "\uD835\uDDC1\uD835\uDDBE \uD835\uDDCE\uD835\uDDCC\uD835\uDDBE\uD835\uDDCB \uD835\uDDC0\uD835\uDDBE\uD835" +
                                    "\uDDCD\uD835\uDDCC \uD835\uDDC1\uD835\uDDC2\uD835\uDDC7\uD835\uDDCD\uD835\uDDCC \uD835\uDDC8\uD835\uDDC7 " +
                                    "\uD835\uDDD0\uD835\uDDC1\uD835\uDDBE\uD835\uDDCD\uD835\uDDC1\uD835\uDDBE\uD835\uDDCB \uD835\uDDCD\uD835\uDDC1" +
                                    "\uD835\uDDBE\uD835\uDDC2\uD835\uDDCB \uD835\uDDC0\uD835\uDDCE\uD835\uDDBE\uD835\uDDCC\uD835\uDDCC \uD835\uDDC2" +
                                    "\uD835\uDDCC \uD835\uDDCD\uD835\uDDC8\uD835\uDDC8 \uD835\uDDC1\uD835\uDDC2\uD835\uDDC0\uD835\uDDC1, \uD835" +
                                    "\uDDC5\uD835\uDDC8\uD835\uDDD0, \uD835\uDDC8\uD835\uDDCB \uD835\uDDBC\uD835\uDDC8\uD835\uDDCB\uD835\uDDCB" +
                                    "\uD835\uDDBE\uD835\uDDBC\uD835\uDDCD. \uD835\uDDB2\uD835\uDDC8");

                            System.out.println("                       \uD835\uDDCD\uD835\uDDC1\uD835\uDDBE \uD835\uDDC0\uD835\uDDBA\uD835\uDDC6" +
                                    "\uD835\uDDBE \uD835\uDDBE\uD835\uDDC7\uD835\uDDBD\uD835\uDDCC \uD835\uDDD0\uD835\uDDC1\uD835\uDDBE\uD835" +
                                    "\uDDC7 \uD835\uDDCD\uD835\uDDC1\uD835\uDDBE \uD835\uDDCE\uD835\uDDCC\uD835\uDDBE\uD835\uDDCB \uD835\uDDC0" +
                                    "\uD835\uDDCE\uD835\uDDBE\uD835\uDDCC\uD835\uDDCC\uD835\uDDBE\uD835\uDDCC \uD835\uDDCD\uD835\uDDC1\uD835\uDDBE " +
                                    "\uD835\uDDCC\uD835\uDDBE\uD835\uDDBC\uD835\uDDCB\uD835\uDDBE\uD835\uDDCD \uD835\uDDC7\uD835\uDDCE\uD835\uDDC6" +
                                    "\uD835\uDDBB\uD835\uDDBE\uD835\uDDCB \uD835\uDDC8\uD835\uDDCB \uD835\uDDCB\uD835\uDDCE\uD835\uDDC7\uD835\uDDCC " +
                                    "\uD835\uDDC8\uD835\uDDCE\uD835\uDDCD \uD835\uDDC8\uD835\uDDBF \uD835\uDDBA\uD835\uDDCD\uD835\uDDCD\uD835\uDDBE" +
                                    "\uD835\uDDC6\uD835\uDDC9\uD835\uDDCD\uD835\uDDCC.");

                            System.out.print("\n      【 \uD835\uDDA7\uD835\uDDC8\uD835\uDDD0 \uD835\uDDB3\uD835\uDDC8 \uD835\uDDAF\uD835" +
                                    "\uDDC5\uD835" +
                                    "\uDDBA\uD835\uDDD2 】 ❯❯❯❯❯❯❯❯❯❯ \uD835\uDDA0\uD835\uDDBC\uD835\uDDCD\uD835\uDDC2\uD835\uDDC8\uD835\uDDC7_\uD835" +
                                    "\uDDA6\uD835\uDDCE\uD835\uDDC2\uD835\uDDBD\uD835\uDDBE ▿  :  ");
                            System.out.print(" https://youtube.com/shorts/eRjwF5yO4XQ?si=XyOag963fpDRjD2m");

                            System.out.println("\n");
                            System.out.println("       ᴀꜱꜱᴜᴍɪɴɢ ʏᴏᴜ'ᴠᴇ ᴜɴᴅᴇʀꜱᴛᴏᴏᴅ ᴛʜᴇ ʀᴜʟᴇꜱ ᴘʀᴇᴘᴀʀɪɴɢ ᴛʜᴇ ᴀʀᴇɴᴀ ❯❯\n");
                            System.out.print("       ❯❯❯❯❯❯❯❯❯ \uD835\uDDA2\uD835\uDDAB\uD835\uDDA8\uD835\uDDA2\uD835\uDDAA  " +
                                    "\uD835\uDFF7 : \uD835\uDDB3\uD835\uDDC8 \uD835\uDDB2\uD835\uDDCD\uD835\uDDBA\uD835" +
                                    "\uDDCB\uD835\uDDCD \uD835\uDDB3\uD835\uDDC1\uD835\uDDBE \uD835\uDDA6\uD835\uDDBA\uD835\uDDC6\uD835\uDDBE : ");


                            int userChoice = sc.nextInt();

                            if (userChoice == 1) {
// ---------------------------------- Loading Game Animation like 20% , 50% , 90% , 99% -------------------------------------

                                System.out.println();
                                System.out.print("\n     ʟᴏᴀᴅɪɴɢ[ ");
                                for (int i = 0; i < 3; i++) {
                                    System.out.print("▓▓░░");
                                    Thread.sleep(15);
                                }
                                System.out.print(" ] \uD835\uDFE4\uD835\uDFE2% ⚡");

                                System.out.print("\n     ʟᴏᴀᴅɪɴɢ[ ");
                                for (int i = 0; i < 5; i++) {
                                    System.out.print("▓▓░░");
                                    Thread.sleep(35);
                                }
                                System.out.print(" ] \uD835\uDFE7\uD835\uDFE2% ⚡");

                                System.out.print("\n     ʟᴏᴀᴅɪɴɢ[ ");
                                for (int i = 0; i < 7; i++) {
                                    System.out.print("▓▓░░");
                                    Thread.sleep(125);
                                }
                                System.out.print(" ] \uD835\uDFEB\uD835\uDFE2% \uD83D\uDD25");

                                System.out.print("\n     ʟᴏᴀᴅɪɴɢ[ ");
                                for (int i = 0; i < 10; i++) {
                                    System.out.print("▓▓░░");
                                    Thread.sleep(800);
                                }
                                System.out.print(" ] \uD835\uDFEB\uD835\uDFEB% \uD83D\uDC8E");

                                // System.out.println("\n     Game Start");
                                // System.out.println(Thread.currentThread().getName()+ " : Arrivedsss Successfully to pick the game");


                                // ---------------------------------- Game Started Animation ------------------------------------

                                System.out.println("\n");
                                String gameStart = "       [ \uD835\uDC06\uD835\uDC00\uD835\uDC0C\uD835\uDC04 \uD835\uDC12\uD835" +
                                        "\uDC13\uD835\uDC00\uD835\uDC11\uD835\uDC13\uD835" +
                                        "\uDC04\uD835\uDC03 ]";

                                for (int i = 0; i < gameStart.length(); i++) {
                                    System.out.print(gameStart.charAt(i));
                                    Thread.sleep(80);
                                }
                                System.out.println();

                                // ----------------------------------------------------------------------------------------------

                                // ---------------------------------- Calling morraLogic method to pass the userName To It ---------------------------

                                NumberGuessGameLogic.numGuessLogic(userNameOfDB, conn);

                                // --------------------------------------------------------------------------------------------------------------

                                // -------------------------------------------------------------------------------------------------------------------

                                // -------------------------------------------------------------------------------------------------------------------
                            } else {
                                System.err.println("Invalid Choice Entered");
                                System.exit(400);
                            }


                        } else if (choice == 2) {
                            // ---------------------------------- Loading Game Animation like 20% , 50% , 90% , 99% -------------------------------------

                            System.out.println();
                            System.out.print("\n     ʟᴏᴀᴅɪɴɢ[ ");
                            for (int i = 0; i < 3; i++) {
                                System.out.print("▓▓░░");
                                Thread.sleep(15);
                            }
                            System.out.print(" ] \uD835\uDFE4\uD835\uDFE2% ⚡");

                            System.out.print("\n     ʟᴏᴀᴅɪɴɢ[ ");
                            for (int i = 0; i < 5; i++) {
                                System.out.print("▓▓░░");
                                Thread.sleep(35);
                            }
                            System.out.print(" ] \uD835\uDFE7\uD835\uDFE2% ⚡");

                            System.out.print("\n     ʟᴏᴀᴅɪɴɢ[ ");
                            for (int i = 0; i < 7; i++) {
                                System.out.print("▓▓░░");
                                Thread.sleep(125);
                            }
                            System.out.print(" ] \uD835\uDFEB\uD835\uDFE2% \uD83D\uDD25");

                            System.out.print("\n     ʟᴏᴀᴅɪɴɢ[ ");
                            for (int i = 0; i < 10; i++) {
                                System.out.print("▓▓░░");
                                Thread.sleep(800);
                            }
                            System.out.print(" ] \uD835\uDFEB\uD835\uDFEB% \uD83D\uDC8E");

                            // System.out.println("\n     Game Start");
                            // System.out.println(Thread.currentThread().getName()+ " : Arrivedsss Successfully to pick the game");

                            // ---------------------------------- Game Started Animation ------------------------------------

                            System.out.println("\n");
                            String gameStart = "       [ \uD835\uDC06\uD835\uDC00\uD835\uDC0C\uD835\uDC04 \uD835\uDC12\uD835" +
                                    "\uDC13\uD835\uDC00\uD835\uDC11\uD835\uDC13\uD835" +
                                    "\uDC04\uD835\uDC03 ]";

                            for (int i = 0; i < gameStart.length(); i++) {
                                System.out.print(gameStart.charAt(i));
                                Thread.sleep(80);
                            }
                            System.out.println();

                            // ----------------------------------------------------------------------------------------------

                            // ---------------------------------- Calling morraLogic method to pass the userName To It ---------------------------

                            NumberGuessGameLogic.numGuessLogic(userNameOfDB, conn);

                            // --------------------------------------------------------------------------------------------------------------

                            // -------------------------------------------------------------------------------------------------------------------

                            // -------------------------------------------------------------------------------------------------------------------
                        } else {
                            System.err.println("Invalid Choice Entered");
                            System.exit(407);
                        }

                        // ------------------------------------------------------------------------------------------------------------------


                    }
                    break;

                    default:
                        System.out.println("Something Went Wrong");
                }
            } catch (InterruptedException e) {
                System.out.println("\nError due to Thread Interruption during Game Picker : " + e.getMessage());
                e.printStackTrace();
            } catch (Exception e) {
                System.out.println("\nError during Game Picker : " + e.getMessage());
                e.printStackTrace();
            }


        }
        catch(InterruptedException e)
        {
            System.err.println("Interruption Error in GamePicker : "+e.getMessage());
            System.exit(405);
        }
        catch(Exception e)
        {
            System.err.println("Error in GamePicker : "+e.getMessage());
            System.exit(405);
        }
    }

    // -------------------------------------------------------------------------------------------------------------------------
}
