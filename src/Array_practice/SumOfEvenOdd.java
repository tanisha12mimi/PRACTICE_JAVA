package Array_practice;

import java.util.Scanner;

public class SumOfEvenOdd {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Array size");// array size input
        int arrSize= sc.nextInt();

        int arr[] = new int[arrSize];
        System.out.println("Enter a Array elemnts :-");
        for(int i=0;i<arrSize;i++) {
            arr[i] = sc.nextInt();
        }
        int sumOfEven=0;
        int sumOfOdd=0;

        for(int i=0;i<arrSize;i++) {
            if (arr[i] % 2 == 0) {


                sumOfEven = sumOfEven + arr[i];

            } else if (arr[i] % 2 != 0) {

                sumOfOdd = sumOfOdd + arr[i];

            } else {
                System.out.println("Inavalid input");
            }

        }
            System.out.println("Sum of Even elements are :-  " + sumOfEven);
            System.out.println("Sum of Odd elemstns are :- "+ sumOfOdd);




    }
}
