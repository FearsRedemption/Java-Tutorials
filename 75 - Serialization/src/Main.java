import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
//        Serialization = The process of converting an object into a byte stream.
//                        Persists (saves the state) the object after program exits
//                        This byte stream can be saved as a file or sent over a network
//                        Can be sent to a different machine
//                        Byte stream can be saved as a file (.ser) which is platform independent
//                        (Think of this as if you're saving a file with the object's information)

//        Deserialization = The reverse process of converting a byte stream into an object
//                          (Think of this as if you're loading a saved file)

        User user = new User();
        user.name = "Chris";
        user.password = "I<3Pizza";

        FileOutputStream outFile = new FileOutputStream("UserInfo.ser");
        ObjectOutputStream out = new ObjectOutputStream(outFile);
        out.writeObject(user);
        out.close();
        outFile.close();

        System.out.println("Object info saved....");

        long serialVersionUID = ObjectStreamClass.lookup(user.getClass()).getSerialVersionUID();
        System.out.println(serialVersionUID);
    }
}