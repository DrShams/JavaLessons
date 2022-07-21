import java.text.DecimalFormat;
import java.util.Scanner;

public class Calculator {

    static Scanner scanner = new Scanner(System.in);

    public static String word = "";
    public static final String stopword = "stop";

    public static void main(String[] args) {

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

    public static double getNumber(){
        System.out.println("Введите число: (или пропишите stop чтобы завершить программу)");
        double num = 0.0;
        if(scanner.hasNextDouble()){
            num = scanner.nextDouble();
        } else if (scanner.hasNextInt()) {
            num = (double) scanner.nextInt();
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

    public static char getOperation(){
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

    public static double calc(double num1, double num2, char operation){
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
