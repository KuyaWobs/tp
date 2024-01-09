
package psa;
import java.util.Scanner;
public class DeathCertificate {
   
    private String deceasedFirstName;
    private String deceasedMiddleName;
    private String deceasedLastName;
    private char gender;
    private String dateOfDeath;
    private String placeOfDeathName;
    private String placeOfDeathCity;
    private String placeOfDeathProvince;

    public void inputInformation(Scanner scanner) {
        
        System.out.print("Enter Deceased's First Name: ");
        this.deceasedFirstName = scanner.nextLine().toUpperCase();

        System.out.print("Enter Deceased's Middle Name: ");
        this.deceasedMiddleName = scanner.nextLine().toUpperCase();

        System.out.print("Enter Deceased's Last Name: ");
        this.deceasedLastName = scanner.nextLine().toUpperCase();

        System.out.print("Enter Gender (f/m): ");
        this.gender = scanner.nextLine().toUpperCase().charAt(0);

        System.out.print("Enter Date of Death (MM/DD/YYYY): ");
        this.dateOfDeath = scanner.nextLine().toUpperCase();

        System.out.print("Enter Place of Death (Name of Hospital/Clinic/Institution): ");
        this.placeOfDeathName = scanner.nextLine().toUpperCase();

        System.out.print("Enter Place of Death (City/Municipality): ");
        this.placeOfDeathCity = scanner.nextLine().toUpperCase();

        System.out.print("Enter Place of Death (Province): ");
        this.placeOfDeathProvince = scanner.nextLine().toUpperCase();
    }

    public void displayInformation() {
        System.out.println("1a. Deceased's First Name: " + deceasedFirstName);
        System.out.println("1b. Deceased's Middle Name: " + deceasedMiddleName);
        System.out.println("1c. Deceased's Last Name: " + deceasedLastName);
        System.out.println("2. Gender: " + gender);
        System.out.println("3. Date of Death: " + dateOfDeath);
        System.out.println("4a. Place of Death (Name of Hospital/Clinic/Institution): " + placeOfDeathName);
        System.out.println("4b. Place of Death (City/Municipality): " + placeOfDeathCity);
        System.out.println("4c. Place of Death (Province): " + placeOfDeathProvince);
    }

    public void editInformation(String rowToEdit, Scanner scanner) {
        switch (rowToEdit) {
            case "1a":
                System.out.print("Edit 1a. Enter Deceased's First Name: ");
                this.deceasedFirstName = scanner.nextLine().toUpperCase();
                break;
            case "1b":
                System.out.print("Edit 1b. Enter Deceased's Middle Name: ");
                this.deceasedMiddleName = scanner.nextLine().toUpperCase();
                break;
            case "1c":
                System.out.print("Edit 1c. Enter Deceased's Last Name: ");
                this.deceasedLastName = scanner.nextLine().toUpperCase();
                break;
            case "2":
                System.out.print("Edit 2. Enter Gender (f/m): ");
                this.gender = scanner.nextLine().toUpperCase().charAt(0);
                break;
            case "3":
                System.out.print("Edit 3. Enter Date of Death (MM/DD/YYYY): ");
                this.dateOfDeath = scanner.nextLine().toUpperCase();
                break;
            case "4a":
                System.out.print("Edit 4a. Enter Place of Death (Name of Hospital/Clinic/Institution): ");
                this.placeOfDeathName = scanner.nextLine().toUpperCase();
                break;
            case "4b":
                System.out.print("Edit 4b. Enter Place of Death (City/Municipality): ");
                this.placeOfDeathCity = scanner.nextLine().toUpperCase();
                break;
            case "4c":
                System.out.print("Edit 4c. Enter Place of Death (Province): ");
                this.placeOfDeathProvince = scanner.nextLine().toUpperCase();
                break;
            default:
                System.out.println("Invalid choice. No edits were made.");
        }
    }

}


