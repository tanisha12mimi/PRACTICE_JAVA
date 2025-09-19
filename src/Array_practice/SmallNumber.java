package Array_practice;

import java.util.Scanner;

public class SmallNumber {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a number");
            int size = sc.nextInt();
//        array element input
            int [] a= new int [size];
            System.out.println("Enter Array elemrnts");
            for(int i=0;i<size;i++){
                a[i]=sc.nextInt();
            }
            int min=a[0];
            for(int i=0;i<size;i++){
                if(min>a[i]){
                    min=a[i];
                }
            }
            System.out.println("MInium number in arrayb is "+ min);
        }
    }


