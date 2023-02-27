import java.io.FileWriter;
import java.io.IOException;

public class TryCatch {
    public static void main(String[] args) {
        try {
            FileWriter writer = new FileWriter("dsds");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
