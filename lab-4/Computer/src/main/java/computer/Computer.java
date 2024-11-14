package computer;
import java.util.Scanner;

public class Computer {
public String name, type, processor, ram, hardDrive, motherBoard, opticalDrive;

public Computer() {
        this.name = "Unknown";
        this.type = "Unknown";
        this.processor = "Unknown";
        this.ram = "Unknown";
        this.hardDrive = "Unknown";
        this.motherBoard = "Unknown";
        this.opticalDrive = "Unknown";
    }

public void takeInfo(){
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter computer system name: ");
    this.name= sc.nextLine();
    System.out.println("Enter the type of Computer (Desktop/Laptop): ");
    this.type= sc.nextLine();
    System.out.println("Enter Processor Specifications: ");
    this.processor= sc.nextLine();
    System.out.println("Enter RAM Size (GB): ");
    this.ram= sc.nextLine();
    System.out.println("Enter Hard Disk size (GB): ");
    this.hardDrive= sc.nextLine();
    System.out.println("Enter Motherboard specifications: ");
    this.motherBoard= sc.nextLine();
    System.out.println("Enter optical drive type (e.g., DVD, Blu-ray, None): ");
    this.opticalDrive= sc.nextLine();
}
public void displayInfo() {
        System.out.println("\n---------- Computer System Information -----------");
        System.out.println("System Name: " + this.name);
        System.out.println("System Type: " + this.type);
        System.out.println("Processor: " + this.processor);
        System.out.println("RAM: " + this.ram + " GB");
        System.out.println("Hard Disk: " + this.hardDrive + " GB");
        System.out.println("Motherboard: " + this.motherBoard);
        System.out.println("Optical Drive: " + this.opticalDrive);
    }
public void modifyInfo() {
        Scanner sc = new Scanner(System.in);
        String choice = "yes"; 

        while (choice.equalsIgnoreCase("yes")) {
            System.out.println("Which field would you like to modify?");
            System.out.println("1. System Name");
            System.out.println("2. System Type");
            System.out.println("3. Processor");
            System.out.println("4. RAM");
            System.out.println("5. Hard Disk");
            System.out.println("6. Motherboard");
            System.out.println("7. Optical Drive");
            System.out.println("8. Exit");
            System.out.print("Enter your choice (1-8): ");
            int option = sc.nextInt();
          
            switch (option) {
                case 1:
                    System.out.print("Enter new system name: ");
                    this.name = sc.nextLine();
                    break;
                case 2:
                    System.out.print("Enter new system type (Desktop/Laptop): ");
                    this.type = sc.nextLine();
                    break;
                case 3:
                    System.out.print("Enter new processor: ");
                    this.processor = sc.nextLine();
                    break;
                case 4:
                    System.out.print("Enter new RAM (in GB): ");
                    this.ram = sc.nextLine();
                    sc.nextLine();  // Consume newline
                    break;
                case 5:
                    System.out.print("Enter new hard disk size (in GB): ");
                    this.hardDrive = sc.nextLine();
                    sc.nextLine();  // Consume newline
                    break;
                case 6:
                    System.out.print("Enter new motherboard type: ");
                    this.motherBoard = sc.nextLine();
                    break;
                case 7:
                    System.out.print("Enter new optical drive type: ");
                    this.opticalDrive = sc.nextLine();
                    break;
                case 8:
                    choice = "no";  
                    break;
                default:
                    System.out.println("Invalid option. Try again!!");
                    break;
            }

            if (option != 8) {
                System.out.print("Do you want to modify another field? (yes/no): ");
                choice = sc.nextLine();
            }
        }
    }
    public static void main(String[] args) {
        Computer cs = new Computer(); 
        cs.takeInfo();                     
        cs.displayInfo();                  

        System.out.print("Do you want to modify the information? (yes/no): ");
        Scanner sc = new Scanner(System.in);
        String modifyChoice = sc.nextLine();

        if (modifyChoice.equalsIgnoreCase("yes")) {
            cs.modifyInfo();               
        }
        cs.displayInfo();         
    }
}
