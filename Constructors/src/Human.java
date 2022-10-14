public class Human {
    String name;
    int age;
    double weight;

    Human(String Name, int Age, double Weight) {
        this.name = Name;
        this.age = Age;
        this.weight = Weight;
    }

    void Eat() {
        System.out.println(this.name + " is eating.");
    }

    void Drink() {
        System.out.println(this.name + " is drinking.");
    }
}
