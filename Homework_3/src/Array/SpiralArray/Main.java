package Array.SpiralArray;

public class Main {
    public static void main(String[] args) {
        SpiralArray sarr = new SpiralArray();

        int rows = sarr.getNumber("rows");
        int columns = sarr.getNumber("columns");
        sarr.SpiralOutput(rows,columns);
    }
}
