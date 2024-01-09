
package psa;
import java.util.Scanner;
public class PSA {

   
    public static void main(String[] args) {
      

        Scanner scanner = new Scanner(System.in);
       
      
        System.out.println("                                                     _____  _    _ _____ _      _      _____ _____ _____ _   _ ______  ");      
        System.out.println("                                                    |  __ \\| |  | |_   _| |    | |    |_   _|  __ \\_   _| \\ | |  ____| ");
        System.out.println("                                                    | |__) | |__| | | | | |    | |      | | | |__) || | |  \\| | |__    ");
        System.out.println("                                                    |  ___/|  __  | | | | |    | |      | | |  ___/ | | | . ` |  __|   ");
        System.out.println("                                                    | |    | |  | |_| |_| |____| |____ _| |_| |    _| |_| |\\  | |____  ");
        System.out.println("                                                    |_|____|_|__|_|_____|______|______|_____|_|___|_____|_|_\\_|______| ");
        System.out.println("                                                    / ____|__   __|/\\|__   __|_   _|/ ____|__   __|_   _/ ____|/ ____|");
        System.out.println("                                                    | (___    | |  /  \\  | |    | | | (___    | |    | || |    | (___  "); 
        System.out.println("                                                  \\___ \\   | | / /\\ \\ | |    | |  \\___ \\   | |    | || |     \\___ \\ ");
        System.out.println("                                                     ____) |  | |/ ____ \\| |   _| |_ ____) |  | |   _| || |____ ____) |");
        System.out.println("                                                   |_____/  _|_/_/ ___\\_\\_|_ |_____|_____/___|_|__|_____\\_____|_____/_");
        System.out.println("                                                       /\\  | |  | |__   __| |  | |/ __ \\|  __ \\|_   _|__   __\\ \\   / /");
        System.out.println("                                                      /  \\ | |  | |  | |  | |__| | |  | | |__) | | |    | |   \\ \\_/ / ");
        System.out.println("                                                     / /\\ \\| |  | |  | |  |  __  | |  | |  _  /  | |    | |    \\   /  ");
        System.out.println("                                                    / ____ \\ |__| |  | |  | |  | | |__| | | \\ \\ _| |_   | |     | |   ");
        System.out.println("                                                    /_/    \\_\\____/   |_|  |_|  |_|\\____/|_|  \\_\\_____|  |_|     |_|   ");
        System.out.println("");
        System.out.println("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              ");
       try {
          System.out.println("");
              Thread.sleep(500); 
         
         System.out.println("  -----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
          Thread.sleep(500); 
         System.out.println("");
             Thread.sleep(500); 
         System.out.println("                                                                         Republic of the Philippines");
                Thread.sleep(500); 
         System.out.println("                                                                        Philippine Statistics Authority");
            Thread.sleep(500); 
         System.out.println("                                                                       Registration and Certificate System");
            Thread.sleep(500); 
         System.out.println("");
            Thread.sleep(500); 
            
                     System.out.println("  -----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

            Thread.sleep(500); 
         System.out.println("");
            Thread.sleep(500); 
         System.out.println("                                                                               [1] Registration");
            Thread.sleep(500); 
         System.out.println("                                                                               [2] Not Registration");
            Thread.sleep(500); 
         System.out.println("");
            Thread.sleep(500); 
         System.out.println("  -----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

        System.out.println("                                                                                        ");
       
            Thread.sleep(1000); 
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
       int Choice;
       do{
        Choice = scanner.nextInt();
       scanner.nextLine();
       if(Choice == 1){
       
                System.out.println("  -----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                System.out.println("");
               System.out.println("                                  Press [B] for BirthCertificate   Press [M] for Marriage  Press [C] for Cenomar   Press [D] for Death Certificate");
               System.out.println("");
                System.out.println("  -----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

       
        String choice = scanner.nextLine().toUpperCase();

        switch (choice) {
            case "B":
                performRegistration();
                break;
            case "M":
               Perform();
                break;
            case "C":
                
                break;
            case "D":
                
                break;
            default:
                System.out.println("Invalid choice. Please choose B,C,M or D");
                continue;
        }
        }else if (Choice == 2){
       
       } else{
           System.out.println("Invalid Number: Please only 1 and 2");
       }
       }while(Choice !=0);
       
        System.out.println("Exiting The Program");
       scanner.close();
    
       
    } 

   public static void performRegistration() {
        Scanner scanner = new Scanner(System.in);
        BirthCertificate birthCertificate = new BirthCertificate();
        
         System.out.println("  -----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
       System.out.println("");
       System.out.println("       [Child's Name:] ");
       System.out.println("");
         System.out.println("  -----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

        birthCertificate.inputInformation(scanner);
         System.out.println("  -----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

         System.out.println("");
       System.out.println("       [Mother's Maiden Name:] ");
       System.out.println("");
         System.out.println("  -----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

        birthCertificate.inputMotherInformation(scanner);
         System.out.println("  -----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

         System.out.println("");
       System.out.println("       [Father's Maiden Name:] ");
       System.out.println("");
         System.out.println("  -----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

        birthCertificate.inputFatherInformation(scanner);
        
        while (true) {
            
          birthCertificate.displayInformation();
          
            System.out.println("\nDo you want to edit?");
            System.out.println("1. Yes       2. No");

            int editChoice = scanner.nextInt();
            scanner.nextLine(); 

            if (editChoice == 1) {
                System.out.print("\nWhich row? : ");
                String rowToEdit = scanner.nextLine();

               
                birthCertificate.editInformation(rowToEdit, scanner);

             
                System.out.println("\nUpdated Information:");
                birthCertificate.displayInformation();
            } else if (editChoice == 2) {
                birthCertificate.displayInformation();
                System.out.println("Do you want to sample copy?: [1] Yes or [2] no");
                int L = scanner.nextInt();
                while(true)
                    if(L == 1){
                    birthCertificate.CombinedInformation();
                        
                    }else if(L == 2){
                    
                    }else
                break;
            } else {
                System.out.println("Invalid choice. Please enter 1 or 2.");
            }
        }
        
        
    }
   
   
   
   public static void PerformC(){
   Scanner scanner = new Scanner(System.in);
   Cenomar cenomar = new Cenomar();
   
   
           
   }
   
   public static void PerformD(){
   Scanner scanner = new Scanner(System.in);
   DeathCertificate deathcertificate = new DeathCertificate();
   
   
   }

    private static void Perform() {
 Scanner scanner = new Scanner(System.in);
   Marriage marriage = new Marriage();
   System.out.println("  -----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
       System.out.println("");
       System.out.println("       [Wife Information:] ");
       System.out.println("");
         System.out.println("  -----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
    marriage.wifeInformation(scanner);
        
         System.out.println("  -----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

         System.out.println("");
       System.out.println("       [Husband Information:] ");
       System.out.println("");
         System.out.println("  -----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

           marriage.husbandInformation(scanner);
         System.out.println("  -----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

   marriage.displayInformation();
                     System.out.print("\nWhich row? : ");
                String rowToEdit = scanner.nextLine();
   marriage.editInformation(rowToEdit, scanner);
   marriage.MarriageCombinedInformation();
    }
}
        
        
  
