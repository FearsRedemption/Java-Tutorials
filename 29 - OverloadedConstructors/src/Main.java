public class Main {
    public static void main(String[] args) {
        Pizza pizza1 = new Pizza("Thick Crust", "Tomato", "Mozzarella", "Pepperoni");
        System.out.println("Here are the ingredients of your pizza: ");
        System.out.println(pizza1.bread);
        System.out.println(pizza1.sauce);
        System.out.println(pizza1.cheese);
        System.out.println(pizza1.topping);
        System.out.println();

        Pizza pizza2 = new Pizza("Thin Crust", "Tomato", "Mozzarella");
        System.out.println(pizza2.bread);
        System.out.println(pizza2.sauce);
        System.out.println(pizza2.cheese);
    }
}