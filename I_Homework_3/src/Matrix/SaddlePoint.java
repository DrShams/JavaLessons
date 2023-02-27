package Matrix;

import java.io.FileReader;
import java.util.*;

public class SaddlePoint {
    public static void main(String[] args) throws Exception {
        int numberOfRows = 10;
        int numberOfColumns = 10;
        int array[][] = new int[numberOfRows][numberOfColumns];

        ArrayList<Integer> arrmax = new ArrayList<>();//список из максимумов в пределах строки
        ArrayList<Integer> arrmin = new ArrayList<>();//список из минимумов в пределах столбцов

        String path = "src/Matrix/INPUT.txt";
        FileReader reader = new FileReader(path);
        Scanner sc = new Scanner(reader);

        List<List<Integer>> listOfLists = new ArrayList<>();//для записи координат
        //прочитаем файл и запишем в массив данные матрицы (построково)
        for (int i = 0, maximum = 0; i < numberOfRows ; i++) {
            List<Integer> innerList = new ArrayList<>();
            int x = 0;
            int y = 0;
            for (int j = 0; j < numberOfColumns; j++) {
                array[i][j] = sc.nextInt();
                if(maximum < array[i][j]) {
                    maximum = array[i][j];
                    x = i;
                    y = j;
                }
            }
            arrmax.add(maximum);
            innerList.add(x);//coordinates
            innerList.add(y);
            listOfLists.add(innerList);
        }

        //прочитаем данные матрицы (по столбцам)
        for (int i = 0, minimum = 0; i < numberOfRows ; i++) {
            for (int j = 0; j < numberOfColumns; j++) {
                if(j == 0) {
                    minimum = array[j][i];
                }
                else
                {
                    if(minimum > array[j][i]) {
                        minimum = array[j][i];
                    }
                }
            }
            arrmin.add(minimum);
        }

        boolean saddlepointIffound = false;
        for (int i = 0; i < numberOfRows; i++) {

            if (arrmin.get(i).equals(arrmax.get(i))) {
                System.out.println("A saddle point was found: " + arrmin.get(i));
                System.out.println("Coordinates for the saddle point are: " + listOfLists.get(i));
                saddlepointIffound = true;
            }
        }
        System.out.println("Maximum elements are: " + arrmax);
        System.out.println("Minimum elements are: " + arrmin);
        if(saddlepointIffound == false) {
            System.out.println("There is no saddle points in the matrix");
        }
        reader.close();

        System.out.println(listOfLists);
    }
}
