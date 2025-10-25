import java.util.Scanner;

public class EX10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = in.nextInt();

        while (number > 0) {
            int r = number % 2;
            System.out.println(r);
            number = number / 2;
        }

        in.close();
    }
}
