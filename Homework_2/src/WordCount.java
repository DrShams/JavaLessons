import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class WordCount {
    public static void main(String[] args) {
        System.out.println("Enter the String");
        Scanner sc = new Scanner(System.in);
        String inString = sc.nextLine();
        Map<String, Integer> unique = new TreeMap<>();//типа dictionary
        String[] subString = inString.split(" ");

        for(String string: subString) {
            unique.put(string, (unique.get(string) == null ? 1 : (unique.get(string) + 1)));//убрать повторения
        }
        System.out.println(unique);
    }
}
