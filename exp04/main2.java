package exp04;
import java.util.Scanner;

public class main2 {

        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            System.out.print("یک رشته وارد کنید: ");
            String text = input.nextLine();

            String rev = "";


            for (int i = text.length() - 1; i >= 0; i--) {
                rev += text.charAt(i);
            }

            System.out.println("رشته‌ی معکوس شده : " + rev);

            input.close();
        }
    }