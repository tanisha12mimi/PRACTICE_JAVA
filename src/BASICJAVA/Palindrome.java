package BASICJAVA;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {

        Scanner sc =new Scanner(System.in);

        System.out.println("Enter your number : ");
        int number2 = sc.nextInt();

        int temp = number2;


        int reverse1 = 0;

        while (number2 > 0) {
            reverse1 = (reverse1 * 10) + (number2 % 10);
            number2 = number2 / 10;
        }

        System.out.println(reverse1);
        System.out.println(number2);

        if (temp == reverse1) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }

}
