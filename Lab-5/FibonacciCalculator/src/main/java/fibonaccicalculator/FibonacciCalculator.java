package fibonaccicalculator;
import java.util.Scanner;

public class FibonacciCalculator {
    
public static int fibonacci(int i) {
        if (i == 0) {
            return 0;  
        }
        else if (i == 1) {
            return 1;  
        }
        return fibonacci(i - 1) + fibonacci(i - 2);  
    }

public static void printSeries(int num){
    System.out.print("Fibonacci series up to " + num + " is: ");
        for (int i = 0; i < num; i++) {
            System.out.print(fibonacci(i) + " ");
        }
        System.out.println();  
       }
   

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of terms to print the Fibonacci Series: ");
        int number = scanner.nextInt();

        System.out.println("The Fibonacci series of " + number + " is: ");
        printSeries(number);
    }
}
