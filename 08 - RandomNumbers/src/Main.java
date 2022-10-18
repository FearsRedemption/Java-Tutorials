import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();

        int x = random.nextInt(6)+1; //limit size inside the () so 6 would be 0 to 5, putting +1 outside makes it 1 to 6
        double y = random.nextDouble();
        boolean z = random.nextBoolean();

        int low = 10;
        int high = 100;
        int result = random.nextInt(high-low) + low; //this is for randomizing between two numbers

        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        System.out.println(result);
    }
}