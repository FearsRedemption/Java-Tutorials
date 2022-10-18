import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //This is the same as other programming languages
        Scanner scanner = new Scanner(System.in);
        String name = "";
        int age = 0;

        while(name.isBlank()) {
            System.out.print("Enter your name: ");
            name = scanner.nextLine();
        }

        do {
            System.out.print("Enter your age: ");
            age = scanner.nextInt();
            scanner.nextLine();
        } while(age <= 0);

        System.out.println("Hello " + name);
        System.out.println("you are " + age + " years old");
    }
}