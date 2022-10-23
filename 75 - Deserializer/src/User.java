import java.io.Serializable;

public class User implements Serializable {
    String name;
    transient String password; //transient is ignored in serialization

    public void sayHello() {
        System.out.println("Hello " + name);
    }
}
