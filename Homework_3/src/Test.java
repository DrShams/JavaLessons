public class Test {
    public static void main(String[] args) {
        String str = "We are living in America, America ...";
        String[] words = str.split(" ");
        for (String word : words) {
            System.out.println(word);
        }
    }
}