package Matrix;

import java.io.FileReader;
import java.util.Scanner;

public class MaxElement {
    public static void main(String[] args) throws Exception{

        int numberOfRows = 10;
        int numberOfColumns = 10;
        int array[][] = new int[numberOfRows][numberOfColumns];

        String path = "src/Matrix/INPUT.txt";
        FileReader reader = new FileReader(path);
        Scanner sc = new Scanner(reader);

        int maximum = 0;
        for (int i = 0; i < numberOfRows ; i++) {
            for (int j = 0; j < numberOfColumns; j++) {
                array[i][j] = sc.nextInt();
                if(maximum < array[i][j]) {
                    maximum = array[i][j];
                }
            }
        }
        System.out.println("Maximum element is: " + maximum);
        reader.close();
    }
}
