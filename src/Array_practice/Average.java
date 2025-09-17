package Array_practice;

import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array Size");
        int size = sc.nextInt();

        int [] a= new int [size];
        System.out.println("Enter Array Elements");
        for(int i=0;i<size;i++){
            a[i]= sc.nextInt();
        }

        int sum =0;
        for(int i=0;i<size;i++){
            sum +=a[i];

        }
        System.out.println("average"+ sum/size);
    }
}
