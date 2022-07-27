package Stars.Square;

import java.util.Scanner;

public class Square {
    public Square() {

    }
    public static void stars() {
        //Ввод и проверка на корректность
        System.out.print("Enter the length of the square side: ");
        Scanner sc = new Scanner(System.in);
        if(!sc.hasNextInt()) {
            System.out.println("You have not entered a value");
            System.exit(0);
        }
        int stars = sc.nextInt();//как бы это оптимизировать?
        if(stars < 1) {
            System.out.println("Check if the input is correct\nedge's value must not be less than 1");
            System.exit(0);
        }
        //Вывод
        for (int i = 0; i < stars; i++) {
            for (int j = 0; j < stars; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
