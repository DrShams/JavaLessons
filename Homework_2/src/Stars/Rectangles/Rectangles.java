package Stars.Rectangles;

public class Rectangles {
    public Rectangles() {

    }
    public static void stars(int a, int b){
        for(int i=1;i<=b;i++){
            for(int j=1;j<=a;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
