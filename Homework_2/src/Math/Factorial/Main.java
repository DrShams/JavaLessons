package Math.Factorial;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("Введите число для вычисления его факториала: ");
        Scanner sc = new Scanner(System.in);
        if(!sc.hasNextInt()) {
            System.out.println("Вы ввели не число");
        }
        int number = sc.nextInt();
        if (number < 0) {
            System.out.println("Вы ввели отрицательное число\nФакториал — функция, определённая на множестве неотрицательных целых чисел");
        }
        else {
            Factorial factorial = new Factorial();
            number = Factorial.facl(number);//в эту же память перезапишем переменную так лучше?
            System.out.println(number);
        }
    }
}
