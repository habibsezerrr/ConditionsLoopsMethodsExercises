public class Fibonacci {

    // 1-1-2-3-5-8-13-21 (write code so that output is like this)
    public static void main(String[] args) {

        int number1 = 1;
        int number2 = 1;
        System.out.print(number1 + "-" + number2);

        while (number2 <= 21) {
            int number3 = number2;
            number2 = number1 + number2;
            number1 = number3;
            System.out.print("-" + number2);
        }
    }
}
