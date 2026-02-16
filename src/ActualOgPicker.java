import java.sql.Connection;
import java.util.Scanner;

public class ActualOgPicker {
    public static void OGPicker(Connection conn, String playerName) {
        try {
            // ------------------------------------------------------------- Getting Best Players Along With The Dhurandhar ------------------------------------
            Scanner sc = new Scanner(System.in);
            // ------------------------------- Getting Dhurandhar of the Game ---------------------------------------------------
            System.out.println();
            // ----------------- Meet the OG player of GameSoft before you start ----------------------
            System.out.println("                ❯❯ ❱ \uD835\uDC0C\uD835\uDC1E\uD835\uDC1E\uD835\uDC2D \uD835\uDC2D\uD835\uDC21\uD835\uDC1E \uD835\uDC0E" +
                    "\uD835\uDC06 \uD835\uDC29\uD835\uDC25\uD835\uDC1A\uD835\uDC32\uD835\uDC1E\uD835\uDC2B \uD835\uDC28\uD835\uDC1F \uD835" +
                    "\uDC06\uD835\uDC1A\uD835\uDC26\uD835\uDC1E\uD835\uDC12\uD835\uDC28\uD835\uDC1F\uD835\uDC2D \uD835\uDC1B\uD835\uDC1E" +
                    "\uD835\uDC1F\uD835\uDC28\uD835\uDC2B\uD835\uDC1E \uD835\uDC32\uD835\uDC28\uD835\uDC2E \uD835\uDC2C\uD835\uDC2D\uD835" +
                    "\uDC1A\uD835\uDC2B\uD835\uDC2D ❰ ❮❮");
            System.out.println();
            // ---------------------------------------------------------------------------------------------------------------------------
            // -------------- Click 1: Meet Dhurandhar – the ultimate all-rounder in GameSoft -------------------------
            System.out.println("                    \uD835\uDDA2\uD835\uDDC5\uD835\uDDC2\uD835\uDDBC\uD835\uDDC4 \uD835\uDFE3: \uD835\uDDAC\uD835" +
                    "\uDDBE\uD835\uDDBE\uD835\uDDCD \uD835\uDDA3\uD835\uDDC1\uD835\uDDCE\uD835\uDDCB\uD835\uDDBA\uD835\uDDC7" +
                    "\uD835\uDDBD\uD835\uDDC1\uD835\uDDBA\uD835\uDDCB – \uD835\uDDCD\uD835\uDDC1\uD835\uDDBE \uD835\uDDCE\uD835" +
                    "\uDDC5\uD835\uDDCD\uD835\uDDC2\uD835\uDDC6\uD835\uDDBA\uD835\uDDCD\uD835\uDDBE \uD835\uDDBA\uD835\uDDC5" +
                    "\uD835\uDDC5-\uD835\uDDCB\uD835\uDDC8\uD835\uDDCE\uD835\uDDC7\uD835\uDDBD\uD835\uDDBE\uD835\uDDCB \uD835" +
                    "\uDDC2\uD835\uDDC7 \uD835\uDDA6\uD835\uDDBA\uD835\uDDC6\uD835\uDDBE\uD835\uDDB2\uD835\uDDC8\uD835\uDDBF\uD835\uDDCD");
            // ------------------------------------------------------------------------------------------------------------------------

            // -------------- Click 5: Unlock GameSoft’s Top-Rated Player-------------------------------------------------
            System.out.println("                    \uD835\uDDA2\uD835\uDDC5\uD835\uDDC2\uD835\uDDBC\uD835\uDDC4 \uD835\uDFE7: \uD835\uDDB4\uD835" +
                    "\uDDC7\uD835" +
                    "\uDDC5\uD835\uDDC8\uD835\uDDBC\uD835\uDDC4 \uD835\uDDA6\uD835\uDDBA\uD835\uDDC6\uD835\uDDBE\uD835\uDDB2\uD835\uDDC8" +
                    "\uD835\uDDBF\uD835\uDDCD’\uD835\uDDCC \uD835\uDDB3\uD835\uDDC8\uD835\uDDC9-\uD835\uDDB1\uD835\uDDBA\uD835\uDDCD" +
                    "\uD835\uDDBE\uD835\uDDBD \uD835\uDDAF\uD835\uDDC5\uD835\uDDBA\uD835\uDDD2\uD835\uDDBE\uD835\uDDCB");
            // -----------------------------------------------------------------------------------------------------------------------
            // -------------- Click 6: Jump Straight into the Game ------------------------------------------------
            System.out.println("                    \uD835\uDDA2\uD835\uDDC5\uD835\uDDC2\uD835\uDDBC\uD835\uDDC4 \uD835\uDFE8: \uD835\uDDA9\uD835\uDDCE" +
                    "\uD835\uDDC6\uD835\uDDC9 \uD835\uDDB2\uD835\uDDCD\uD835\uDDCB\uD835\uDDBA\uD835\uDDC2\uD835\uDDC0\uD835\uDDC1" +
                    "\uD835\uDDCD \uD835\uDDC2\uD835\uDDC7\uD835\uDDCD\uD835\uDDC8 \uD835\uDDCD\uD835\uDDC1\uD835\uDDBE \uD835\uDDA6" +
                    "\uD835\uDDBA\uD835\uDDC6\uD835\uDDBE");
            // -----------------------------------------------------------------------------------------------------------------------
            // --------------- Enter Your Choice : ----------------------------------------------------------------------------------
            System.out.println();
            System.out.print("               \uD835\uDDA4\uD835\uDDC7\uD835\uDDCD\uD835\uDDBE\uD835\uDDCB \uD835\uDDB8\uD835\uDDC8\uD835\uDDCE" +
                    "\uD835\uDDCB \uD835\uDDA2\uD835\uDDC1\uD835\uDDC8\uD835\uDDC2\uD835\uDDBC\uD835\uDDBE : ");
            // ----------------------------------------------------------------------------------------------------------------------
            int choice = sc.nextInt();

            switch (choice) {
                case 1: {
                    WinnersWorld.gettingDhurandhar(conn, playerName);
                }
                break;

                case 5: {
                    WinnersWorld.topRatedPlayer(conn, playerName);
                }
                break;
                case 6: {
                    // --------------- Printing : Directly Jumping To Game ---------------------------------------------------------
                    String outs = "\uD835\uDC7A\uD835\uDC95\uD835\uDC82\uD835\uDC93\uD835\uDC95\uD835\uDC8A\uD835\uDC8F\uD835" +
                            "\uDC88 \uD835\uDC95\uD835\uDC89\uD835\uDC86 \uD835\uDC6E\uD835\uDC82\uD835\uDC8E\uD835\uDC86 \uD835" +
                            "\uDC6B\uD835\uDC8A\uD835\uDC93\uD835\uDC86\uD835\uDC84\uD835\uDC95\uD835\uDC8D\uD835\uDC9A.....";
                    // ------------------------------------------------------------------------------------------------------------
                    System.out.println();
                    for (int i = 0; i < outs.length(); i++) {
                        System.out.print(outs.charAt(i));
                        Thread.sleep(60);
                    }

                }
                break;

                default: {
                    System.err.println("Invalid Choice Entered");
                    System.exit(400);
                }
                break;
            }
            // ------------------------------------------------------------------------------------------------------------------
        } catch (InterruptedException e) {
            System.err.println("Interruption Error occur due to Thread While Getting OG : " + e.getMessage());
            System.exit(500);
        } catch (Exception e) {
            System.err.println("Error occur while OG getting : " + e.getMessage());
            System.exit(500);
        }
    }
}
