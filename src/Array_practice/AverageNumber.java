package Array_practice;

import java.util.Scanner;

public class AverageNumber {
    public static void main(String[] args) {
        Scanner cs = new  Scanner(System.in);
        System.out.println("Enter Array size");
        int arrSize = cs.nextInt();

//        Taking array elements input
        int arr[]= new int[arrSize];
        System.out.println("ENTER ARRAY ELEMENTS :- ");
        for(int i=0;i<arrSize;i++){
           arr[i]=cs.nextInt();

        }

        //CODE OF AVERAGE NUMBER

        int sum=0;
        for(int i=0;i<arrSize;i++){
            sum=sum+arr[i];

        }
        System.out.println("Average of all the Array elements are :-  "+sum);


    }
}
