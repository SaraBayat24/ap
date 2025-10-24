import java.util.Scanner;

public class helloWorld{

    public static void main(String[] args) {
        System.out.println("Hello World");


        Scanner sc = new Scanner(System.in, "UTF-8");

        System.out.print("اسم را وارد کنید: ");
        String firstName = sc.nextLine().trim();

        System.out.print("فامیلی را وارد کنید: ");
        String lastName = sc.nextLine().trim();

        System.out.println("نام کامل: " + firstName + " " + lastName);

        sc.close();
    }
}
