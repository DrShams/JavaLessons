public class Numbers {
    public static void main(String[] args) {

        for (int maxnumber = 1000; maxnumber > 1; maxnumber = maxnumber-2) {
            System.out.println("number is " + maxnumber);
            if (maxnumber == 2) { //Вывести числа от 1000 до 1 с шагом -2.
                System.out.println("number is " + (maxnumber-1));
            }
        }
    }
}
