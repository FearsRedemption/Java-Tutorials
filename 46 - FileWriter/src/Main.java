import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            FileWriter writer = new FileWriter("poem.txt");
            writer.write("Roses are red " +
                    "\nViolets are blue " +
                    "\nbooty \n\tbooty \n\t\tbooty \n\t\t\tbooty " +
                    "\nRockin' everywhere");
            writer.append("\n(A Poem By Chris)");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}