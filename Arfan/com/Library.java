package Arfan.com;
public class Library {

    public static void intro() throws InterruptedException{
        String logo="\t*\t*\t*\t*\t*   Welcome to ~ UET ~ Central Library  \t*\t*\t*\t*\t*" ;
        for(int i=0;i<logo.length();i++){
           Thread.sleep(120);
           System.out.print(logo.charAt(i));
       }
       System.out.println("\n\t\t\t\t\t  --------------------------------------\n\n");

   }

   public static void introduction(){
       System.out.println("1 -> Guest");
       System.out.println("2 -> Register User");
       System.out.println("3 -> Exit");
   }

   public  static void displayMember(){

       System.out.println("\n\t  *** MENU ***");
       System.out.println("1.--> View Books Available");
       System.out.println("2.--> Search Books");
       System.out.println("3.--> Add book");
       System.out.println("4.--> Borrow Book");
//       System.out.println("5.--> Register User");
       System.out.println("5.--> Log Out");


   }
    public  static void displayGuest(){

        System.out.println("\n\t  *** MENU ***");
        System.out.println("1.--> View Books Available");
        System.out.println("2.--> Search Books");
        System.out.println("3.--> Return to Main ");


    }
   public static void endInfo() {
       System.out.println("\n\t~~~~~~~~~~~~~~~~~ Thanks for visiting UET Central Library ~~~~~~~~~~~~~~~~~\n\t\t\t\t\t\t\t\t\tGoodbye!");
       System.exit(0);
   }
}
