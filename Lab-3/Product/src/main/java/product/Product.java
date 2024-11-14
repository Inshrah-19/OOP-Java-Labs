package product;
import java.util.Scanner;

public class Product {
    public static int multiply(int n){
      if (n == 1 || n == 0) { 
            return 1; 
        } else {
            return n * multiply(n - 1); 
        }
    }

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a number to get the multiplication of that number from 1: ");
        int number= sc.nextInt();
        if (number < 0) {
            System.out.println("Please enter a non-negative number!!");
        } 
        else {
            int output = multiply(number);
            System.out.println("The multiplication of the numbers from 1 to " + number + " is: " + output);
        }
    }
}
