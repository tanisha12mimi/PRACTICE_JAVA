package BASICJAVA.array;

import java.util.Arrays;
import java.util.Scanner;

public class Array2 {
    public static void main(String[] args) {
//        Given an array of Strings arr[]. Use For-Each loop to print each string in the array in a new line.

       String arr[] = { "Hello", "World", "Geeks", "For", "Geeks" };
        for( String i: arr){
            System.out.println(i);
        }
//        ✅code
//You are given an array arr[] that contains integers. You need to print the elements of the array with in reverse order with a in a single line with space between them.
//Note: Don't print a new line at the end.


//        Output: "5 1 2 43 54 "

       int arr1[] = {54, 43, 2, 1, 5};
        for(int i=arr1.length-1;i>=0;i-- ){
            System.out.print(arr1[i]+" ");
        }
//         ✅code
        System.out.println("_____________");

//        You are given an array arr[] that contains integers. You need to decrement each element of the array by 1 and return the array.

//        Input: arr[] = [54, 43, 2, 1, 5]
//        Output: 53 42 1 0 4


//        Given an array arr[], check whether it is sorted in non-decreasing order. Return true if it is sorted otherwise false.
//        Input: arr[] = [10, 20, 30, 40, 50]
//        Output: true

//
//        int arr3[] ={10, 20, 30, 40, 50};
//         for(int i=0;i<=arr3.length;i++){
//           if(arr3[0]< arr3[i+1]){
//               System.out.println("true");
//           }
//           else{
//               System.out.println("false");
//           }
//         }

//        Given an array arr[]. The task is to find the largest element and return it.
//        Input: arr[] = [1, 8, 7, 56, 90]
//        Output: 90

        int [] arr3={34,67,90,2,3,76,5};

        // Easy Method

        Arrays.sort(arr3); // 2,3,34,67,76,90


        System.out.println("Max element is : "+arr3[arr3.length-1]);



//        You are given an array that contains integers. You need to return the sum of all array elements.

//        Input: arr[] = [54, 43, 2, 1, 6]
//        Output: 106
//


        int arr4[]={54, 43, 2, 1, 6};
        int result=0;

        for(int i=0;i<=arr4.length-1;i++){
           result= result+arr4[i];
        }
        System.out.println(result);

//        You are given an array arr[] that contains integers. You need to return average of the non negative integers in double format.
//
//        Examples:
//
//        Input: arr[] = [-12, 8, -7, 6, 12, -9, 14]
//        Output: 10.0
//        Explanation: The positive numbers are 8 6 12 14. The sum is 8+6+12+14 = 40, Average = 40/4 = 10.0


        int arr5[]={8,6,12,14};

        double result1=0;

        for(int i=0;i<=arr5.length-1;i++){
            result1= result1+arr5[i];
        }
        System.out.println("Sum of all no:  "+ result1);

        double average =result1/arr5.length;

        System.out.println("Average :" + average);







    }
}
