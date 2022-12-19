import java.util.Scanner;

public class stringInput {
    public static void main(String[] args) {
        Scanner str = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = str.next();

        System.out.println("Welcome Mr." + name);
        str.close();

    }
}
