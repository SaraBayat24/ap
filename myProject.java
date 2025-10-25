import java.util.Scanner;

public class myProject {
    public static void main(String[] args) {



        Scanner input = new Scanner(System.in);


        System.out.println("Enter three strings: ");
        String s1 = input.next();
        String s2 = input.next();
        String s3 = input.next();

        String temp;

        if (s1.compareTo(s2) > 0) {
            temp = s1;
            s1 = s2;
            s2 = temp;
        }

        if (s2.compareTo(s3) > 0) {
            temp = s2;
            s2 = s3;
            s3 = temp;
        }

        if (s1.compareTo(s2) > 0) {
            temp = s1;
            s1 = s2;
            s2 = temp;
        }

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

        input.close();





        }}