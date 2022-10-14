public class Main {
    public static void main(String[] args) {
        System.out.println(Add(2, 4));
        System.out.println(Add(2, 4, 6));
        System.out.println(Add(2, 4, 6, 8));
        System.out.println(Add(2.5, 4.8));
        System.out.println(Add(2.5, 4.5, 6.5));
        System.out.println(Add(2, 4, 6.5, 8));
    }

    static int Add(int a, int b) {
        return a + b;
    }

    static int Add(int a, int b, int c) {
        return a + b + c;
    }

    static int Add(int a, int b, int c, int d) {
        return a + b + c + d;
    }

    static double Add(double a, double b) {
        return a + b;
    }

    static double Add(double a, double b, double c) {
        return a + b + c;
    }

    static double Add(double a, double b, double c, double d) {
        return a + b + c + d;
    }
}