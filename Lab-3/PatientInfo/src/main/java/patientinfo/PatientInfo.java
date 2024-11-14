package patientinfo;

import java.util.Scanner;

public class PatientInfo {
public static String pNumber, pAge, pContact, pName, pEmail, pComplain;
public static double pBill;
public void Take_Patient_Data(){
    Scanner sc = new Scanner(System.in);
    System.out.println("--------------Patient's Info-------------");
    System.out.println("Enter Patient's Number please: ");
    pNumber= sc.nextLine();
    System.out.println("Enter Patient's Name please: ");
    pName= sc.nextLine();
    System.out.println("Enter Patient's Age please: ");
    pAge= sc.nextLine();
    System.out.println("Enter Patient's Email please: ");
    pEmail= sc.nextLine();
    System.out.println("Enter Patient's Contact please: ");
    pContact= sc.nextLine();
    System.out.println("Enter Patient's Complain please: ");
    pComplain= sc.nextLine();
    System.out.println("Enter Patient's Bill please: ");
    pBill= sc.nextDouble();
}
public void Print_Reciept(){
    System.out.println("-------------------Patient's Reciept-------------");
    System.out.println("Patient's Number --------------" +pNumber);
    System.out.println("Patient's Name ----------------" +pName);
    System.out.println("Patient's Age -----------------" +pAge);
    System.out.println("Patient's Email ---------------" +pAge);
    System.out.println("Patient's Contact -------------" +pContact);
    System.out.println("Patient's Complain ------------" +pComplain);
    System.out.println("Patient's Bill ----------------" +pBill);
}
    public static void main(String[] args) {
        PatientInfo patient=new PatientInfo();
        patient.Take_Patient_Data();
        patient.Print_Reciept();
    }
}
