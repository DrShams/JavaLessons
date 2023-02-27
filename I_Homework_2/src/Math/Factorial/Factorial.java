package Math.Factorial;

public class Factorial {

    public Factorial() {

    }

    public static int facl(int number) {
        int i, fact = 1;
        for(i = 1; i <= number; i++){
            fact = fact * i;
        }
        return fact;
    }
}
