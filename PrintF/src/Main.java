public class Main {
    public static void main(String[] args) {
        //Conversion Characters
//        %%	Inserts a % sign
//        %x %X	Integer hexadecimal
//        %t %T	Time and Date
//        %s %S	String
//        %n	Inserts a newline character
//        %o	Octal integer
//        %f	Decimal floating-point
//        %e %E	Scientific notation
//        %g	Causes Formatter to use either %f or %e, whichever is shorter
//        %h %H	Hash code of the argument
//        %d	Decimal integer
//        %c	Character
//        %b %B	Boolean
//        %a %A	Floating-point hexadecimal

        boolean myBool = true;
        char myChar = '#';
        String myString = "Chris";
        int myInt = 3500;
        double myDub = 3000.14;

        System.out.printf("This is a %f format string %n", myDub);
        System.out.printf("This is a %b format string %n", myBool);
        System.out.printf("This is a %c format string %n", myChar);
        System.out.printf("This is a %s format string %n", myString);
        System.out.printf("This is a %x format string %n", myInt);

        //Width
        System.out.printf("Hello %10s %n", myString);
        System.out.printf("Hello %-10s %n", myString);

        //Precision
        System.out.printf("You have this much money %.2f %n", myDub);

        //Flags
        System.out.printf("You have this much money %20f %n", myDub);
        System.out.printf("You have this much money %+f %n", myDub);
        System.out.printf("You have this much money %020f %n", myDub);
        System.out.printf("You have this much money %,f %n", myDub);
    }
}