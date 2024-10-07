package cookies;
import java.util.Scanner;

public class Cookies {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int totalCookies;
        System.out.print("Enter the total number of cookies produced: ");
        totalCookies = sc.nextInt();
        
        final int COOKIES_PER_BOX = 12;
        final int BOXES_PER_CARTON = 24;
        final double BOX_PRICE = 1.14;
        final double LEFTOVER_BOX_PRICE = 0.57;
        
        int total_Boxes = totalCookies / COOKIES_PER_BOX;
        int full_Cartons = total_Boxes / BOXES_PER_CARTON;
        int leftoverBoxes = total_Boxes % BOXES_PER_CARTON;
        
        
        double moneyFromCartons = full_Cartons * BOXES_PER_CARTON * BOX_PRICE;
        double moneyFromLeftoverBoxes = leftoverBoxes * LEFTOVER_BOX_PRICE;
        double totalMoneyMade = moneyFromCartons + moneyFromLeftoverBoxes;
       
        System.out.println("Total boxes produced: " + total_Boxes);
        System.out.println("Full cartons: " + full_Cartons);
        System.out.println("Leftover boxes: " + leftoverBoxes);
        System.out.println("Total money made: $" + totalMoneyMade);
    }
}
