public class Rectangle {
    public static void main(String[] args) {
        Pryamougl(1,1);
    }
    static void Pryamougl(int a, int b) {
        String star = "";
        String space = "";
        for (int j = 0; j <= b - 1 ; j++) {
            star = star + "*";
            space = space + " ";
        }
        space = space.substring(0, space.length() - 2);
        System.out.println(star);
        for (int i = 0; i <= a-3; i++) {
            System.out.println("*" + space + "*");
        }
        System.out.println(star);
    }
}
