import java.io.File;

public class Main {
    public static void main(String[] args) {
        //must include the file extension
        File file1 = new File("E:/GitHub/Java Tutorials/SecretFile/secret_message.txt");
        File file2 = new File("E:/GitHub/Java Tutorials/SecretFile/secret_message.txt");

        if(file2.exists()) {
            System.out.println("That file exists :0");
            System.out.println(file2.getPath());
            System.out.println(file2.getAbsolutePath());
            System.out.println(file2.isFile());
            file2.delete();
        } else {
            System.out.println("That file doesn't exist :(");
        }
    }
}