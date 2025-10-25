import java.io.File;
import java.util.Scanner;



public class Main {

    static int[][] table = new int[9][9];

    public static void main(String[] args) throws Exception {


        loadFromFile("sudoku");


        print();


        Scanner in = new Scanner(System.in);
        while (true) {
            System.out.print("> ");
            String line = in.nextLine().trim();


            if (line.startsWith("set")) {
                System.out.print("Enter row: ");
                int r = in.nextInt() - 1;
                System.out.print("Enter col: ");
                int c = in.nextInt() - 1;
                System.out.print("Enter value: ");
                int v = in.nextInt();
                in.nextLine();

                if (r < 0 || r > 8 || c < 0 || c > 8) {
                    System.out.println("عدد سطر و ستون باید بین 1 تا 9 باشد.");
                    continue;
                }
                if (v < 1 || v > 9) {
                    System.out.println("مقدار باید بین 1 تا 9 باشد.");
                    continue;
                }

                int old = table[r][c];
                table[r][c] = 0;

                if (!canPlace(table, r, c, v)) {
                    System.out.println(" در سطر، ستون یا باکس 3×3 تکرار دارد.");
                    table[r][c] = old;
                } else {
                    table[r][c] = v;
                    print();
                    if (isComplete()) {
                        System.out.println(" تبریک جدول کامل شد. ");
                        break;
                    }
                }
            }


            else if (line.startsWith("clear")) {
                System.out.print("Enter row: ");
                int r = in.nextInt() - 1;
                System.out.print("Enter col: ");
                int c = in.nextInt() - 1;
                in.nextLine();

                if (r < 0 || r > 8 || c < 0 || c > 8) {
                    System.out.println("عدد سطر و ستون باید بین 1 تا 9 باشد.");
                    continue;
                }

                table[r][c] = 0;
                print();
            }


            else if (line.equals("print")) {
                print();
            }


            else if (line.equals("exit") || line.equals("quit")) {
                System.out.println("finish");
                break;
            }

            else {
                System.out.println("دستور اشتباه. از set | clear | print | exit استفاده کن.");
            }
        }

        in.close();
    }


    static boolean canPlace(int[][] g, int r, int c, int v) {
        // بررسی سطر
        for (int j = 0; j < 9; j++)
            if (g[r][j] == v) return false;


        for (int i = 0; i < 9; i++)
            if (g[i][c] == v) return false;


        int r0 = (r / 3) * 3, c0 = (c / 3) * 3;
        for (int i = r0; i < r0 + 3; i++)
            for (int j = c0; j < c0 + 3; j++)
                if (g[i][j] == v) return false;

        return true;
    }


    static boolean isComplete() {
        for (int i = 0; i < 9; i++)
            for (int j = 0; j < 9; j++)
                if (table[i][j] == 0) return false;
        return true;
    }


    static void loadFromFile(String filename) throws Exception {
        Scanner sc = new Scanner(new File(filename));
        for (int i = 0; i < 9; i++) {
            String line = sc.nextLine();
            String[] parts = line.split(",");
            for (int j = 0; j < 9; j++) {
                String t = parts[j].trim();
                if (t.equals(".") || t.equals("0") || t.equals(""))
                    table[i][j] = 0;
                else
                    table[i][j] = Integer.parseInt(t);
            }
        }
        sc.close();
    }

    static void print() {
        for (int r = 0; r < 9; r++) {
            for (int c = 0; c < 9; c++) {
                System.out.print(table[r][c] == 0 ? ". " : table[r][c] + " ");
            }
            System.out.println();
        }
        System.out.println("دستورات: set | clear | print | exit");
    }
}
