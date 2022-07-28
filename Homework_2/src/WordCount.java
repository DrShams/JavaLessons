import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class WordCount {
    public static void main(String[] args) {
        while (true) {
            System.out.println("Enter the String");
            Scanner sc = new Scanner(System.in);
            String inString = sc.nextLine();
            Map<String, Integer> unique = new TreeMap<String, Integer>();
            String subString[] = inString.split(" ");

            for (int i = 0; i < subString.length; i++) {
                String string = subString[i];
                unique.put(string, (unique.get(string) == null ? 1 : (unique.get(string) + 1)));//убрать повторения
            }
            System.out.println(unique);
        }
    }
}
