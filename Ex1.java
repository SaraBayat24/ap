import java.util.Scanner;

public class Ex1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter floating-point number : ");
        double x = input.nextDouble();

        if (x == 0) {
            System.out.print("the number you entered is zero ");
        }
        else if (x > 0) {
            System.out.print("the number you entered is positive ");
        }
        else {
            System.out.print("the number you entered is negative ");
        }

        // تبدیل عدد منفی به مثبت برای بررسی اندازه
        if (x < 0) {
            x = x * -1;
        }

        if (x < 1) {
            System.out.print("small ");
        }

        if (x > 1000000) {
            System.out.print("large ");
        }

        input.close();
    }
}
