import java.util.Scanner;

public class SumDigitsofNumbers {

    public static void main(String[] args) {

        // Sum of digits of the number 1234 --> 1+2+3+4

        Scanner s = new Scanner(System.in);

        System.out.print("Enter a number: ");

        int number = s.nextInt();
        int total = 0;

        do {
            total += number % 10;

            number /= 10;
        }while(number > 0);

        System.out.println("Sum of digits = " + total);

    }
}
