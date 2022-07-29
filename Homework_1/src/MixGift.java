import java.util.Scanner;

public class MixGift {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int COUNTNUM = 4;
        System.out.println("Введите вес подарка, вес апельсина, вес яблока, вес груши через пробел или с новой строки");
        int giftweight = 0;
        int[] fruitweight = new int[3];//кол-во фруктов // Оптимизация возможна через Map<Integer, String> fruit = new TreeMap<Integer, String>();
        String[] fruitname = {"апельсин", "яблок", "груш"}; //unique.put(0,"апельсин"); и тд.
        //выведем на экран и сохраним значения в переменные
        for (int i = 0; i < COUNTNUM; i++) { //выведем только первые 4 числа
            if (sc.hasNextInt()) {
                int x = sc.nextInt();
                if (x < 0) {
                    System.out.println("Отрицательное число которое вы ввели " + x);
                    x = Math.abs(x);
                    System.out.println("было преобразовано в положительное " + x);
                }
                else if (x == 0) {//костыль
                    System.out.println("В данное программе 0 значение заменяется на 1 ");
                    x = 1;
                }
                if (i == 0) {
                    System.out.println("Вес подарка " + x);
                    giftweight = x;
                } else {
                    fruitweight[i - 1] = x;
                    System.out.println("Вес фрукта № " + i + ": " + x + " " + fruitname[i - 1]);
                }

            } else {
                System.out.println("вы ввели не число");
                System.exit(0);
            }
        }
        //перебираем варианты
        int variants = 0;
        int wPears;
        out:
        for(int wOrange = 0 ; wOrange <= giftweight; wOrange+= fruitweight[0])//цикл по весу подарка с итерацией веса апельсинов
        {
            for(int wApple = 0; wApple <= giftweight; wApple+= fruitweight[1])//цикл по весу подарка с итерацией веса яблок
            {
                wPears = giftweight - wOrange - wApple;//сколько места осталось под апельсины
                if(wPears < 0) {
                    break out;
                }
                if((giftweight == (wOrange + wApple + wPears))
                        && (wPears % fruitweight[2] == 0))//если убрать это условие будут оставаться остатки, но количество комбинаций станет больше
                {
                    variants++;
                    System.out.print(wOrange / fruitweight[0]);//апельсины
                    System.out.print(" ");
                    System.out.print(wApple / fruitweight[1]);//яблоки
                    System.out.print(" ");
                    System.out.print(wPears / fruitweight[2]);//груши
                    System.out.println();
                }
            }
        }
        System.out.println(variants);
    }
}