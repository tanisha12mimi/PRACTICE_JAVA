package Array_practice;

import java.util.Scanner;

public class DivisibleBy5{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array Size");
        int size =sc.nextInt();
//        Array elements  input

        int arr[]=new int[size];
        System.out.println("Enter Array elements");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }

//        check the numberbis divsible by 5 or not
        System.out.println("DIVISIBLE BY 5 NUMBERS ARE : ");
        for(int i=0;i<size;i++){
            if (arr[i]%5==0) {
                System.out.print(arr[i]+" ");
            }
//             else if (arr[i]%5!=0) {
//                System.out.println("ITS not divisible by 5x"+[]);
//
//            }

        }

    }
}
