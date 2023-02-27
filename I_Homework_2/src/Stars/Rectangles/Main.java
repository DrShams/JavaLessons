package Stars.Rectangles;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Rectangles reactangles = new Rectangles();

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter rectangle's lenght");
        int lenght = sc.nextInt();
        System.out.println("Enter rectangle's width");
        int altitude = sc.nextInt();
        if(lenght == altitude) {
            System.out.println("Wow it's a square!");
        }
        Rectangles.stars(lenght,altitude);

    }
}
