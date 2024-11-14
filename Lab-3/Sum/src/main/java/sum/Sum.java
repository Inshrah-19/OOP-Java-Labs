package sum;
import java.util.Scanner;

public class Sum {
    public static int ComputeOddSum(int input){
    if (input <= 0) 
    {
            return 0;
        }
        if (input % 2 != 0) 
        {
            return input + ComputeOddSum(input - 2);
        } 
        else 
        {
            return ComputeOddSum(input - 1);

        }
    }
    public static int ComputeEvenSum(int input) {
    if (input <= 0) {
            return 0; 
        }
        
        if (input % 2 == 0) { 
            return input + ComputeEvenSum(input - 2); 
        } else {
            return ComputeEvenSum(input - 1);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("Enter any number (negative number to stop): ");
            int input = sc.nextInt();
            
            if (input < 0) {
                System.out.println("Program can't proceed further!!");
                break; 
            }

            System.out.println("Sum of odd numbers less than " + input + ": " + ComputeOddSum(input - 1));
            System.out.println("Sum of even numbers less than " + input + ": " + ComputeEvenSum(input - 1));
        }
    }
}