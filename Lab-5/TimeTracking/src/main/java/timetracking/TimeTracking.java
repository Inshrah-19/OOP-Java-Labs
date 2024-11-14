package timetracking;
import java.util.Scanner;
public class TimeTracking {
    
    public static int TaskDuration(int startHour, int startMin, int endHour, int endMin) {
        int startTotalMin = (startHour * 60) + startMin;
        int endTotalMin = (endHour * 60) + endMin;
        return endTotalMin - startTotalMin; 
    }

    public static void main(String[] args) {
        Scanner sc= new  Scanner(System.in);
        System.out.println("Welcome to the Time Tracking tool!!");
        System.out.println("Enter the Start time (hours and minutes): ");
        int startHour= sc.nextInt();
        int startMin= sc.nextInt();
        System.out.println("Enter the End time (hours and minutes): ");
        int endHour= sc.nextInt();
        int endMin= sc.nextInt();
        
        int totalMin = TaskDuration(startHour, startMin, endHour, endMin);

        int totalHours = totalMin / 60;
        int remainingMins = totalMin % 60;
        
        System.out.println("Total time spent: " + totalHours + " hours and " + remainingMins + " minutes");

        if (totalHours < 40) {
            System.out.println("Warning: You have spent less than 40 hours! Consider increasing it.");
        } 
        else {
            System.out.println("You have met or exceeded the 40-hour target.");
        }
    }
}
