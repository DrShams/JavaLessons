import java.util.Random;
import java.util.Scanner;
import java.util.regex.Pattern;

public class BullsAndCows {
    public static void main(String[] args) {

        final int MAXSIZE = 4;//максимальное кол-во символов

        //Введем число
        System.out.print("Enter 4 digit number: ");
        Scanner sc = new Scanner(System.in);
        String mynumber = sc.nextLine();
        int[] arrMynumber = new int[MAXSIZE];
        //проверим что число введено верно
        if(!Pattern.matches("[0-9]{" + MAXSIZE + "}",mynumber)) {
            System.out.println("Invalid value, please check your input\nValid value example: 0123");
            System.exit(0);
        } else {
            //проверим число на уникальность - Костыль
            for (int i = 0; i < MAXSIZE; i++) {
                arrMynumber[i] = Character.getNumericValue(mynumber.charAt(i));
                for(int x = 0; x < i; x++) {
                    if(arrMynumber[i] == arrMynumber[x]) {//если есть повтор меняем это число на любой другое
                        System.out.println("You have input same digit\nExample of correct input: 0123");
                        System.exit(0);
                    }
                }
            }
        }

        //Загадаем число
        int[] arrPnumber = new int[MAXSIZE];
        Random rnd = new Random();
        for (int i = 0; i < MAXSIZE; i++) {
            arrPnumber[i] = rnd.nextInt(9);
            //проверим на отсутствие повторений
            for(int x = 0; x < i; x++) {
                action://<- goto
                if(arrPnumber[i] == arrPnumber[x]) {
                    arrPnumber[i] = rnd.nextInt(9);
                    //теперь проверим нет ли повторений в только что сгенеренном числе по отношению к другим числам
                    for (int z = 0; z < MAXSIZE; z++) {
                        if(arrPnumber[i] == arrPnumber[z]) {
                            break action;//аналог goto->
                        }
                    }
                }
            }
        }//на выходе из цикла получим уникальное число
        System.out.print("The computer came up with the following number: ");
        for (int i = 0; i < MAXSIZE; i++) {
            System.out.print(arrPnumber[i]);
        }
        System.out.print("\nYou made choice: ");
        for (int i = 0; i < MAXSIZE; i++) {
            System.out.print(arrMynumber[i]);
        }

        //посчитаем быков
        int bulls = 0;
        for (int i = 0; i < MAXSIZE; i++) {
            if(arrMynumber[i] == arrPnumber[i]) {
                bulls++;
            }
        }

        //посчитаем коров
        int cows = 0;
        for (int i = 0; i < MAXSIZE; i++) {
            for (int j = 0; j < MAXSIZE; j++) {
                if(arrMynumber[i] != arrPnumber[i] && arrMynumber[i] == arrPnumber[j]) {
                    cows++;
                }
            }
        }

        //выведем результат
        System.out.println("\nThe computer reply: " + bulls + " bulls " + " and " + cows + " cows");
    }
}
