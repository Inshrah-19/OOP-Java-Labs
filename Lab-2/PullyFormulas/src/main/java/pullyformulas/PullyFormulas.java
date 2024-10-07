package pullyformulas;
import java.util.Scanner;

public class PullyFormulas {

    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
        double diameter1, diameter2, RPM1, RPM2, forceExerted,weightLifted;
        int numOfUpRopes;
        System.out.print("Enter the diameter of the first pulley: ");
        diameter1 = sc.nextDouble();
        
        System.out.print("Enter the diameter of the second pulley: ");
        diameter2 = sc.nextDouble();
        
        System.out.print("Enter the RPM of the first pulley: ");
        RPM1 = sc.nextDouble();
       
        RPM2 = (diameter1 / diameter2) * RPM1;
        System.out.println("The RPM of the second pulley is: " + RPM2);
        
        System.out.println("---------------------------------------------");
        System.out.print("\nEnter the force exerted (in newtons): ");
        forceExerted = sc.nextDouble();
        
        System.out.print("Enter the number of up ropes: ");
        numOfUpRopes = sc.nextInt();
        
        weightLifted = forceExerted * numOfUpRopes;
        System.out.println("The weight that can be lifted is: " + weightLifted + " newtons");
    }
}
