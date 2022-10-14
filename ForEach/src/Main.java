import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        String[] animals = {"Wolf", "Fox", "Cat", "Dog", "Rat"};
        ArrayList<String> otherAnimals = new ArrayList<String>();
        otherAnimals.add("Bug");
        otherAnimals.add("Bird");
        otherAnimals.add("Bear");

        for (String aminal : animals) {
            System.out.println(aminal);
        }

        for (String aminal : otherAnimals) {
            System.out.println(aminal);
        }
    }
}