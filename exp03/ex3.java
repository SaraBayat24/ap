package exp03;
import java.util.Scanner;


public class ex3 {
    private static Object maxRow;

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
        }
        int maxSum = Integer.MIN_VALUE;
        int maxRow = -1;



        for (int i = 0; i < rows; i++) {
            int rowSum = 0;
            for (int j = 0; j < cols; j++) {
                rowSum += matrix[i][j];
            }

            if (rowSum > maxSum) {
                maxSum = rowSum;
                maxRow = i;



                System.out.println("بیشترین  مقدار مجموع مربوط به خط شماره " + maxRow + " ");
                System.out.println("مقدار مجموع آن برابر است با: " + maxSum);

                input.close();




            }
        }


    }






}