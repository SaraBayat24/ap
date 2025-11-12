package exp03;
import java.util.Scanner;


public class ex3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("تعداد سطرهای ماتریس را وارد کنید: ");
        int rows = input.nextInt();
        System.out.print("تعداد ستون‌های ماتریس را وارد کنید: ");
        int cols = input.nextInt();

        int[][] matrix = new int[rows][cols];

        // ورودی ماتریس
        System.out.println("مقدار درایه های ماتریس را وارد کنید::");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("عنصر [" + i + "][" + j + "]: ");
                matrix[i][j] = input.nextInt();
            }
        }}}