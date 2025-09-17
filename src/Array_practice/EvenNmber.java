package Array_practice;

import java.util.Scanner;

public class EvenNmber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter aq number");
        int size = sc.nextInt();

        int[] a= new int[size];
        System.out.println("enter array Elements");
                for(int i=0;i<size;i++){
                    a[i]= sc.nextInt();

                }
                for(int i=0;i<size;i++){
                    if(a[i]%2==0){
                        System.out.println("even elements are  "+a[i]);
                    }

                }
    }
}