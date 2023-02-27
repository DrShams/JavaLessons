package Stars.Lines;

import java.util.Scanner;

public class Lines {
    public Lines() {

    }
    public void stars () {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        for (; n > 0; n--) {
            System.out.print("*");
        }
    }
}
