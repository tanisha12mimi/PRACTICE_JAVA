package BASICJAVA;

import java.util.Scanner;

public class Factorial_Number {
    public static void main(String[] args) {
//        factorial number

        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int num = sc.nextInt();

        int factorial = 1;


        for (int i = 1; i <= num; i++) {
            factorial = factorial * i;
        }
        System.out.println(factorial);


        // (4)Find the 1st digit of a number
        // 23546 -> output(2)
        // 945 -> output(9)

        System.out.println("enter a number");
        int num1 = sc.nextInt();

        int count=0;
        while (num1>0){
            count++;
            num1=num1/10;
        }
        System.out.println(count);


    }

}