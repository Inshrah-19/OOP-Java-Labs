package numberscalculation;
import java.util.Scanner;

public class NumbersCalculation {
public static boolean ifPrime(int num) {
        if (num <= 1) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }

public static int calculatePrimeCalories(int input) {
        int sum = 0;
        for (int i = 2; i < input; i++) {
             if (ifPrime(i)) {
                sum += i;
            }
        }
        return sum;
    }
public static int calculateOddCalories(int input) {
        int sum = 0;
        for (int i = 1; i < input; i += 2) {
            sum += i;
        }
        return sum;
    }
 public static int calculateEvenCalories(int input) {
        int sum = 0;
        for (int i = 2; i < input; i += 2) {
            sum += i;
        }
        return sum;
}


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input;
        System.out.println("Welcome to your Fintness App.");

        do {
            System.out.print("Please Enter duration of your workout  in minutes(negative number to exit): ");
            input = scanner.nextInt();

            if (input >= 0) {
                int primeCalories = calculatePrimeCalories(input);
                int oddCalories = calculateOddCalories(input);
                int evenCalories = calculateEvenCalories(input);

                System.out.println("Calories burned for prime numbers: " + primeCalories);
                System.out.println("Calories burned for odd numbers: " + oddCalories);
                System.out.println("Calories burned for even numbers: " + evenCalories);
            }
        } while (input >= 0);
        System.out.println("Program finished!!");
    }
 }
