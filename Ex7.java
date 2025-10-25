import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Enter floating-point numbers (in one line): ");


        double sum = 0;
        double min = Double.MAX_VALUE;
        double max = -Double.MAX_VALUE;
        int count = 0;


        while (in.hasNextDouble()) {
               double num = in.nextDouble();
            sum = sum + num;
                 if (num < min) min = num;
               if (num > max) max = num;
            count++;
        }

        double average = 0;
        if (count > 0) average = sum / count;
        double range = max - min;

        System.out.println("Average: " + average);

        System.out.println("Smallest: " + min);
        System.out.println("Largest: " + max);
        System.out.println("Range: " + range);

        in.close();
    }
}
