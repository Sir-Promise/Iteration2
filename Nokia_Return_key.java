import java.util.Scanner;
public class Nokia_Return_key{
    static Scanner scanner = new Scanner(System.in);
    static String menu = " ";
  
    public static void main(String[]a){
    
    menu();
   
   
    }
static void menu(){
    menu = """
======== Nokia 3310 Menu ==========

        1. Phone Book
        2. Messages
        3. Chat
        4. Register
        5. Tones
        6. Settings
        7. Call divert
        8. Games
        9. Calculator
        10. Reminder
        11. Clock
        12. Profiles
        13. SIM services3
        14. Exit
                     """;

   
    System.out.println(menu);
    System.out.print("Enter option: ");
    int option = scanner.nextInt();
        switch(option){
             case 1 -> System.out.println("phoneBook");
             case 2 -> System.out.println("messages");
             case 3 -> System.out.println("chat");
             case 4 -> System.out.println("register");
             case 5 -> System.out.println("tones");
             case 6 -> System.out.println("settings");
             case 7 -> System.out.println("call divert");
             case 8 -> System.out.println("games");
             case 9 -> System.out.println("calculator");
             case 10 -> System.out.println("reminder");
             case 11 -> System.out.println("clock");
             case 12 -> System.out.println("profiles");
             case 13 -> System.out.println("sim service3");
           case 14 -> {;}
             default -> System.out.println("Invalid input");
             
             }

}     
        static void phoneBook(){
                  menu = """
                      Phone Book
                   1. Search
                   2. Service Nos. 
                   3. Add name
                   4. Erase
                   5. Edit
                   6. Assign tone
                   7. Send b’card
                   8. Options
                   9. Speed dials
                   10. Voice tags
                   11. back

                            """;

    System.out.println(menu);
    System.out.print("Enter option: ");
    int option = scanner.nextInt();
        switch(option){
             case 1 -> phoneBook();
             case 2 -> System.out.println("messages");
             case 3 -> System.out.println("chat");
             case 4 -> System.out.println("register");
             case 5 -> System.out.println("tones");
             case 6 -> System.out.println("settings");
             case 7 -> System.out.println("call divert");
             case 8 -> System.out.println("games");
             case 9 -> System.out.println("calculator");
             case 10 -> System.out.println("reminder");
             case 11 -> System.out.println("clock");
             case 12 -> System.out.println("profiles");
             case 13 -> System.out.println("sim service3");
             case 14 -> menu();
             default -> System.out.println("Invalid input");

         }   
    

}
            static void messages(){
                  menu = """
                     Messages
                  1. Set 12
                  2. common
                  3. back
                           """;



    System.out.println(menu);
    System.out.print("Enter option: ");
    int option = scanner.nextInt();
        switch(option){
             case 1 -> messages2();
             case 2 -> System.out.println("set 12");
             case 3 -> System.out.println("common");
             case 4 -> menu();
             default -> System.out.println("Invalid input");

        }


}




            static void messages2(){
                  menu = """
                    Messages
                 1. Message centre number
                 2. Messages sent as
                 3. Message validity
                 4. back

                          """;


    System.out.println(menu);
    System.out.print("Enter option: ");
    int option = scanner.nextInt();
        switch(option){
             case 1 -> messages2();
             case 2 -> System.out.println("Delivery reports");
             case 3 -> System.out.println("Reply via same centre");
             case 4 -> System.out.println("Character support");
             case 5 -> menu();
             default -> System.out.println("Invalid input");
        

        }

}


           static void chat(){
                  menu = """
                    Chat
                
                         """;
    System.out.println(menu);
    System.out.print("Enter option: ");
    int option = scanner.nextInt();
        switch(option){
        case 1 -> chat();
        case 2 -> menu();
        default -> System.out.println("Invalid input");

        }


}

            
    System.out.println(menu);
    System.out.print("Enter option: ");
    int option = scanner.nextInt();
        switch(option){
             case 1 -> call register();
             case 2 -> System.out.println("Missed calls");
             case 3 -> System.out.println("Received calls");
             case 4 -> System.out.println("Dialled numbers");
             case 5 -> System.out.println("Erase recent call lists");
             case 6 -> System.out.println("Show call duration");
             case 7 -> menu();
             default -> System.out.println("Invalid input");

        
        }







}


