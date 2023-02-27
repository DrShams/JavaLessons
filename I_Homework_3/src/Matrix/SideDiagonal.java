package Matrix;

import java.io.FileReader;
import java.util.Scanner;

public class SideDiagonal {
    public static void main(String[] args) throws Exception {
        int sum = 0;
        int numberOfRows = 10;
        int numberOfColumns = 10;
        int array[][] = new int[numberOfRows][numberOfColumns];
        String path = "src/Matrix/INPUT.txt";
        FileReader reader = new FileReader(path);
        Scanner sc = new Scanner(reader);

       for (int i = 0; i < numberOfRows ; i++) {
           for (int j = 0; j < numberOfColumns; j++) {
                array[i][j] = sc.nextInt();
                if (i == (numberOfColumns- j - 1)) {
                    sum = sum + array[i][j];
                    System.out.print(array[i][j] + " ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
        System.out.println("Element sum on side diagonal: " + sum);
        reader.close();
    }
}
