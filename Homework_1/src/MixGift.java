import java.sql.SQLOutput;
import java.util.Scanner;

public class MixGift {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int COUNTNUM=4;
        System.out.println("Введите вес подарка, вес апельсина, вес яблока, вес груши через пробел или с новой строки");
        int giftweight = 0;
        int[] fruitweight = new int[3];//кол-во фруктов
        String[] fruitname = {"апельсин" , "яблок", "груш"};
        //выведем на экран и сохраним значения в переменные
        for (int i = 0; i < COUNTNUM; i++) { //выведем только первые 4 числа
            if(sc.hasNextInt()){
                int x = sc.nextInt();
                if (x < 0) {
                    System.out.println("Отрицательное число которое вы ввели " + x);
                    x = Math.abs(x);
                    System.out.println("было преобразовано в положительное " + x);
                }
                if (i == 0) {
                    System.out.println("Вес подарка " + x);
                    giftweight = x;
                }
                else {
                    fruitweight[i-1] = x;
                    System.out.println("Вес фрукта № " + i + ": " + x + " " + fruitname[i-1]);
                }

            } else {
                System.out.println("вы ввели не число");
                System.exit(0);
            }

        }
        //перебираем варианты
        int variants = 0;
        //если целиком фрукты
        for (int i = 0; i < fruitweight.length; i++) {
            if (fruitweight[i] != 0 && giftweight % fruitweight[i] == 0) {//опускаем 0
                int num = giftweight/fruitweight[i];
                System.out.println(++variants + " вариант: " + num + " " + fruitname[i]);
            }
        }
        //если микс
            //апельсин и яблок
        if( (fruitweight[0] != 0 && fruitweight[1] != 0) &&
                giftweight % (fruitweight[0] + fruitweight[1]) == 0) {
            int totalcount = giftweight/(fruitweight[0] + fruitweight[1]);//в сумме фруктов
            System.out.println(++variants + " вариант: " + totalcount + " " + fruitname[0] + " и " + totalcount + " " + fruitname[1]);
        }
            //апельсин и груш
        if((fruitweight[0] != 0 && fruitweight[2] != 0) &&
                giftweight % (fruitweight[0] + fruitweight[2]) == 0) {
            int totalcount = giftweight/(fruitweight[0] + fruitweight[2]);//в сумме фруктов
            System.out.println(++variants + " вариант: " + totalcount + " " + fruitname[0] + " и " + totalcount + " " + fruitname[2]);
        }
        if((fruitweight[1] != 0 && fruitweight[2] != 0) &&
                giftweight % (fruitweight[1] + fruitweight[2]) == 0) {
            int totalcount = giftweight/(fruitweight[1] + fruitweight[2]);//в сумме фруктов
            System.out.println(++variants + " вариант: " + totalcount + " " + fruitname[1] + " и " + totalcount + " " + fruitname[2]);
        }
        if((fruitweight[0] != 0 && fruitweight[1] != 0 && fruitweight[2] != 0) &&
                giftweight % (fruitweight[0] + fruitweight[1] + fruitweight[2]) == 0) {
            int totalcount = giftweight/(fruitweight[0] + fruitweight[1] + fruitweight[2]);//в сумме фруктов
            System.out.println(++variants + " вариант: " + "по " + totalcount + " (" + fruitname[0] + " " + fruitname[1] + " " + fruitname[2] + ")");
        }
        if(variants == 0) {
            System.out.println("Без вариантов - sorry");
        }
    }
}
