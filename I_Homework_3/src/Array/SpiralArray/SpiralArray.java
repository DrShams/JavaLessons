package Array.SpiralArray;

import java.util.Scanner;

class SpiralArray {

    public SpiralArray() {

    }

    public int getNumber(String str){//static
        System.out.print("Enter number of " + str + ": ");
        int num;
        Scanner scanner = new Scanner(System.in);
        if(scanner.hasNextInt()){
            num = scanner.nextInt();//работает и на int
            if (num < 1) {
                System.out.println("You are made a mistake , try again ");
                scanner.next();//рекурсия
                num = getNumber(str);
            }
        } else {
            System.out.println("You are made a mistake , try again ");
            scanner.next();//рекурсия
            num = getNumber(str);
        }
        return num;
    }

    public void SpiralOutput(int rows, int columns) {
        int[][] array = new int[rows][columns];

        //С помощью переменной s задаются числа внутри массива начиная с 1.
        int s = 1;

        //[1]Заполняем массив по часовой стрелке.
        int coord_x = 0;
        int coord_y = 0;

        while (s < rows * columns) {//comments for rows and columns = 6

            //[coord_y = 0] 1,  2,  3,  4,  5,  6,
            //[coord_y = 1] 21,  22,  23,  24
            //[coord_y = 2] 33,  34,
            for (int y = coord_y; y < columns-coord_y; y++) {//right
                array[coord_y][y] = s;
                s++;
            }

            //[coord_x = 0] 7, 8, 9, 10, 11
            //[coord_x = 1] 25, 26, 27
            //[coord_x = 2] 35
            for (int x = (coord_x+1); x < rows-coord_x; x++) {//down
                array[x][columns - (coord_x+1)] = s;
                s++;
            }
            //[coord_y = 0] 12, 13, 14, 15, 16...
            for (int y = columns - (2 + coord_y); y >= coord_y; y--) {//left
                if(array[rows - (1+coord_y)][y] == 0) {//if the value already exists not overwrite in opposite direction
                    array[rows - (1+coord_y)][y] = s;
                }
                s++;
            }
            coord_y++;

            //[coord_x = 0] 17, 18, 19, 20...
            for (int x = rows - (2+coord_x); x > coord_x; x--) {//up
                array[x][coord_x] = s;
                s++;
            }
            coord_x++;

        }

        //Выводим массив в консоль.
        for (int x = 0; x < rows; x++) {
            for (int y = 0; y < columns; y++) {
                if (array[x][y] < 10) {
                    System.out.print(array[x][y]);
                    if(y < (columns-1 )) {//убираем лишний пробел в конце
                        System.out.print("  ");//Два пробела, чтобы в консоли столбцы были ровные.
                    }
                } else {
                    System.out.print(array[x][y]);
                    if(y < (columns-1 )) {//убираем лишний пробел в конце
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }
    }

}
