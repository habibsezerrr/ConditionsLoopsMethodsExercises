import java.util.Scanner;

public class FactorialExercises {

    public static void main(String[] args) {

        // 5! = 5 4 3 2 1

        Scanner s = new Scanner(System.in);

        System.out.print("Enter a number: ");

        int factorial = 1;

        int number = s.nextInt();

        for (int i = 1; i <= number; i++) {

            factorial *= i;
            System.out.println("Factorial of " + i + " = " + factorial);
        }

        System.out.println("******************************************");

        System.out.print("Please enter a number: ");
        int number2 = s.nextInt();

        int factorial2 = 1;

        if (number2 < 0) {
            System.out.println("Invalid number");
        }
        else {
            for (int i = 1; i <= number2; i++) {
                factorial2 *= i;
            }
            System.out.println("Factorial of " + number2 + " = " + factorial2);
        }

        System.out.println("******************************************");

        //Factorial with while

        System.out.print("Enter a number: ");

        int number3 = s.nextInt();

        int factorial3 = 1;

        while (number3 > 0){

            factorial3 *= number3;
            number3--;

        }
        System.out.println("Factorial = " + factorial3);
    }
}
