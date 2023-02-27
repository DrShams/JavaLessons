import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CrazyBinary {
    public static void main(String[] args) {

        //Вводим проверяем что это число
        System.out.print("Enter a binary type number: ");
        Scanner sc = new Scanner(System.in);
        String binaryText = sc.nextLine();

        //проверим что число введено верно
        if(!Pattern.matches("[01]*",binaryText)) {//здесь можно как-то добавить AND и сразу же проверить что нулей нет
            System.out.println("Invalid value, please check your input\nExample of correct value: 00100100101000\nZeros must be!");
            System.exit(0);
        }

        //посчитаем и выведем количество нулей
        int countzero = 0;
        Matcher m = Pattern.compile("[0]+").matcher(binaryText);
        while (m.find()) {
            String subString = m.group();
            if (subString.length() > countzero) {
                countzero = subString.length();
            }
        }
        if (countzero == 0) {System.out.println("There are no zeros");}//костыль
        System.out.println("Maximum number of zeros: " + countzero);
    }
}
