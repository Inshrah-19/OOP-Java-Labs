package equations;

public class Equations {

    public static void main(String[] args) {
        int x= 6;
        int y= 20;
        int z= 13;
        double a= 2+ (Math.pow(x, 2))+ Math.pow(y, 2);
        double b= 3*x + y - 3*Math.pow(z, 2);
        double c= 2*x - 2*y + 5*Math.pow(z, 2);
        System.out.println("2x^2 + y^2: " + a);
        System.out.println("3x + y - 3z^2: " + b);
        System.out.println("2x - 2y + 5z^2: " + c);
    }
}
