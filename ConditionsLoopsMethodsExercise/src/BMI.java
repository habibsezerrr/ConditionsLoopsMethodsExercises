import java.util.Scanner;

public class BMI {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.print("Please enter your height (example:1,68) : ");
        double height = s.nextDouble();
        System.out.print("Please enter your weight: ");
        int weight = s.nextInt();

        double bmi = weight / (height * height);
        System.out.println("Your body mass index is : " + bmi);

        if (bmi > 30) {
            System.out.println("Obese");
        } else if (bmi > 25) {
            System.out.println("Fat");
        } else if (bmi > 18.5) {
            System.out.println("Normal");
        } else {
            System.out.println("Skinny");
        }
    }
}
