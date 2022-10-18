public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        car.go();

        Bike bike = new Bike();
        bike.stop();

        System.out.println(car.doors);
        System.out.println(bike.pedals);
    }
}