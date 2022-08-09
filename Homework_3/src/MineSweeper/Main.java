package MineSweeper;

import java.io.File;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        File doc = new File("src/MineSweeper/INPUT.txt");
        Scanner obj = new Scanner(doc);
        int row = 0;//переменная для определения строки файла

        int m = 0;
        int n = 0;
        int k = 0;
        int[][] matrix = new int[0][];
        do {//можно было бы обойтись без цикла т.к. всего 2 строки

            if (++row == 1) {//если первая строка
                m = obj.nextInt();
                n = obj.nextInt();
                //k = obj.nextInt();//в данном случае смотрим на кол-во строк в файле
                matrix = new int[m][n];
            } else {//если вторая строка
                int x = obj.nextInt() - 1, y = obj.nextInt() - 1;
                matrix[x][y] = 9;//расставим мины по заданным координатам
                //прибавим +1 соседям
                for (int nb = 0; nb < 8; nb++) {
                    try {
                        switch (nb) {
                            case 0 -> matrix[x - 1][y - 1]++;
                            case 1 -> matrix[x - 1][y]++;
                            case 2 -> matrix[x - 1][y + 1]++;
                            case 3 -> matrix[x][y - 1]++;
                            case 4 -> matrix[x][y + 1]++;
                            case 5 -> matrix[x + 1][y - 1]++;
                            case 6 -> matrix[x + 1][y]++;
                            case 7 -> matrix[x + 1][y + 1]++;
                        }
                    } catch (StackOverflowError e) {
                        //System.out.println(x + "[0]Error" + y + "nb" + nb);
                    } catch (ArrayIndexOutOfBoundsException exception) {
                        //System.out.println(x + "[1]Error" + y + "nb" + nb);
                    }
                }
            }
        } while (obj.hasNextLine()) ;

        for (int y = 0; y < m; y++) {
            for (int x = 0; x < n; x++) {
                String res = Integer.toString(matrix[y][x]);
                if (matrix[y][x] >= 9) res = "m";
                System.out.print(x == (n - 1) ? res : res + " ");
            }
            System.out.println();
        }
    }
}