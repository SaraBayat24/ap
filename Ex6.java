import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("How many numbers ? ");
        int count = input.nextInt();


        System.out.print("Enter number 1: ");
        int num = input.nextInt();

        int smallest = num;
        int largest = num;

        for (int i = 2; i <= count; i++) {
            System.out.print("Enter number " + i + ": ");
            num = input.nextInt();

            if (num < smallest) {
                smallest = num;
            }
            if (num > largest) {
                largest = num;
            }
        }
    }
}
