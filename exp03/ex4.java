package exp03;


import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("تعداد سطرهای ماتریس را وارد کنید (m): ");
        int m = input.nextInt();
        System.out.print("تعداد ستون‌های ماتریس را وارد کنید (n): ");
        int n = input.nextInt();

        int[][] matrix = new int[m][n];
        int[][] transpos = new int[n][m];




        System.out.println("مقدار درایه های ماتریس را وارد کنید:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("درایه [" + i + "][" + j + "]: ");
                matrix[i][j] = input.nextInt();
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                transpos[j][i] = matrix[i][j];
            }
        }














    }
}