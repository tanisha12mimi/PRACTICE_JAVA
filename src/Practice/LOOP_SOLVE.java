package Practice;

import java.util.Scanner;

public class LOOP_SOLVE {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//         1 palindrome number

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
//
//        //2 PRIME NUMBER
//
//        System.out.println("enter a number");
//        int num2 = sc.nextInt();
//
//
//        int count = 0;
//        for (int i = 1; i <= num2; i++) {
//            if (num2 % i == 0) {
//                System.out.println("factor is " + i);
//                count = count + 1;
//            }
//        }
//
//        System.out.println("Your factor count is " + count);
//
//        if (count == 2) {
//            System.out.println("Prime number");
//        } else {
//            System.out.println("Composite number");
//        }
        //3 perfect square


        //4 neon number
        //5 sunny number
        //6 strong number

        //7 LCM OF 2 value

        int n1 = 10, n2 = 16;
        int lcm = n1 > n2 ? n1 : n2;
        while (true) {
            if (lcm % n1 == 0 && lcm % n2 == 0) {
                System.out.println(lcm);
                break;
            }
            lcm++;


            //8 FACTORIAL
//            int count1 = 0;
//            for (int i = 1; i <= num2; i++) {
//                if (num2 % i == 0) {
//                    System.out.println("factor is " + i);
//                    count = count + 1;
//                }
//            }
//
//            System.out.println("Your factor count is " + count);
            //8 PERFECT NUMBER
            //9 SPY NUMBER
        }


    }
}
