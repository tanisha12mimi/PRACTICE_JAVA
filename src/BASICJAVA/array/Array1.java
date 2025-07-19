package BASICJAVA.array;

import java.util.Arrays;
import java.util.Scanner;

public class Array1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number of array element");
        int a = sc.nextInt();

        int[] arr = new int[a];
        sc.nextInt();
        System.out.println("enter" + a + "integer");
        for (int i = 0; i < a; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(arr.length);


        System.out.println("  ");
//sorting an array with array sort


        int arr1[] ={50,80,90,10};
        Arrays.sort(arr1);
        for(int num : arr1){
            System.out.print(num + " ");
        }

    }
}
