
package psa;
import java.util.Scanner;
public class BirthCertificate {
    
        private String firstName;
    private String middleName;
    private String lastName;
    private char sex;
    private int dateOfBirth;
    private String placeOfBirthName;
    private String placeOfBirthCity;
    private String placeOfBirthProvince;

    private String motherFirstName;
    private String motherMiddleName;
    private String motherLastName;
    private String motherCitizenship;
    private String motherReligion;
    private String motherOccupation;
    private int motherAgeAtBirth;
    private String motherResidence;
    private String motherCity;
    private String motherProvince;

    private String fatherFirstName;
    private String fatherMiddleName;
    private String fatherLastName;
    private String fatherCitizenship;
    private String fatherReligion;
    private String fatherOccupation;
    private int fatherAgeAtBirth;
    private String fatherResidence;
    private String fatherCity;
    private String fatherProvince;

    public void displayInformation() {
         System.out.println("  -----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
       System.out.println("");
       System.out.println("       [Child's Name:] ");
       System.out.println("");
         System.out.println("  -----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

        System.out.println("1a. First Name: " + firstName);
        System.out.println("1b. Middle Name: " + middleName);
        System.out.println("1c. Last Name: " + lastName);
        System.out.println("2. Sex: " + sex);
        System.out.println("3. Date of Birth: " + dateOfBirth);
        System.out.println("4a. Place of Birth (Name of Hospital/Clinic/Institution): " + placeOfBirthName);
        System.out.println("4b. Place of Birth (City/Municipality): " + placeOfBirthCity);
        System.out.println("4c. Place of Birth (Province): " + placeOfBirthProvince);

         System.out.println("  -----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

         System.out.println("");
       System.out.println("       [Mother's Maiden Name:] ");
       System.out.println("");
         System.out.println("  -----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

        System.out.println("\nMother's Information:");
        System.out.println("4l. Mother's First Name: " + motherFirstName);
        System.out.println("4m. Mother's Middle Name: " + motherMiddleName);
        System.out.println("4q. Mother's Last Name: " + motherLastName);
        System.out.println("5a. Mother's Citizenship: " + motherCitizenship);
        System.out.println("5b. Mother's Religion: " + motherReligion);
        System.out.println("5c. Mother's Occupation: " + motherOccupation);
        System.out.println("5d. Mother's Age at the time of this birth: " + motherAgeAtBirth);
        System.out.println("5e. Mother's Residence: " + motherResidence);
        System.out.println("5f. Mother's City: " + motherCity);
        System.out.println("5g. Mother's Province: " + motherProvince);
        
         System.out.println("  -----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

         System.out.println("");
       System.out.println("       [Father's Maiden Name:] ");
       System.out.println("");
         System.out.println("  -----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

        System.out.println("\nFather's Information:");
        System.out.println("5l. Father's First Name: " + fatherFirstName);
        System.out.println("5m. Father's Middle Name: " + fatherMiddleName);
        System.out.println("5q. Father's Last Name: " + fatherLastName);
         System.out.println("6a. Father's Citizenship: " + fatherCitizenship);
        System.out.println("6b. Father's Religion: " + fatherReligion);
        System.out.println("6c. Father's Occupation: " + fatherOccupation);
        System.out.println("6d. Father's Age at the time of this birth: " + fatherAgeAtBirth);
        System.out.println("6e. Father's Residence: " + fatherResidence);
        System.out.println("6f. Father's City: " + fatherCity);
        System.out.println("6g. Father's Province: " + fatherProvince);
    }

    public void editInformation(String rowToEdit, Scanner scanner) {
        switch (rowToEdit) {
             case "1a":
                System.out.print("1a. Enter your First Name: ");
                this.firstName = scanner.nextLine();
                break;
            case "1b":
                System.out.print("1b. Enter your Middle Name: ");
                this.middleName = scanner.nextLine();
                break;
            case "1c":
                System.out.print("1c. Enter your Last Name: ");
                this.lastName = scanner.nextLine();
                break;
            case "2":
                System.out.print("2. Enter your Sex (f/m): ");
                this.sex = scanner.nextLine().charAt(0);
                break;
            case "3":
                System.out.print("3. Enter your Date of Birth (MM/DD/YYYY): ");
                this.dateOfBirth = scanner.nextInt();
                break;
            case "4a":
                System.out.print("4a. Enter Place of Birth (Name of Hospital/Clinic/Institution): ");
                this.placeOfBirthName = scanner.nextLine();
                break;
            case "4b":
                System.out.print("4b. Enter Place of Birth (City/Municipality): ");
                this.placeOfBirthCity = scanner.nextLine();
                break;
            case "4c":
                System.out.print("4c. Enter Place of Birth (Province): ");
                this.placeOfBirthProvince = scanner.nextLine();
                break;
           
            case "4l":
                System.out.println("4l. Enter First Name of your Mother: ");
                this.motherFirstName = scanner.nextLine();
                break;
            case "4m":
                System.out.println("4m. Enter Middle Name of your Mother: ");
                this.motherMiddleName = scanner.nextLine();
                break;
            case "4q":
                System.out.println("4q. Enter Last Name of your Mother: ");
                this.motherLastName = scanner.nextLine();
                break;
            case "5a":
                System.out.print("5a. Enter Mother's Citizenship: ");
                this.motherCitizenship = scanner.nextLine();
                break;
            case "5b":
                System.out.print("5b. Enter Mother's Religion: ");
                this.motherReligion = scanner.nextLine();
                break;
            case "5c":
                System.out.print("5c. Enter Mother's Occupation: ");
                this.motherOccupation = scanner.nextLine();
                break;
            case "5d":
                System.out.print("5d. Enter Mother's Age at Birth: ");
                this.motherAgeAtBirth = scanner.nextInt();
                scanner.nextLine(); // Consume the newline character
                break;
            case "5e":
                System.out.print("5e. Enter Mother's Residence: ");
                this.motherResidence = scanner.nextLine();
                break;
            case "5f":
                System.out.print("5f. Enter Mother's City: ");
                this.motherCity = scanner.nextLine();
                break;
            case "5g":
                System.out.print("5g. Enter Mother's Province: ");
                this.motherProvince = scanner.nextLine();
                break;
            case "5l" :
                System.out.println("5l. Enter First Name of your Father: ");
                this.fatherFirstName = scanner.nextLine();
                break;
            case "5m":
                System.out.println("5m. Enter Middle Name of your Father: ");
                this.fatherMiddleName = scanner.nextLine();
                break;
            case "5q":
                System.out.println("5q. Enter Last Name of your Father: ");
                this.fatherLastName = scanner.nextLine();
                break;
            case "6a":
                System.out.print("Edit 6a. Enter Father's Citizenship: ");
                this.fatherCitizenship = scanner.nextLine();
                break;
            case "6b":
                System.out.print("Edit 6b. Enter Father's Religion: ");
                this.fatherReligion = scanner.nextLine();
                break;
            case "6c":
                System.out.print("Edit 6c. Enter Father's Occupation: ");
                this.fatherOccupation = scanner.nextLine();
                break;
            case "6d":
                System.out.print("Edit 6d. Enter Father's Age at Birth: ");
                this.fatherAgeAtBirth = scanner.nextInt();
                scanner.nextLine();
                break;
            case "6e":
                System.out.print("Edit 6e. Enter Father's Residence: ");
                this.fatherResidence = scanner.nextLine();
                break;
            case "6f":
                System.out.print("Edit 6f. Enter Father's City: ");
                this.fatherCity = scanner.nextLine();
                break;
            case "6g":
                System.out.print("Edit 6g. Enter Father's Province: ");
                this.fatherProvince = scanner.nextLine();
                break;

            default:
                System.out.println("Invalid choice. No edits were made.");
        }
    }
 public void inputInformation(Scanner scanner) {
        System.out.print("Enter First Name: ");
        this.firstName = scanner.nextLine().toUpperCase();

        System.out.print("Enter Middle Name: ");
        this.middleName = scanner.nextLine().toUpperCase();

        System.out.print("Enter Last Name: ");
        this.lastName = scanner.nextLine().toUpperCase();

        System.out.print("Enter Sex (f/m): ");
        this.sex = scanner.nextLine().toUpperCase().charAt(0);

        System.out.print("Enter Date of Birth (MM/DD/YYYY): ");
        this.dateOfBirth = scanner.nextInt();

        System.out.print("Enter Place of Birth (Name of Hospital/Clinic/Institution): ");
        this.placeOfBirthName = scanner.nextLine().toUpperCase();

        System.out.print("Enter Place of Birth (City/Municipality): ");
        this.placeOfBirthCity =scanner.nextLine().toUpperCase();

        System.out.print("Enter Place of Birth (Province): ");
        this.placeOfBirthProvince = scanner.nextLine().toUpperCase();
    
}
    public void inputMotherInformation(Scanner scanner) {
        System.out.print("Enter Mother's First Name: ");
        this.motherFirstName = scanner.nextLine().toUpperCase();

        System.out.print("Enter Mother's Middle Name: ");
        this.motherMiddleName = scanner.nextLine().toUpperCase();

        System.out.print("Enter Mother's Last Name: ");
        this.motherLastName = scanner.nextLine().toUpperCase();

        System.out.print("Enter Mother's Citizenship: ");
        this.motherCitizenship = scanner.nextLine().toUpperCase();

        System.out.print("Enter Mother's Religion: ");
        this.motherReligion = scanner.nextLine().toUpperCase();

        System.out.print("Enter Mother's Occupation: ");
        this.motherOccupation = scanner.nextLine().toUpperCase();

        System.out.print("Enter Mother's Age at Birth: ");
        this.motherAgeAtBirth = scanner.nextInt();
        scanner.nextLine(); 

        System.out.print("Enter Mother's Residence: ");
        this.motherResidence = scanner.nextLine().toUpperCase();

        System.out.print("Enter Mother's City: ");
        this.motherCity =scanner.nextLine().toUpperCase();

        System.out.print("Enter Mother's Province: ");
        this.motherProvince = scanner.nextLine().toUpperCase();
    }

   
    public void inputFatherInformation(Scanner scanner) {
        System.out.print("Enter Father's First Name: ");
        this.fatherFirstName = scanner.nextLine().toUpperCase();

        System.out.print("Enter Father's Middle Name: ");
        this.fatherMiddleName = scanner.nextLine().toUpperCase();

        System.out.print("Enter Father's Last Name: ");
        this.fatherLastName = scanner.nextLine().toUpperCase();

        System.out.print("Enter Father's Citizenship: ");
        this.fatherCitizenship = scanner.nextLine().toUpperCase();

        System.out.print("Enter Father's Religion: ");
        this.fatherReligion = scanner.nextLine().toUpperCase();

        System.out.print("Enter Father's Occupation: ");
        this.fatherOccupation = scanner.nextLine().toUpperCase();

        System.out.print("Enter Father's Age at Birth: ");
        this.fatherAgeAtBirth = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        System.out.print("Enter Father's Residence: ");
        this.fatherResidence =scanner.nextLine().toUpperCase();

        System.out.print("Enter Father's City: ");
        this.fatherCity = scanner.nextLine().toUpperCase();

        System.out.print("Enter Father's Province: ");
        this.fatherProvince = scanner.nextLine().toUpperCase();
        
    }
    
    public void CombinedInformation(){
        try {
      System.out.print("                                                                                                              Loading");
      Thread.sleep(1000); 
      System.out.print(".");
           Thread.sleep(1000); 
      System.out.print(".");
           Thread.sleep(1000); 
      System.out.print(".");
           Thread.sleep(1000); 
      System.out.print(".");
      Thread.sleep(1000); 
      System.out.println("");
      System.out.println("");
      System.out.println("");
      System.out.println("");
       System.out.println("");
        System.out.println("");
         System.out.println("");
          System.out.println("");
           System.out.println("");
            System.out.println("");
             System.out.println("");
              System.out.println("");
               System.out.println("");
                System.out.println("");
                 System.out.println("");
                  System.out.println("");
                   System.out.println("");
                    System.out.println("");
                     System.out.println("");
                      System.out.println("");
                       System.out.println("");
                        System.out.println("");
                         System.out.println("");
                          System.out.println("");
                           System.out.println("");
                            System.out.println("");
                             System.out.println("");
                             
         System.out.println("  -----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
         Thread.sleep(500); 
         System.out.println("                              ===================================================================================================================================================================================                                       ");
         Thread.sleep(500); 
         System.out.println("                                                                                                    Republic Of The Philippines                                                                                                                                   ");
        Thread.sleep(500); 
         System.out.println("                                                                                               OFFICE OF THE CIVIL REGISTRAR GENERAL                                                                                                                              ");
      Thread.sleep(500); 
         System.out.println("                                                                                                   CERTIFICATE OF LIVE BIRTH");
         Thread.sleep(500); 
         System.out.println("");
        Thread.sleep(500); 
         System.out.println("                              ===================================================================================================================================================================================                                       ");
         Thread.sleep(500); 
         System.out.println("                              -----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------                                       ");
         Thread.sleep(500);  
         System.out.println("                                                 1. NAME:                            (Last)    (Middle)    (First)                                                                                                              ");
          Thread.sleep(500); 
         System.out.println("                                                                                        "+lastName +"      "+middleName+"      "+ firstName + " ");
          Thread.sleep(500);  
         System.out.println("                              -----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------                                       ");
         Thread.sleep(500); 
         System.out.println("                                                 2. SEX:                                      |3.DATE OF BIRTH: (MM/DD/YYYY)                ");
       Thread.sleep(500); 
         System.out.println("                                                         "+ sex + "                                 |                "+ dateOfBirth +"                                                                                                                        ");
        Thread.sleep(500); 
         System.out.println("                              -----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------                                       ");
        Thread.sleep(500); 
         System.out.println("                                                 4. PLACE OF BIRTH:    Name of Hospital      City/Municipality      (Province)                                                      ");
        Thread.sleep(500); 
         System.out.println("                                                                       "+placeOfBirthName+""+placeOfBirthCity + "" + placeOfBirthProvince);
         Thread.sleep(500); 
        System.out.println("                              ===================================================================================================================================================================================                                       ");
                  Thread.sleep(500); 
         System.out.println("                                                 6. MOTHER NAME:                            (Last)    (Middle)    (First)                                                                                                              ");
                  Thread.sleep(500); 
         System.out.println("                                                                                        "+motherLastName +"      "+motherMiddleName+"      "+ motherFirstName + " ");
                  Thread.sleep(500); 
         System.out.println("                              -----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------                                       ");
                  Thread.sleep(500); 
         System.out.println("                                                 7. CITIZENSHIP                               |8. RELIGION              ");
                  Thread.sleep(500); 
         System.out.println("                                                         "+ motherCitizenship + "                                 |                "+ motherReligion +"                                                                                                                        ");
                  Thread.sleep(500); 
         System.out.println("                              -----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------                                       ");
                  Thread.sleep(500); 
         System.out.println("                                                 9. OCCUPATION                                |10. AGE AT THE TIME OF THIS BIRTH              ");  
                  Thread.sleep(500); 
         System.out.println("                                                         "+ motherOccupation + "                                 |                "+ motherAgeAtBirth +"                                                                                                                        ");
                  Thread.sleep(500); 
         System.out.println("                              -----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------                                       ");
                  Thread.sleep(500); 
         System.out.println("                                                 11. RESIDENCE         HouseNo.Street/Baranggay      City/Municipality      (Province)                                                      ");
                  Thread.sleep(500); 
         System.out.println("                                                                       "+placeOfBirthName+""+placeOfBirthCity + "" + placeOfBirthProvince);
                  Thread.sleep(500); 
         System.out.println("                              ===================================================================================================================================================================================                                       ");
                  Thread.sleep(500); 
         System.out.println("                                                 1. FATHER NAME:                            (Last)    (Middle)    (First)                                                                                                              ");
                  Thread.sleep(500); 
         System.out.println("                                                                                        "+lastName +"      "+middleName+"      "+ firstName + " ");
         Thread.sleep(500); 
         System.out.println("                                                 7. CITIZENSHIP                               |8. RELIGION              ");
         Thread.sleep(500); 
         System.out.println("                                                         "+ sex + "                                 |                "+ dateOfBirth +"                                                                                                                        ");
         Thread.sleep(500); 
         System.out.println("                              -----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------                                       ");
         Thread.sleep(500); 
         System.out.println("                                                 9. OCCUPATION                                |10. AGE AT THE TIME OF THIS BIRTH              ");  
         Thread.sleep(500); 
         System.out.println("                                                         "+ sex + "                                 |                "+ dateOfBirth +"                                                                                                                        ");
         Thread.sleep(500); 
         System.out.println("                              ===================================================================================================================================================================================                                       ");
         Thread.sleep(500); 
         System.out.println("  -----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
         Thread.sleep(500); 

  } catch (InterruptedException e) {
            e.printStackTrace();
        }
        }

   
} 
    

