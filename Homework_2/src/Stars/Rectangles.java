package Stars;

import java.util.Scanner;

public class Rectangles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter square lenght ");
        int lenght = sc.nextInt();
        System.out.println("Enter square altitude ");
        int altitude = sc.nextInt();
        brushRectangle(lenght,altitude);
    }

    public static void brushRectangle(int a, int b){
        for(int i=1;i<=b;i++){
            for(int j=1;j<=a;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
