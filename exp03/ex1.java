package exp03;
import java.util.Scanner;


public class ex1 {




        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);


            System.out.print("تعداد سطرهای ماتریس اول را وارد کنید: ");
            int r1 = input.nextInt();
            System.out.print("تعداد ستون‌های ماتریس اول را وارد کنید: ");
            int c1 = input.nextInt();

            System.out.print("تعداد سطرهای ماتریس دوم را وارد کنید: ");
            int r2 = input.nextInt();
            System.out.print("تعداد ستون‌های ماتریس دوم را وارد کنید: ");
            int c2 = input.nextInt();


            int[][] A = new int[r1][c1];
            int[][] B = new int[r2][c2];
            int[][] C = new int[r1][c2];


  System.out.println("مقدار درایه های ماتریس اول را وارد کنید:");
  for (int i = 0; i < r1; i++) {
      for (int j = 0; j < c1; j++) {
                    A[i][j] = input.nextInt();
                }
            }


  System.out.println("مقدار درایه های ماتریس دوم را وارد کنید:");
  for (int i = 0; i < r2; i++) {
      for (int j = 0; j < c2; j++) {
                    B[i][j] = input.nextInt();
                }
            }


  for (int i = 0; i < r1; i++) {
      for (int j = 0; j < c2; j++) {
                    C[i][j] = 0;
                    for (int k = 0; k < c1; k++) {
                        C[i][j] += A[i][k] * B[k][j];
                    }
                }
            }


  System.out.println("حاضل ضرب ماتریس های وارد شذه : ");
  for (int i = 0; i < r1; i++) {
                for (int j = 0; j < c2; j++) {
                    System.out.print(C[i][j] + "    ");
                }
                System.out.println();
            }

            input.close();
        }
    }






















