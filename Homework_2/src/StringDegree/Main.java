package StringDegree;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) throws Exception {
        //Открыть файл где хранится строка ввода(text) и power(степень)
        File doc = new File("src/StringDegree/INPUT.txt");
        Scanner obj = new Scanner(doc);
        int row = 0;//переменная для определения строки файла
        String text = null;
        int power = 0;
        final int MAXSIZE=1023;

        out://для выхода из вложенных циклов одним break out
        do {//можно было бы обойтись без цикла т.к. всего 2 строки
            if (++row == 1) {//если первая строка
                text = obj.nextLine();
                //System.out.println(text);
            }
            else {//если вторая строка
                power = obj.nextInt();
                if(power == 0 || power > 100001) {
                    System.out.println("Ошибка");
                    System.exit(1);
                } else if (power > 0) {
                    StringBuilder sb = new StringBuilder();
                    double textSumLenght = text.length()*power;
                    for(int i = 0; i < textSumLenght; i+= text.length()) {
                        if ((MAXSIZE - i) < text.length()) {//
                            //выводим только остаточные символы чтобы их сумма в целом вписывалось в ограничения длины
                            sb.append(text.substring(0,(MAXSIZE - i)));
                            break;
                        } else {
                            sb.append(text);
                        }
                    }
                    savefile(sb.toString());
                } else { // power < 0
                    int realpower = 1;
                    for(int i = 1, x = text.length()/2; i < (-power); i++, x = x/2) {
                        //System.out.println(i);
                        if (text.substring(0,x).equals(text.substring(x,x*2))) {
                            realpower = realpower*2;
                            if(realpower == (-power)) {
                                savefile(text.substring(0, x));
                                break;
                            } else if (realpower > (-power)){
                                savefile("NO SOLUTION");
                            }
                        } else {
                            if(i+1 < (-power)) {
                                savefile("NO SOLUTION");
                                break out;
                            }
                        }
                    }
                    if(realpower < (-power)) {
                        savefile("NO SOLUTION");
                        break;
                    }

                }
                break;//больше 2 строки не читаем, даже если есть
            }

        } while (obj.hasNextLine());
        if (power == 0) {
            savefile("NO SOLUTION");
        }
    }

    public static void savefile(String args) {
        try {
            FileWriter myWriter = new FileWriter("src/StringDegree/OUTPUT.txt");
            System.out.println(args + "\nsuccessfully wrote to the file.");
            myWriter.write(args);
            myWriter.close();
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
