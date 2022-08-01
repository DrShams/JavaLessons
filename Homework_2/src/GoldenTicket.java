import java.util.Scanner;
import java.util.regex.Pattern;

public class GoldenTicket {

    public static void main(String[] args) {

        //ввод номера
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your ticket number");
        String goldenumber = sc.next();

        //проверим что число введено верно
        if(Pattern.matches("\\d{" + goldenumber.length() + "}",goldenumber)) {//ожидаем на вход n значный номер, возможно заменить маг.констунту через final int MAXSIZE=6 как?
            int x = 0;
            for (int i = 0; i < goldenumber.length(); i++) {
                //если это первая половина билета суммируем
                if (i < goldenumber.length()/2) {
                    x += Character.getNumericValue(goldenumber.charAt(i));
                }
                //вторая половина? - вычитаем
                else {
                    x -= Character.getNumericValue(goldenumber.charAt(i));
                }
            }
            if(x == 0) {
                System.out.println("You've a lucky ticket");
            }
            else {
                System.out.println("You've a simple ticket");
            }

        }
        else {
            System.out.println("[Error] The ticket should consists only digits");
        }

    }
}