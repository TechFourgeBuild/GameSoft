import java.sql.*;
import java.util.Scanner;

class AnimationLoader implements Runnable{
    @Override
    public void run() {
        try {


            // ----------------------------------- Using MultiThreading To Print the Stylish Intro of Game ------------------------------

            GameIntroAnimation.animatorForGame();

            // -------------------------------------------------------------------------------------------------------------------------

        }
        catch (InterruptedException e) {
            System.out.println("Error cause due to sleep : "+e.getMessage());
            e.printStackTrace();
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
          Connection conn = DriverManager.getConnection(DBConfigForGameSoft.DB_URL,DBConfigForGameSoft.USERNAME,DBConfigForGameSoft.PASSWORD);
          AnimationLoader al = new AnimationLoader();
          Thread t1 = new Thread(al);
          t1.start();
          t1.join();
            System.out.println();
            System.out.println();
            // ---------------------------- Printing : Click 1 : To Check Which Games We Provide --------------------------------------------
          System.out.println("    ❯❯❱ \uD835\uDC02\uD835\uDC0B\uD835\uDC08\uD835\uDC02\uD835\uDC0A \uD835\uDFCF ❰❮❮ :  \uD83E\uDDD0\uD83E" +
                  "\uDDD0\uD83E\uDDD0 \uD835\uDDB3\uD835\uDDC8 \uD835\uDDA2\uD835\uDDC1\uD835\uDDBE\uD835\uDDBC\uD835\uDDC4 \uD835" +
                  "\uDDB6\uD835\uDDC1\uD835\uDDC2\uD835\uDDBC\uD835\uDDC1 \uD835\uDDA6\uD835\uDDA0\uD835\uDDAC\uD835\uDDA4\uD835" +
                  "\uDDB2 \uD835\uDDB6\uD835\uDDBE \uD835\uDDAF\uD835\uDDCB\uD835\uDDC8\uD835\uDDCF\uD835\uDDC2\uD835\uDDBD\uD835" +
                  "\uDDBE \uD83E\uDDD0\uD83E" +
                  "\uDDD0\uD83E\uDDD0");

          // -------------------------------------------------------------------------------------------------------------------------------

            // ---------------------------------- Printing : Click 0 : To Exit ----------------------------------------------------------
          System.out.println("    ❯❯❱ \uD835\uDC02\uD835\uDC0B\uD835\uDC08\uD835\uDC02\uD835\uDC0A \uD835\uDFCE ❰❮❮:  To EXIT ➡\uFE0F➡\uFE0F➡\uFE0F");

          // ----------------------------------------------------------------------------------------------------------------------------

          // ------------------------- Taking User Choice , Weather He/She want to proceed the game or not ---------------------------------

          System.out.println("\n\uD835\uDDA4\uD835\uDDC7\uD835\uDDCD\uD835\uDDBE\uD835\uDDCB \uD835\uDDB8\uD835" +
                  "\uDDC8\uD835\uDDCE\uD835\uDDCB \uD835\uDDA2\uD835\uDDC1\uD835\uDDC8\uD835\uDDC2\uD835\uDDBC\uD835\uDDBE ⏬⏬⏬");
          int choice = sc.nextInt();

          if(choice == 1)
          {
               try {

                   // ----------------------------- Printing :- 𝐁𝐄𝐋𝐎𝐖 𝐀𝐑𝐄 𝐓𝐇𝐄 𝐋𝐈𝐒𝐓 𝐎𝐅 𝐆𝐀𝐌𝐄𝐒 𝐓𝐇𝐀𝐓 𝐖𝐄 𝐏𝐑𝐎𝐕𝐈𝐃𝐄 ---------------------------------

                   System.out.println();
                   System.out.println();
                   System.out.print("                  ");
                   for (int i = 0; i < 3; i++) {
                       System.out.print("▄︻デ══━一\uD83D\uDCA5");
                       Thread.sleep(14,950000);
                   }

                   // ---------------------------------- Printing : Below are the list of games that we Provide ---------------------------------

                   String gameIntro =  "  \uD835\uDC01\uD835\uDC04\uD835\uDC0B\uD835\uDC0E\uD835\uDC16 \uD835\uDC00\uD835\uDC11\uD835\uDC04 " +
                           "\uD835\uDC13\uD835\uDC07\uD835\uDC04 \uD835\uDC0B\uD835\uDC08\uD835\uDC12\uD835\uDC13 \uD835\uDC0E\uD835\uDC05 " +
                           "\uD835\uDC06\uD835\uDC00\uD835\uDC0C\uD835\uDC04\uD835\uDC12 \uD835\uDC13\uD835\uDC07\uD835\uDC00\uD835\uDC13 " +
                           "\uD835\uDC16\uD835\uDC04 \uD835\uDC0F\uD835\uDC11\uD835\uDC0E\uD835\uDC15\uD835\uDC08\uD835\uDC03\uD835\uDC04";

                   // ---------------------------------------------------------------------------------------------------------------------------

                   for (int i = 0; i < gameIntro.length(); i++) {
                       System.out.print(gameIntro.charAt(i));
                       Thread.sleep(54);
                   }
                   System.out.print("  ");
                   for (int i = 0; i < 10; i++) {
                       System.out.print("⁀જ➣");
                       Thread.sleep(14,950000);
                   }

                   // --------------------------------------------------------------------------------------------------------------------------

                  // ----------------------------- GAME DISPLAYING THE NAME OF GAMES WE PROVIDE ------------------------

                   System.out.println();
                   System.out.println();
                   for (int i = 0; i < 10; i++) {
                       System.out.print(" ");
                   }
                   System.out.println();

                   System.out.println("     [ \uD835\uDD3E\uD835\uDD38\uD835\uDD44\uD835\uDD3C \uD835\uDFD9 ]" +
                           " : ▶▶▶▶▶▶▶▶▶▶▶▶▶▶▶ 🎭🎭🎭🎭 \uD835\uDD44\uD835\uDD46ℝℝ\uD835\uDD38 🎭🎭🎭🎭 ▶▶▶▶▶▶▶▶▶▶▶▶▶▶▶");
                   System.out.println("     [ \uD835\uDD3E\uD835\uDD38\uD835\uDD44\uD835\uDD3C \uD835\uDFDA ]" +
                           " : ▶▶▶▶▶▶▶▶▶▶▶▶▶▶▶ 🪨📃✂️ ℝ\uD835\uDD46ℂ\uD835\uDD42 ℙ\uD835\uDD38ℙ\uD835\uDD3Cℝ " +
                           "\uD835\uDD4Aℂ\uD835\uDD40\uD835\uDD4A\uD835\uDD4A\uD835\uDD46ℝ 🪨📃✂️ ▶▶▶▶▶▶▶▶▶▶▶▶▶▶▶");
                   System.out.println("     [ \uD835\uDD3E\uD835\uDD38\uD835\uDD44\uD835\uDD3C \uD835\uDFDB ]" +
                           " : ▶▶▶▶▶▶▶▶▶▶▶▶▶▶▶ 🤷🤷🤷‍♂️🤷‍ ℕ\uD835\uDD4C\uD835\uDD44\uD835\uDD39\uD835\uDD3Cℝ " +
                           "\uD835\uDD3E\uD835\uDD4C\uD835\uDD3C\uD835\uDD4A\uD835\uDD4A\uD835\uDD40ℕ\uD835\uDD3E 🤷🤷🤷‍♂️🤷‍♂️ ▶▶▶▶▶▶▶▶▶▶▶▶▶▶▶");

//                   System.out.println();

                   // ---------------------------------------------Taking UserName if He/She already Exist in DB -------------------------------

                   System.out.println("\n    \uD835\uDDB3\uD835\uDDC8 \uD835\uDDC9\uD835\uDDC5\uD835\uDDBA\uD835\uDDD2 \uD835\uDDCD" +
                           "\uD835\uDDC1\uD835\uDDBE \uD835\uDDC0\uD835\uDDBA\uD835\uDDC6\uD835\uDDBE, \uD835\uDDD0\uD835\uDDBE \uD835" +
                           "\uDDC7\uD835\uDDBE\uD835\uDDBE\uD835\uDDBD \uD835\uDDD2\uD835\uDDC8\uD835\uDDCE\uD835\uDDCB \uD835\uDDBA" +
                           "\uD835\uDDBC\uD835\uDDBC\uD835\uDDC8\uD835\uDDCE\uD835\uDDC7\uD835\uDDCD \uD835\uDDCD\uD835\uDDC8 \uD835" +
                           "\uDDBB\uD835\uDDBE \uD835\uDDBC\uD835\uDDCB\uD835\uDDBE\uD835\uDDBA\uD835\uDDCD\uD835\uDDBE\uD835\uDDBD.");
                   System.out.println("\n   『 ꜱʏꜱᴛᴇᴍ_ᴄʜᴇᴄᴋ 』 ❯❯ \uD835\uDE70\uD835\uDE7B\uD835\uDE81\uD835\uDE74\uD835\uDE70\uD835" +
                           "\uDE73\uD835\uDE88 \uD835\uDE77\uD835\uDE70\uD835\uDE85\uD835\uDE74 \uD835\uDE70\uD835\uDE7D \uD835" +
                           "\uDE70\uD835\uDE72\uD835\uDE72\uD835\uDE7E\uD835\uDE84\uD835\uDE7D\uD835\uDE83 ??? ");
                   System.out.print("    \uD835\uDDCC\uD835\uDDBE\uD835\uDDC5\uD835\uDDBE\uD835\uDDBC\uD835\uDDCD " +
                           "\uD835\uDDBA\uD835\uDDBC\uD835\uDDCD\uD835\uDDC2\uD835\uDDC8\uD835\uDDC7 \uD800\uDD02 " +
                           "[ \uD835\uDDD2 / \uD835\uDDC7 ] — : ");

                   String userOpt = sc.next();
                   String originalUserOpt = userOpt.toLowerCase();

                   if(originalUserOpt.equals("y"))
                   {
                       System.out.println("\n      ╔═══════════════════════════════════════════╗");
                       System.out.println("        ** ◈ \uD835\uDC10\uD835\uDC14\uD835\uDC04\uD835\uDC11\uD835\uDC18\uD835\uDC08\uD835" +
                               "\uDC0D\uD835\uDC06 \uD835\uDC06\uD835\uDC1A\uD835\uDC26\uD835\uDC1E\uD835\uDC12\uD835\uDC28\uD835\uDC1F" +
                               "\uD835\uDC2D \uD835\uDC00\uD835\uDC11\uD835\uDC04\uD835\uDC0D\uD835\uDC00 \uD835\uDC03\uD835\uDC00\uD835" +
                               "\uDC13\uD835\uDC00\uD835\uDC01\uD835\uDC00\uD835\uDC12\uD835\uDC04 ◈ **");
                       System.out.print("        ** ❯❯ \uD835\uDDA4\uD835\uDDC7\uD835\uDDCD\uD835\uDDBE\uD835\uDDCB \uD835\uDDB8" +
                               "\uD835\uDDC8\uD835\uDDCE\uD835\uDDCB \uD835\uDDA6\uD835\uDDBA\uD835\uDDC6\uD835\uDDC2\uD835\uDDC7" +
                               "\uD835\uDDC0 \uD835\uDDAD\uD835\uDDBA\uD835\uDDC6\uD835\uDDBE : ");

                       String userVerify = sc.next();
                       String clearUserVerify = userVerify.trim();
                       String userNameFromDB = SavingUserDataToDB.userSendsToMain(conn, clearUserVerify);
                       String clearingUserNameFromDB = userNameFromDB.trim();

                       // ------------------------ Calling GamePicker Method for sending the userNameFromDB to it -----------------------

//                       GamePicker.pickGame(userNameFromDB);

                       // --------------------------------------------------------------------------------------------------------------

                       if(clearUserVerify.length() >= 4 && clearUserVerify.startsWith("@") && clearUserVerify.length()<=8 &&
                               clearUserVerify.equals(clearingUserNameFromDB))
                       {
                           System.out.println("      ╚═══════════════════════════════════════════╝\n");
                           System.out.println();
                           System.out.println("      "+clearingUserNameFromDB+" :— \uD835\uDDB8\uD835\uDDC8\uD835\uDDCE " +
                                   "\uD835\uDDBA\uD835\uDDC5\uD835\uDDCB\uD835\uDDBE\uD835\uDDBA\uD835\uDDBD\uD835\uDDD2 " +
                                   "\uD835\uDDBE\uD835\uDDD1\uD835\uDDC2\uD835\uDDCC\uD835\uDDCD \uD835\uDDC2\uD835\uDDC7 " +
                                   "\uD835\uDDC8\uD835\uDDCE\uD835\uDDCB \uD835\uDDC0\uD835\uDDC5\uD835\uDDC8\uD835\uDDBB" +
                                   "\uD835\uDDBA\uD835\uDDC5 \uD835\uDDCC\uD835\uDDD2\uD835\uDDCC\uD835\uDDCD\uD835\uDDBE\uD835\uDDC6.");
                           System.out.print("         \uD835\uDE7B\uD835\uDE98\uD835\uDE90\uD835\uDE92\uD835\uDE97 \uD835\uDE82\uD835" +
                                   "\uDE9E\uD835\uDE8C\uD835\uDE8C\uD835\uDE8E\uD835\uDE9C\uD835\uDE9C\uD835\uDE8F\uD835\uDE9E\uD835" +
                                   "\uDE95 — \uD835\uDE81\uD835\uDE8E\uD835\uDE9C\uD835\uDE9E\uD835\uDE96\uD835\uDE92\uD835\uDE97" +
                                   "\uD835\uDE90 \uD835\uDE7F\uD835\uDE95\uD835\uDE8A\uD835\uDEA2\uD835\uDE8E\uD835\uDE9B \uD835" +
                                   "\uDE82\uD835\uDE8E\uD835\uDE9C\uD835\uDE9C\uD835\uDE92\uD835\uDE98\uD835\uDE97");
                           for (int i = 0; i < 5; i++) {
                               System.out.print(".");
                               Thread.sleep(700);
                           }
                       }
                       else
                       {
                           System.err.println("\n     「 ✘ 」 \uD835\uDDA4\uD835\uDDB1\uD835\uDDB1\uD835\uDDAE\uD835\uDDB1: \uD835\uDDB4\uD835\uDDCC" +
                                   "\uD835\uDDBE\uD835\uDDCB\uD835\uDDC7\uD835\uDDBA\uD835\uDDC6\uD835\uDDBE \uD835\uDDC7\uD835\uDDC8\uD835\uDDCD " +
                                   "\uD835\uDDCB\uD835\uDDBE\uD835\uDDBC\uD835\uDDC8\uD835\uDDC0\uD835\uDDC7\uD835\uDDC2\uD835\uDDD3\uD835" +
                                   "\uDDBE\uD835" +
                                   "\uDDBD \uD835\uDDC2\uD835\uDDC7 \uD835\uDDCD\uD835\uDDC1\uD835\uDDBE \uD835\uDDA0\uD835\uDDCB\uD835\uDDBE\uD835" +
                                   "\uDDC7\uD835\uDDBA...");
                           System.exit(404);
                       }

                   }

                   // ----------------------------------------------------------------------------------------------------------------------


                   // ------------------------------------------- If User Not Already Exist in DB - Creating NEW USER ---------------------------

                   else if (originalUserOpt.equals("n"))
                   {
                       System.out.print("\n    ➤➤➤➤➤➤➤➤➤➤➤➤➤");
                       System.out.println("  『\uD835\uDE78\uD835\uDE7D\uD835\uDE7F\uD835\uDE84\uD835\uDE83_\uD835\uDE81" +
                               "\uD835\uDE74\uD835\uDE80\uD835\uDE84\uD835\uDE78\uD835\uDE81\uD835\uDE74\uD835\uDE73』 ❯❯ " +
                               "\uD835\uDE74\uD835\uDE7D\uD835\uDE83\uD835\uDE74\uD835\uDE81 \uD835\uDE88\uD835\uDE7E\uD835\uDE84\uD835\uDE81 " +
                               "\uD835\uDE76\uD835\uDE70\uD835\uDE7C\uD835\uDE78\uD835\uDE7D\uD835\uDE76 \uD835\uDE7D\uD835\uDE70\uD835\uDE7C" +
                               "\uD835\uDE74 \uD835\uDE83\uD835\uDE7E \uD835\uDE7F\uD835\uDE7B\uD835\uDE70\uD835\uDE88 \uD835\uDE88" +
                               "\uD835\uDE7E\uD835\uDE84\uD835\uDE81 \uD835\uDE75\uD835\uDE70\uD835\uDE85\uD835\uDE7E\uD835\uDE84" +
                               "\uD835\uDE81\uD835\uDE78\uD835\uDE83\uD835\uDE74 \uD835\uDE76\uD835\uDE70\uD835\uDE7C\uD835\uDE74 👇👇👇" +
                               ""+"  ➤➤" +
                               "➤➤➤➤➤➤➤➤➤➤➤");

                       System.out.println("  \uD835\uDDA8\uD835\uDDAD\uD835\uDDB2\uD835\uDDB3\uD835\uDDB1\uD835" +
                               "\uDDB4\uD835\uDDA2\uD835\uDDB3\uD835\uDDA8\uD835\uDDAE\uD835\uDDAD \uD835\uDDA5\uD835\uDDAE\uD835\uDDB1 " +
                               "\uD835\uDDA2\uD835\uDDB1\uD835\uDDA4\uD835\uDDA0\uD835\uDDB3\uD835\uDDA8\uD835\uDDAD\uD835\uDDA6 " +
                               "\uD835\uDDB3\uD835\uDDA7\uD835\uDDA4 \uD835\uDDA1\uD835\uDDA4\uD835\uDDB2\uD835\uDDB3 " +
                               "\uD835\uDDAD\uD835\uDDA0\uD835\uDDAC\uD835\uDDA4: \n" +
                               "   ⅰ) \uD835\uDDAD\uD835\uDDBA\uD835\uDDC6\uD835\uDDBE \uD835\uDDCC\uD835\uDDC1\uD835" +
                               "\uDDC8\uD835\uDDCE\uD835\uDDC5\uD835\uDDBD \uD835\uDDCC\uD835\uDDCD\uD835\uDDBA\uD835\uDDCB\uD835\uDDCD " +
                               "\uD835\uDDD0\uD835\uDDC2\uD835\uDDCD\uD835\uDDC1 @\n" +
                               "   ⅱ) \uD835\uDDAD\uD835\uDDBA\uD835\uDDC6\uD835\uDDBE \uD835\uDDC6\uD835\uDDCE\uD835\uDDCC\uD835\uDDCD " +
                               "\uD835\uDDBB\uD835\uDDBE \uD835\uDFE6–\uD835\uDFEA \uD835\uDDBC\uD835\uDDC1\uD835\uDDBA\uD835\uDDCB\uD835" +
                               "\uDDBA\uD835\uDDBC\uD835\uDDCD\uD835\uDDBE\uD835\uDDCB\uD835\uDDCC \uD835\uDDC2\uD835\uDDC7 \uD835\uDDC5\uD835" +
                               "\uDDBE\uD835\uDDC7\uD835\uDDC0\uD835\uDDCD\uD835\uDDC1\n" +
                               "   ⅲ) \uD835\uDDA4\uD835\uDDD1\uD835\uDDBA\uD835\uDDC6\uD835\uDDC9\uD835\uDDC5\uD835\uDDBE " +
                               ":– @\uD835\uDC0C\uD835\uDC1E\uD835\uDC1E\uD835\uDC2D\uD835\uDC17, " +
                               "@\uD835\uDC0F\uD835\uDC2B\uD835\uDC1A\uD835\uDC2D\uD835\uDC21\uD835\uDC1A\uD835\uDC26, " +
                               "@\uD835\uDC09\uD835\uDC1A\uD835\uDC22\uD835\uDC2F\uD835\uDC32\uD835\uDC0E\uD835\uDC0F");


                       System.out.println("  \uD835\uDDA0\uD835\uDDCC\uD835\uDDCC\uD835\uDDCE\uD835\uDDC6\uD835\uDDC2\uD835\uDDC7\uD835\uDDC0 " +
                               "\uD835\uDDD2\uD835\uDDC8\uD835\uDDCE'\uD835\uDDCF\uD835\uDDBE \uD835\uDDCE\uD835\uDDC7\uD835\uDDBD\uD835\uDDBE" +
                               "\uD835\uDDCB\uD835\uDDCC\uD835\uDDCD\uD835\uDDC8\uD835\uDDC8\uD835\uDDBD \uD835\uDDCD\uD835\uDDC1\uD835\uDDBE " +
                               "\uD835\uDDBA\uD835\uDDBB\uD835\uDDC8\uD835\uDDCF\uD835\uDDBE \uD835\uDDC2\uD835\uDDC7\uD835\uDDCC\uD835\uDDCD\uD835" +
                               "\uDDCB\uD835\uDDCE\uD835\uDDBC\uD835\uDDCD\uD835\uDDC2\uD835\uDDC8\uD835\uDDC7, \uD835\uDDC7\uD835\uDDC8\uD835\uDDD0 " +
                               "\uD835\uDDBC\uD835\uDDCB\uD835\uDDBE\uD835\uDDBA\uD835\uDDCD\uD835\uDDBE " +
                               "\uD835\uDDD2\uD835\uDDC8\uD835\uDDCE\uD835\uDDCB " +
                               "\uD835\uDC06\uD835\uDC1A\uD835\uDC26\uD835\uDC22\uD835\uDC27\uD835\uDC20 " +
                               "\uD835\uDC0D\uD835\uDC1A\uD835\uDC26\uD835\uDC1E : ");


                       String userName = sc.next();
                       if(userName.length()<=8 && userName.length()>=4 && userName.startsWith("@"))
                       {
                           System.out.println("\n   userName : "+userName);

                           // ------------------------- Using Multithreading for saving the user Credentials to Database -------------------

                           Thread t2 = new Thread(() -> {
                              SavingUserDataToDB.userCredentialHandler(userName, conn);
                           });
                           t2.start();
                           t2.join(); // Stopping main thread , so that t2 thread can perform it's task.

                           // --------------------------------------------------------------------
                       }
                       else
                       {
                           System.err.println("Invalid Username Entered");
                           System.exit(400);
                       }

                   }

                   // ------------------------------------------------------------------------------------------------------------------------

                   // -------------------------------------- Handling the Gibberish text of the User -------------------------------
                   else
                   {
                       System.err.println("Invalid Choice Entered");
                       System.exit(409);
                   }

                   System.out.println("\n");

                   // -------------------------------------------------------------------------------------------------------------

                   // --------------------- Providing Option to user to pick their favourite games out of 3 games--------------

                   System.out.println("    ≫≫≫≫≫≫≫≫≫≫≫≫≫≫ \uD835\uDC12\uD835\uDC04\uD835\uDC0B\uD835\uDC04\uD835\uDC02\uD835\uDC13 " +
                           "\uD835\uDC16\uD835\uDC07\uD835\uDC08\uD835\uDC02\uD835\uDC07 \uD835\uDC06\uD835\uDC00\uD835\uDC0C\uD835\uDC04 " +
                           "\uD835\uDC18\uD835\uDC0E\uD835\uDC14 \uD835\uDC16\uD835\uDC0E\uD835\uDC14\uD835\uDC0B\uD835\uDC03 " +
                           "\uD835\uDC0B\uD835\uDC08\uD835\uDC0A\uD835\uDC04 \uD835\uDC13\uD835\uDC0E " +
                           "\uD835\uDC0F\uD835\uDC0B\uD835\uDC00\uD835\uDC18 ≪≪≪≪≪≪≪≪≪≪≪≪≪≪\n");
                   System.out.println("    ❯❯❯❯❯❯ \uD835\uDC0F\uD835\uDC11\uD835\uDC04\uD835\uDC12\uD835\uDC12 \uD835\uDFCF " +
                           "\uD835\uDC05\uD835\uDC0E\uD835\uDC11 \uD835\uDC0C\uD835\uDC0E\uD835\uDC11\uD835\uDC11\uD835\uDC00");
                   System.out.println("    ❯❯❯❯❯❯ \uD835\uDC0F\uD835\uDC11\uD835\uDC04\uD835\uDC12\uD835\uDC12 \uD835\uDFD0 " +
                           "\uD835\uDC05\uD835\uDC0E\uD835\uDC11 \uD835\uDC11\uD835\uDC0E\uD835\uDC02\uD835\uDC0A " +
                           "\uD835\uDC0F\uD835\uDC00\uD835\uDC0F\uD835\uDC04\uD835\uDC11 " +
                           "\uD835\uDC12\uD835\uDC02\uD835\uDC08\uD835\uDC12\uD835\uDC12\uD835\uDC0E\uD835\uDC11");
                   System.out.println("    ❯❯❯❯❯❯ \uD835\uDC0F\uD835\uDC11\uD835\uDC04\uD835\uDC12\uD835\uDC12 \uD835\uDFD1 " +
                           "\uD835\uDC05\uD835\uDC0E\uD835\uDC11 \uD835\uDC0D\uD835\uDC14\uD835\uDC0C\uD835\uDC01\uD835\uDC04\uD835\uDC11 " +
                           "\uD835\uDC06\uD835\uDC14\uD835\uDC04\uD835\uDC12\uD835\uDC12\uD835\uDC08\uD835\uDC0D\uD835\uDC06");

                   System.out.println("\n    ❱❱ \uD835\uDC02\uD835\uDC07\uD835\uDC0E\uD835\uDC0E\uD835\uDC12\uD835\uDC04 \uD835\uDC00 " +
                           "\uD835\uDC0D\uD835\uDC14\uD835\uDC0C\uD835\uDC01\uD835\uDC04\uD835\uDC11 [\uD835\uDFCF-\uD835\uDFD1] " +
                           "\uD835\uDC13\uD835\uDC0E \uD835\uDC0B\uD835\uDC00\uD835\uDC14\uD835\uDC0D\uD835\uDC02\uD835\uDC07 " +
                           "\uD835\uDC18\uD835\uDC0E\uD835\uDC14\uD835\uDC11 \uD835\uDC06\uD835\uDC00\uD835\uDC0C\uD835\uDC04");
                   int fav = sc.nextInt();

                   // ---------------------------------------------------------------------------------------------------------------------------

                   // ---------------------------- Calling another class methods for picking and executing the Game ----------------------------

                   if(1<=fav && fav<=3)
                   {
                       // ---------------------- sending user choice games to pickGame method for further processing -------------------
                      String userNameFromDbase = SavingUserDataToDB.userNameReturnerFromDB();
                       Thread t3 = new Thread(()->{
                                   GamePicker.pickGame(fav,userNameFromDbase, conn);
//                           System.out.println("Current User from DB :- "+userNameFromDbase);
                               });
                       t3.start();
                       t3.join();

                       // ---------------------------------------------------------------------------------------------------------------
                   }
                   else
                   {
                       System.err.println("Invalid Number Entered");
                       System.exit(404);
                   }
                   // -------------------------------------------------------------------------------------------------------------------
               }

               catch(InterruptedException e)
               {
                   System.out.println("Error while choice : "+e.getMessage());
                   e.printStackTrace();
               }
          }

          else
          {

              // ------------------------------------------------------------ Kicking out the  User From Game -------------------------------------

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

              System.exit(200);

              // ---------------------------------------------------------------------------------------------------------------------------------
          }

          // --------------------------------------------------------------------------------------------------------------------------------
          conn.close();
        } catch (SQLException e) {
            System.out.println("Error cause in main due to sql : "+e.getMessage());;
            e.printStackTrace();
        }
        catch(Exception e) {
            System.out.println("Error cause in main : "+e.getMessage());
            e.printStackTrace();
        }
    }
}
