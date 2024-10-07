package airthematic;
import java.util.Scanner;
public class Airthematic {
int a, b;
    public static void main(String[] args) {
       
       Airthematic s1= new Airthematic();
       Scanner sc= new Scanner(System.in);
       System.out.println("Enter the First integer: ");
       s1.a= sc.nextInt();
       System.out.println("Enter the second integer: ");
       s1.b= sc.nextInt();
       int sum= s1.a+s1.b;
       int multiply= s1.a*s1.b;
       int difference= s1.a-s1.b;
       System.out.println("The Sum of the given numbers: "+sum);
        System.out.println("The multiplication of the given numbers: "+multiply);
         System.out.println("The  difference of the given numbers: "+difference);

    }
}
