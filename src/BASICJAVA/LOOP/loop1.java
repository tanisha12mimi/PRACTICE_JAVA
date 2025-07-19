package BASICJAVA.LOOP;

import java.util.Scanner;

public class loop1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        Print sum of the 1st 10 natural Numbers
//
//        System.out.println("enter a number ");
//        int range = sc.nextInt();
//
//        int result = (range*(range+1))/2;
//        System.out.println("your sum of the numbers  is" +result);
//
//        // Sum of odd numbers which available in the range of 20-50
//        // 21,23,25... so on
//        // sum= 21+23+25+.....+49


        // Fibonacci Series
        // 0 1 1 2 3 5 8 13 .......


        // Fibonacci Series
        // 0 1 1 2 3 5 8 13 .......


        System.out.println("Enter your Range or position : ");
        int position=sc.nextInt();

        int first =0;
        int second=1;


        for(int i=3;i<=position;i++){
            int third =first+second;
            System.out.println(third);
             first=second;
             second=third;

        }









    }
}
