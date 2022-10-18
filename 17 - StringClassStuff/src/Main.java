public class Main {
    public static void main(String[] args) {
        String name = "     Chris";

        //boolean if exact match (Case Sensitive)
        System.out.println(name.equals("Chris"));
        //boolean if matches (Not Case Sensitive)
        System.out.println(name.equalsIgnoreCase("chris"));
        //int of length
        System.out.println(name.length());
        //char of position provided
        System.out.println(name.charAt(6));
        //int of index location
        System.out.println(name.indexOf('i'));
        //boolean checks if string is empty
        System.out.println(name.isEmpty());
        //String changes to UPPERCASE
        System.out.println(name.toUpperCase());
        //String changes everything to lowercase
        System.out.println(name.toLowerCase());
        //String that removes excess space
        System.out.println(name.trim());
        //Char that replaces another char
        System.out.println(name.replace('r', 'a'));
    }
}