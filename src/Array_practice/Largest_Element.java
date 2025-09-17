package Array_practice;

import java.util.Scanner;

public class Largest_Element {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter   Array elements ");
        int size= sc.nextInt();

        //array elememts input
        int[ ] a= new int[size];
        System.out.println("ENTER ARRAY ELEMEMTS");

        for(int i=0;i<size;i++){
            a[i]=sc.nextInt();
        }
        int max=a[0];
        for(int i=0;i<size;i++){
            if(max<a[i]){
                max=a[i];
            }
        }
        System.out.println("maximum or lagest elememts in array  is "+max );




    }
}
