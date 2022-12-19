import java.util.Scanner;

public class inputInt {
    public static void main(String[] args) {

        Scanner user = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int number = user.nextInt();

        System.out.println("Number is: " + number);
        user.close();
    }
}
