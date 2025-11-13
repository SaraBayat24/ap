package exp04;
import java.util.Scanner;
public class main {

    public class CountCharacter {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            System.out.print("یک رشته وارد کنید: ");
            String text = input.nextLine();

            System.out.print("کاراکتری که شمارش میشود را وارد کنید: ");
            char ch = input.next().charAt(0);

            int count = 0;


            for (int i = 0; i < text.length(); i++) {
                if (text.charAt(i) == ch) {
                    count++;
                }
            }

            System.out.println("کاراکتر '" + ch + "' تعداد " + count + " بار تکرار شده است.");

            input.close();
            }
        }
    }