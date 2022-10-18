public class Main {
    public static void main(String[] args) {
        String name = "Chris";
        int age = 35;
        SayHello(name, age);

        System.out.println(Addition(5, 7));
    }

    static void SayHello(String name, int age) {
        System.out.println("Hello " + name);
        System.out.println("You are " + age + " years old.");
    }

    static int Addition(int x, int y) {
        return x + y;
    }
}