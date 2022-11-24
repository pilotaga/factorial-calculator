import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        int value = new Scanner(System.in).nextInt();

        System.out.println(calcFact(value));

        System.out.println(calcFactItarative(value));

    }

    private static int calcFact(int value) { // Just trying to be smart
        int mult = 1;
        if (value == 1 || value == 0) {
            return mult;
        }
        mult = value * calcFact(value - 1);
        return mult;
    }

    private static int calcFactItarative(int value) {
        int mult = 1;
        for (int i = value; i > 0; i--){
            mult *= i;
        }
        return mult;
    }
}