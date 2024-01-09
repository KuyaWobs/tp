
package psa;

import java.util.Scanner;
public class Cenomar {
        
        private String personFirstName;
    private String personMiddleName;
    private String personLastName;
    private char gender;
    private String dateOfIssue;
    private String placeOfIssueName;
    private String placeOfIssueCity;
    private String placeOfIssueProvince;

    public void inputInformation(Scanner scanner) {
        System.out.print("Enter Person's First Name: ");
        this.personFirstName = scanner.nextLine().toUpperCase();

        System.out.print("Enter Person's Middle Name: ");
        this.personMiddleName = scanner.nextLine().toUpperCase();

        System.out.print("Enter Person's Last Name: ");
        this.personLastName = scanner.nextLine().toUpperCase();

        System.out.print("Enter Gender (f/m): ");
        this.gender = scanner.nextLine().toUpperCase().charAt(0);

        System.out.print("Enter Date of Issue (MM/DD/YYYY): ");
        this.dateOfIssue = scanner.nextLine().toUpperCase();

        System.out.print("Enter Place of Issue (Name of Authority/Agency): ");
        this.placeOfIssueName = scanner.nextLine().toUpperCase();

        System.out.print("Enter Place of Issue (City/Municipality): ");
        this.placeOfIssueCity = scanner.nextLine().toUpperCase();

        System.out.print("Enter Place of Issue (Province): ");
        this.placeOfIssueProvince = scanner.nextLine().toUpperCase();
    }

    public void displayInformation() {
        System.out.println("1a. Person's First Name: " + personFirstName);
        System.out.println("1b. Person's Middle Name: " + personMiddleName);
        System.out.println("1c. Person's Last Name: " + personLastName);
        System.out.println("2. Gender: " + gender);
        System.out.println("3. Date of Issue: " + dateOfIssue);
        System.out.println("4a. Place of Issue (Name of Authority/Agency): " + placeOfIssueName);
        System.out.println("4b. Place of Issue (City/Municipality): " + placeOfIssueCity);
        System.out.println("4c. Place of Issue (Province): " + placeOfIssueProvince);
    }

    public void editInformation(String rowToEdit, Scanner scanner) {
        switch (rowToEdit) {
            case "1a":
                System.out.print("Edit 1a. Enter Person's First Name: ");
                this.personFirstName = scanner.nextLine().toUpperCase();
                break;
            case "1b":
                System.out.print("Edit 1b. Enter Person's Middle Name: ");
                this.personMiddleName = scanner.nextLine().toUpperCase();
                break;
            case "1c":
                System.out.print("Edit 1c. Enter Person's Last Name: ");
                this.personLastName = scanner.nextLine().toUpperCase();
                break;
            case "2":
                System.out.print("Edit 2. Enter Gender (f/m): ");
                this.gender = scanner.nextLine().toUpperCase().charAt(0);
                break;
            case "3":
                System.out.print("Edit 3. Enter Date of Issue (MM/DD/YYYY): ");
                this.dateOfIssue = scanner.nextLine().toUpperCase();
                break;
            case "4a":
                System.out.print("Edit 4a. Enter Place of Issue (Name of Authority/Agency): ");
                this.placeOfIssueName = scanner.nextLine().toUpperCase();
                break;
            case "4b":
                System.out.print("Edit 4b. Enter Place of Issue (City/Municipality): ");
                this.placeOfIssueCity = scanner.nextLine().toUpperCase();
                break;
            case "4c":
                System.out.print("Edit 4c. Enter Place of Issue (Province): ");
                this.placeOfIssueProvince = scanner.nextLine().toUpperCase();
                break;
            default:
                System.out.println("Invalid choice. No edits were made.");
        }
    }

}

    

