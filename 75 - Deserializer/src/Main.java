import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        User user = null;

        FileInputStream inFile = new FileInputStream("E:\\GitHub\\Java Tutorials\\Serialization\\UserInfo.ser");
        ObjectInputStream in = new ObjectInputStream(inFile);
        user = (User) in.readObject();
        in.close();
        inFile.close();

        System.out.println(user.name);
        System.out.println(user.password);
        user.sayHello();

        long serialVersionUID = ObjectStreamClass.lookup(user.getClass()).getSerialVersionUID();
        System.out.println(serialVersionUID);
    }
}