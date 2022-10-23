import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        //Specific Classes
        MyIntClass myInt = new MyIntClass(1);
        MyDubClass myDouble = new MyDubClass(3.14);
        MyCharClass myChar = new MyCharClass('$');
        MyStringClass myString = new MyStringClass("Hello");

        System.out.println(myInt.getValue());
        System.out.println(myDouble.getValue());
        System.out.println(myChar.getValue());
        System.out.println(myString.getValue());

        //Generic Class
        MyGenericClass<Integer, Integer> myGenInt = new MyGenericClass<>(2, 9);
        MyGenericClass<Double, Double> myGenDouble = new MyGenericClass<>(4.14, 1.01);
        //Since we changed the Extends on the MyGenericClass to Number we can no longer do the below commented out code
//        MyGenericClass<Character, Character> myGenChar = new MyGenericClass<>('@', '%');
//        MyGenericClass<String, Character> myGenString = new MyGenericClass<>("Good Bye", '!');

        //ArrayList<String> myFriends = new ArrayList<>();
        HashMap<Integer, String> users = new HashMap<>();

        System.out.println(myGenInt.getValue());
        System.out.println(myGenDouble.getValue());
//        System.out.println(myGenChar.getValue());
//        System.out.println(myGenString.getValue());
    }
}