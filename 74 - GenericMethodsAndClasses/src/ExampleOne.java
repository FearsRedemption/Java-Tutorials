public class ExampleOne {
    ExampleOne() {
        Integer[] intArray = { 1, 2, 3, 4, 5 };
        Double[] dubArray = { 5.5, 4.4, 3.3, 2.2, 1.1 };
        Character[] charArray = { 'H', 'E', 'L', 'L', 'O' };
        String[] stringArray = { "Bye", "See", "You", "Later" };

        displayArray(intArray);
        displayArray(dubArray);
        displayArray(charArray);
        displayArray(stringArray);

        System.out.println(getFirst(intArray));
        System.out.println(getFirst(dubArray));
        System.out.println(getFirst(charArray));
        System.out.println(getFirst(stringArray));
    }

    public static <Type> void displayArray(Type[] array) {
        for(Type x : array) {
            System.out.print(x + " ");
        }
        System.out.println();
    }

    public static <Type> Type getFirst(Type[] array) {
        return array[0];
    }
}
