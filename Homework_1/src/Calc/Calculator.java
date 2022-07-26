package Calc;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Calculator {

    Scanner scanner = new Scanner(System.in);

    public String word = "";
    public final String stopword = "stop";

    public Calculator() {

    }
    public void calculation() {

        while (true) {

            //считываем данные с клавы
            double num1 = getNumber();
            double num2 = getNumber();
            char operation = getOperation();

            //форматируем вывод - убираем .0 в конце, добавляем разделители , между тысячами
            DecimalFormat format = new DecimalFormat();
            format.setDecimalSeparatorAlwaysShown(false);

            //выводим результат
            double result = calc(num1,num2,operation);
            System.out.println("Результат операции: " + format.format(result));
        }
    }

    public double getNumber(){
        System.out.println("Введите число: (или пропишите stop чтобы завершить программу)");
        double num = 0.0;
        if(scanner.hasNextDouble()){
            num = scanner.nextDouble();//работает и на int
        } else {
            if(scanner.hasNext()){
                word = scanner.next();
                if (word.equals(stopword)){
                    System.out.println("Program has been stoppped");
                    System.exit(0);
                }
            }
            else {
                System.out.println("Вы допустили ошибку при вводе числа. Попробуйте еще раз.");
                scanner.next();//рекурсия
                num = getNumber();
            }
        }
        return num;
    }

    public char getOperation(){
        System.out.println("Введите операцию: (или пропишите stop чтобы завершить программу)");
        char operation = 'x';
        if(scanner.hasNext()){
            word = scanner.next();
            if (word.equals(stopword)){
                System.out.println("Program has been stoppped");
                System.exit(0);
            }
            else {
                operation = word.charAt(0);
            }
        } else {
            System.out.println("Вы допустили ошибку при вводе операции. Попробуйте еще раз.");
            scanner.next();//рекурсия
            operation = getOperation();
        }
        return operation;
    }

    public double calc(double num1, double num2, char operation){
        double result = 0.0;
        switch (operation){
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if (num2 == 0) {
                    System.out.println("Ошибка - деление на ноль запрещено!");
                    break;
                }
                else {
                    result = num1/num2;
                    break;
                }
            default:
                System.out.println("Операция не распознана. Повторите ввод.");
                result = calc(num1, num2, getOperation());//рекурсия
        }
        return result;
    }

}
