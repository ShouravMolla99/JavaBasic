import java.util.Scanner;

public class inputIntII {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        System.out.print("Enter First Number: ");
        int num1 = inputScanner.nextInt();

        System.out.print("Enter Second Number: ");
        int num2 = inputScanner.nextInt();

        System.out.print("Enter Third Number: ");
        int num3 = inputScanner.nextInt();

        int sum = num1 + num2 + num3;
        System.out.println("The Result is : " + sum);

        inputScanner.close();
    }
}
