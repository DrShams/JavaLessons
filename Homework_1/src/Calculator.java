import java.util.Scanner;

public class Calculator {

    static Scanner scanner = new Scanner(System.in);

    public static String word = "";
    public static String stopword = "stop";

    public static void main(String[] args) {

        while (true) {
            int num1 = getInt();
            int num2 = getInt();
            char operation = getOperation();
            int result = calc(num1,num2,operation);
            System.out.println("Результат операции: "+result);
        }
    }

    public static int getInt(){
        System.out.println("Введите число: (или пропишите stop чтобы завершить программу)");
        int num = 0;
        if(scanner.hasNextInt()){
            num = scanner.nextInt();
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
                num = getInt();
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

    public static int calc(int num1, int num2, char operation){
        int result = 0;
        switch (operation){
            case '+':
                result = num1+num2;
                break;
            case '-':
                result = num1-num2;
                break;
            case '*':
                result = num1*num2;
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
