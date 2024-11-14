package numbersum;
import java.util.Scanner;

public class NumberSum {
    public static int sumBetween(int num1, int num2){
        if (num1 == num2) {
            return num1; 
        } else if (num1 < num2) {
            return num1 + sumBetween(num1 + 1, num2); 
        } else {
            return num2 + sumBetween(num2 + 1, num1); 
        }
    }

    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        
        
        System.out.print("Enter first positive integer: ");
        int first_num = sc.nextInt();
        
        System.out.print("Enter second positive integer: ");
        int second_num = sc.nextInt();
     
        if (first_num < 0 || second_num < 0) {
            System.out.println("Please enter positive integers only.");
        } 
        else {
            int output = sumBetween(first_num, second_num);
            System.out.println("The sum of all numbers between " + first_num + " and " + second_num + " is: " + output);
        }
    }
}
