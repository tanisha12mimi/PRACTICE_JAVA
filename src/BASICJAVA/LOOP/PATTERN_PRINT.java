package BASICJAVA.LOOP;

import java.util.Scanner;

public class PATTERN_PRINT {

    //  i=row
//    j=coloum
// outer loop (I) will travares rows
//   inner loop (j) will travares coloum
//   inner loop print line is always System.out.(print)
//    not System.out.println()


//
    public static void main(String[] args) {
//     pattern1
//        * * * *
        int num = 3;
        for (int i = 0; i <= num; i++) {
//
            System.out.println("* ");
        }

//pattern 2
//         * * * *
//         * * * *
//         * * * *
//         * * * *


//        outer loop

//        int n = 5;
//        for (int i = 1; i <= n; i++) {
//            for (int j = 1; j <= n; j++) {
//                System.out.print("* ");
//            }
//            System.out.println();

//    *
//    * *
//    * * *
//    * * * *

        Scanner SC = new Scanner(System.in);
        System.out.println("enter a number");
        int num2 = SC.nextInt();

//            outerloop
//        for (int i = 1; i <= num2; i++) {
//            for (int j = 1; j <= i; j++) {
//                System.out.print("* ");
//            }
//            System.out.println();





//             *
//           * * *
//         * * * * *
//        * * * * * * *

//        for (int i = 1; i<= num2; i++) {
//            for(int j=1;j<=i*1;j++) {
//                System.out.print("M ");
//            }
//            System.out.println();
//        }

/*   1
    2 2
    3 3 3
    4 4 4 4
    5 5 5 5 5
 */
        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++)
            {
                System.out.print(i);
            }
            System.out.println();
        }


    }
}