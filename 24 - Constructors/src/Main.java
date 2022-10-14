public class Main {
    public static void main(String[] args) {
        Human human1 = new Human("Chris", 35, 225.4);
        Human human2 = new Human("Bob", 75, 445.2);

        System.out.println(human1.name);
        System.out.println(human2.name);

        human1.Eat();
        human2.Drink();
    }
}