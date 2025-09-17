package BASICJAVA.LOOP;

import java.util.Scanner;

public class GFG_patterns {
    public static void main(String[] args) {

////        basic pattern
//        /*
//
//         * * * *
//         * * * *
//         * * * *
//         * * * *
//         * * * *
//
//
//
//         */
//        /*
//
//        Print the pattren below:-
//         *
//         * *
//         * * *
//         * * * *
//         */
//
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter a number");
//        int num = sc.nextInt();
//
//        for (int i = 0; i < num; i++) {
//            // coloum
//
//            for (int j = 0; j < i; j++) {//
//
//                // row
//                System.out.print("* ");
//            }
//            System.out.println(" ");
//        }
//
//
///*  print the pattern given below :
//
//             1
//             2 2
//             3 3 3
//             4 4 4 4
//             5 5 5 5 5
//
//             */
//
//        System.out.println("enter a number");
//        int num3 = sc.nextInt();
//
//        for (int i = 1; i < num3; i++) {
//            for (int j = 1; j <= i; j++) {
//                System.out.print(i+" ");
//            }
//            System.out.println();
//        }
// /*  print the pattern given below :
//
//             1
//             1 2
//             1 2 3
//             1 2 3 4
//             1 2 3 4 5
//
//      */
//        System.out.println("enter a number");
//        int row = sc.nextInt();
//
//        for (int i = 1; i < row; i++) {
//            for (int j = 1; j <= i; j++) {
//                System.out.print(j+" ");
//            }
//            System.out.println();
//        }
// /*  print the pattern given below :
//
//             1
//             0 0
//             1 1 1
//             0 0 0 0
//
//             */
//        System.out.println("enter a number");
//        int row1 = sc.nextInt();
//
//        for (int i = 1; i < row1; i++) {
//            for (int j = 1; j <= i; j++) {
//                if (i % 2 == 0) {
//                    System.out.print("0");
//                } else {
//                    System.out.print(1);
//                }
//            }
//            System.out.println();
//        }
///*  print the pattern given below :
//
//        1
//        1 0
//        1 0 1
//        1 0 1 0
//        1 0 1 0 1
//
//                */
//
//
//        System.out.println("enter a number");
//        int row2 = sc.nextInt();
//
//        for (int i = 1; i < row2; i++) {
//            for (int j = 1; j <= i; j++) {
//                if (j % 2 == 0) {
//                    System.out.print(0 + " ");
//                } else {
//                    System.out.print(1 + " ");
//                }
//            }
//            System.out.println();
//        }
//
//
//
//
//
//
//
//         /*  print the pattern given below :
//
//
//             5 4 3 2 1
//             5 4 3 2
//             5 4 3
//             5 4
//             5
//
//             */
//
//
//        System.out.println("enter a number");
//        int row4 = sc.nextInt();
//        int count=0;
//
//        for (int i = 1; i <= row4; i++)
//        {
//            for (int j = row4; j >= i; j--)
//            {
//                count=count+1;
//
//                System.out.print(j+" ");
//            }
//            System.out.println();





         /*
                         1
                         2 3
                         4 5 6
                         7 8 9 10
                        (Floyd's Triangle)

            */


        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int row5 = sc.nextInt();
        int count = 0;

        for (int i = 1; i <= row5; i++) {
            for (int j = 1; j <= i; j++) {
                count = count + 1;
                System.out.print(count + " ");
            }
            System.out.println();
        }







        /*
         * * * * *
         * * * *
         * * *
         * *
         *
         */






        }
    }


