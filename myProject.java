// Write a program that reads a floating-point number and prints “zero” if the number
//is zero. Otherwise, print “positive” or “negative”. Add “small” if the absolute value
//of the number is less than 1, or “large” if it exceeds 1,000,000.


import java.util.Scanner;

public class myProject {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter floating-point number : ");
        double x = input.nextDouble();

        if (x == 0){
            System.out.print("the number you entered is zero ");
        }
          else if (x > 0){
            System.out.print("the number you entered is positive ");}

            else {
                System.out.print("the number you entered is negative ");
              }

        if ( x < 1){
            System.out.print("  small ");
        }


        if(x < 0){ x = x * -1;}


        if (x > 1000000){
            System.out.print("larg ");
        }

input.close();

          }
    }


