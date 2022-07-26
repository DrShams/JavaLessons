package Stars;

import java.util.Scanner;

public class Square {
    public static void main(String[] args) {
        //Ввод и проверка на корректность
        System.out.print("Введите длину грани квадрата: ");
        Scanner sc = new Scanner(System.in);
        if(!sc.hasNextInt() || sc.nextInt() < 1) {
            System.out.println("Неверное значение\nПроверьте правильность ввода\nЗначение грани не должно быть меньше 1");
            System.exit(0);

        }
        int stars = sc.nextInt();//как бы это оптимизировать
        //Вывод
        for (int i = 0; i < stars; i++) {
            for (int j = 0; j < stars; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
