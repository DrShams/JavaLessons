package Math.Division;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("Введите 2 числа: ");
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        if (b == 0) {
            System.out.println("Деление на 0 запрещено");
        } else {
            //форматируем вывод - убираем .0 в конце, добавляем разделители , между тысячами
            DecimalFormat format = new DecimalFormat();
            format.setDecimalSeparatorAlwaysShown(false);

            //выводим результат
            Division division = new Division();
            System.out.println("Деление этих чисел дало результат: " + format.format(Division.divs(a,b)));
        }

    }
}
