package package1;
import package2.*;

public class A {
    public static void main(String[] args) {
        C c = new C();
        B b = new B();
        Asub asub = new Asub();
        System.out.println(c.publicMessage);
        //System.out.println(b.privateMessage);
    }

}