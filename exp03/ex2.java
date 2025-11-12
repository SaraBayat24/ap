package exp03;
import java.util.Scanner;


public class ex2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[][] matrix = new int[2][2];

        System.out.println("مقدار درایه های ماتریس 2x2 را وارد کنید:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {

                matrix[i][j] = input.nextInt();
            }
        }

        int det = (matrix[0][0] * matrix[1][1]) - (matrix[0][1] * matrix[1][0]);

        System.out.println("دترمینان ماتریس: " + det);

        input.close();
    }

}
