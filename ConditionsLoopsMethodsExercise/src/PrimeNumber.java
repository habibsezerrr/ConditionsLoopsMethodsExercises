import java.util.Scanner;

public class PrimeNumber {

    public static void main(String[] args) {

        // With Do while, prime query of number written to lines of code before the program runs

        int number = 4;
        int variable = 0;
        int i = 2;

        do {
            if (number % i == 0 ) {
                variable++;
            }
            i++;
            if (number == 2) { // We wrote special condition for 1 and 2
                variable = 0;
            }
            if (number == 1) {
                variable = 1;
            }

        }while(i < number);

        if (variable == 0) {
            System.out.println("Number is prime...");
        }
        else {
            System.out.println("Number is not prime...");
        }

        System.out.println("****************************");

        // prime query of the number written before the program runs

        int number2 = 3;
        boolean isPrime = true;

        if (number2 == 0 || number2 == 1 || number2 < 0) {
            isPrime = false;
        }

        for (int j = 2; j < number2; j++){
            if(number2 % j == 0 ){
                isPrime = false;
            }
        }

        if(isPrime){
            System.out.println("Number is prime...");
        }else{
            System.out.println("Number is not prime...");
        }

        System.out.println("****************************");

        // prime query of number received from user

        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number3 = s.nextInt();
        int counter = 0;

        for (int k = 2; k < number3; k++) {
            if (number3 % k == 0){
                counter++;
            }
        }
        if (counter != 0 || number3 == 0 || number3 == 1 || number3 < 0) {
            System.out.println("The number " + number3 + " is not prime");
        }
        else {
            System.out.println("The number " + number3 + " is prime");
        }
    }
}
