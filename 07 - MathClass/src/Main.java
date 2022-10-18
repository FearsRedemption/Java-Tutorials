import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double num1 = 3.14;
        double num2 = -10;
        double num3 = 10;

        double max = Math.max(num1, num2);
        System.out.println(max);

        double absolute = Math.abs(num2);
        System.out.println(absolute);

        double squareRoot = Math.sqrt(num3);
        System.out.println(squareRoot);

        double rounded = Math.ceil(num1); //rounds up
        System.out.println(rounded);
        double floored = Math.floor(num1); //rounds down
        System.out.println(floored);

        double x;
        double y;
        double z;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter side X: ");
        x = scanner.nextDouble();
        System.out.println("Enter side Y: ");
        y = scanner.nextDouble();

        z = Math.sqrt((x*x) + (y*y));
        System.out.println("The hypotenuse is: " + z);

        scanner.close();
    }
}