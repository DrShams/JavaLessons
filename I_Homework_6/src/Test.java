import java.sql.SQLOutput;
import java.util.Random;

public class Test {
    public static void main(String[] args) throws Exception {
        int a = 0;
        int b = 2;
        try {
            int c = b / a;
        }
        catch (ArithmeticException e) {
            System.out.println(e);
        }
        finally {
            System.out.println("finally");
        }

        Random rand = new Random();
        int n = rand.nextInt(100);
        System.out.println(n);
        //5000 18800
        double start = 0;
        double end = 100;
        double random = new Random().nextDouble();
        double result = start + (random * (end - start));


        double max = 18800;
        double min = 5000;
        double chance = (min/max)*100;
        System.out.println(chance);
        if (result > chance) {
            System.out.println("выполнить 1ую операцую" + result);
        }
        else {
            System.out.println(result);
        }


    }
}
