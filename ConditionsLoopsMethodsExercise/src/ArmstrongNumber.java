import java.util.Scanner;

public class ArmstrongNumber {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int number = s.nextInt();
        System.out.print("Enter the number of digits: ");
        int numberDigits = s.nextInt();

        int temporaryNumber = number;
        int total = 0;

        do{
            int placeValue = temporaryNumber % 10;
            temporaryNumber = temporaryNumber / 10;
            total += Math.pow(placeValue, numberDigits);

        }while (temporaryNumber > 0);

        if (number == total){
            System.out.println("This is a armstrong number...");
        }
        else{
            System.out.println("This is not a armstrong number...");
        }
    }
}
