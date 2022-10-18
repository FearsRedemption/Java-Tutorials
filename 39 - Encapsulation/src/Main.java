public class Main {
    public static void main(String[] args) {
        //getters and setters

        Car car = new Car("Ford", "Mustang", 2022);

        System.out.println(car.getMake());
        System.out.println(car.getModel());
        System.out.println(car.getYear());

        car.setYear(2021);

        System.out.println(car.getYear());
    }
}