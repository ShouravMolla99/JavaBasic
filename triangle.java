import java.util.Scanner;

public class triangle {
    public static void main(String[] args) {
        Scanner inputUser = new Scanner(System.in);
        double base, area, height;

        System.out.print("Enter base: ");
        base = inputUser.nextDouble();

        System.out.print("Enter height: ");
        height = inputUser.nextDouble();

        area = 0.5 * base * height;

        System.out.println("The Area is : " + area);
        inputUser.close();
    }
}
