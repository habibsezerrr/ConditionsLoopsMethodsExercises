import java.util.Scanner;

public class GCDebob {

    // Finding gcd of 2 numbers entered from keyboard

    public static int gcd(int number1, int number2) {

        int gcd = 1;

        for (int i = 1; i <= number1 && i <= number2; i++) {

            if ((number1 % i == 0) && (number2 % i == 0)) {
                gcd = i;
            }
        }
        return gcd; //İf we write return gcd(); program will work infinite
    }

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.print("First Number: ");
        int firstNumber = s.nextInt();

        System.out.print("Second: ");
        int secondNumber = s.nextInt();

        System.out.println("Gcd of 2 numbers: " + gcd(firstNumber, secondNumber));
    }
}