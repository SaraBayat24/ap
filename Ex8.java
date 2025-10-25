import java.util.Scanner;

public class Ex8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a word: ");
        String word = in.next();

        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            System.out.println(ch);
        }

        in.close();
    }
}
