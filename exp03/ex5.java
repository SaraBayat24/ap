package exp03;


import java.util.Scanner;

public class ex5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("تعداد سطرها: ");
        int rows = input.nextInt();
        System.out.print("تعداد ستون‌ها: ");
        int cols = input.nextInt();

        int[][] matrix = new int[rows][cols];

        System.out.println("مقدار درایه های ماتریس را وارد کنید :");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = input.nextInt();
            }

            System.out.print("شماره سطری که حذف شود: ");
            int theRow = input.nextInt() - 1;
            System.out.print("شماره ستونی که حذف شود: ");
            int theCol = input.nextInt() - 1;

            System.out.println("ماتریس جدید:");
            for ( i = 0; i < rows; i++) {
                if (i == theRow) continue;
                for (int j = 0; j < cols; j++) {
                    if (j == theCol) continue;
                    System.out.print(matrix[i][j] + " ");
                }
                System.out.println();
            }

            input.close();
        }

    }}






