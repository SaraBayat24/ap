import java.util.Scanner;

public class Ex5 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = input.nextInt();


        int sum = 0;

        while (num > 0) {
            int digit = num % 10;
            if (digit % 2 != 0) {
                sum = sum + digit;
            }




}
