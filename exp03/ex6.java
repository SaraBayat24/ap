package exp03;



import java.util.Scanner;

public class ex6 {
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
                matrix[i][j] = input.nextInt();}}



        int maxSum = Integer.MIN_VALUE;
        int maxRow = 0, maxCol = 0;




        for (int i = 0; i < rows - 1; i++) {
            for (int j = 0; j < cols - 1; j++) {
                int sum = matrix[i][j] + matrix[i][j + 1] +
                        matrix[i + 1][j] + matrix[i + 1][j + 1];

                if (sum > maxSum) {
                    maxSum = sum;
                    maxRow = i;
                    maxCol = j;
                }

                System.out.println("ماتریس 2x2 با بیشترین مجموع:");
                System.out.println(matrix[maxRow][maxCol] + " " + matrix[maxRow][maxCol + 1]);
                System.out.println(matrix[maxRow + 1][maxCol] + " " + matrix[maxRow + 1][maxCol + 1]);

                System.out.println("مجموع درایه ها: " + maxSum);

                input.close();

    }}}}