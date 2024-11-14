package time;
import java.util.Calendar;

public class Time {
    private int year, month, day, hour, minute, second;
    
    public Time(){
        Calendar now = Calendar.getInstance();
        this.year= now.get(Calendar.YEAR);
        this.month= now.get(Calendar.MONTH);
        this.day= now.get(Calendar.DAY_OF_MONTH);
        this.hour= now.get(Calendar.HOUR_OF_DAY);
        this.minute= now.get(Calendar.MINUTE);
        this.second= now.get(Calendar.SECOND);
    }
    public Time(int year, int month, int day){
        this.year = year;
    this.month = month - 1; 
    this.day = day;
    Calendar now = Calendar.getInstance();
    this.hour = now.get(Calendar.HOUR_OF_DAY);
    this.minute = now.get(Calendar.MINUTE);
    this.second = now.get(Calendar.SECOND);
    }
    public Time(int year, int month, int day, int hour, int minute, int second){
    this.year = year;
    this.month = month - 1; 
    this.day = day;
    this.hour = hour;
    this.minute = minute;
    this.second = second;
    }
    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month + 1; // Return to 1-based month
    }

    public int getDay() {
        return day;
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }
    public void setYear(int year) {
        this.year = year;
    }

    public void setMonth(int month) {
        this.month = month - 1; // Adjusting to 0-based month
    }

    public void setDay(int day) {
        this.day = day;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public void setSecond(int second) {
        this.second = second;
    }
    public void displayTime() {
        System.out.println("Date: " + year + "-" + getMonth() + "-" + day + " Time: " + hour + ":" + minute + ":" + second);
    }
    public static void main(String[] args) {
      Time defaultTime= new Time();
      System.out.println("Current date and time (using default constructor): ");
      defaultTime.displayTime();
      
      Time specificTime1= new Time(2024, 05, 13);
      System.out.println("Custom date and time (using overloaded constructor): ");
      specificTime1.displayTime();
      
      Time specificTime2= new Time(2024, 12, 26, 14, 45, 31);
      System.out.println("Custom date and time (using overloaded constructor): ");
      specificTime2.displayTime();
    }
}
