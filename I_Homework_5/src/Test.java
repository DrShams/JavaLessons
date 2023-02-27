import java.util.HashMap;
import java.util.HashSet;

public class Test {
    public static void main(String[] args) {
        HashSet<String> s = new HashSet<>();
        s.add("Hello");
        s.add("Bye");
        s.add("Privet");
        s.add("Poka");
        s.stream().sorted().forEach(System.out::println);

        HashMap<String, Integer> map = new HashMap<>();
        map.put("ruslan", 23);
        System.out.println(map.get("ruslan"));
/*
        HashMap<String, Integer> mapAction = new HashMap<>();
        map.put("ruslan", StartAction);
        System.out.println(map.get("ruslan"));
*/
    }
}
