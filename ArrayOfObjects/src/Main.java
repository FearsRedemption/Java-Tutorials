public class Main {
    public static void main(String[] args) {
        //Food[] fridge = new Food[3]; **

        Food food1 = new Food("Pizza");
        Food food2 = new Food("Burger");
        Food food3 = new Food("Hotdog");

        Food[] fridge = {food1, food2, food3};

//        fridge[0] = food1; **
//        fridge[1] = food2; **
//        fridge[2] = food3; **

        System.out.println(fridge[0].name);
        System.out.println(fridge[1].name);
        System.out.println(fridge[2].name);
    }
}