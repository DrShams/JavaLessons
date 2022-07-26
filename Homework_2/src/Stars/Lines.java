package Stars;

import java.util.Scanner;

public class Lines {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        stars();
    }
    public static void stars () {
        System.out.println("Введите число:");
        int n = sc.nextInt();
        for (; n > 0; n--) {
            System.out.print("*");
/*            if (n%10 == 0) {
                System.out.println("*");
            }
            else
            {
                System.out.println("*");
            }*/
        }
    }
}
