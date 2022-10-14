import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //This is basically the same as other programming languages
        int temp = 25;

        if (temp > 30) {
            System.out.println("It is hot outside.");
        } else if (temp >= 20 && temp <= 30) {
            System.out.println("Feels warm outside.");
        } else {
            System.out.println("It is cold outside.");
        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("You are playing THE GAME! Press q or Q to quit.");
        String response = scanner.next();

        if(response.equals("q") || response.equals("Q")) {
            System.out.println("You quit the game");
        } else {
            System.out.println("You are still playing the game");
        }

        System.out.println("You are playing THE GAME! Press q or Q to quit.");
        response = scanner.next();

        if(!response.equals("q") && !response.equals("Q")) {
            System.out.println("You are still playing the game");
        } else {
            System.out.println("You quit the game");
        }
    }
}