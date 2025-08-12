package Array_practice;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
//      1)	Program To Find Even Element In Given Array?

//         Array size input
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER array size");
        int size = sc.nextInt();
        //                Array element input
        int arr[]= new int[size];
        System.out.println("enter a array elements");
        for(int i=0 ;i<size;i++){
            arr[i]= sc.nextInt();
        }
//       find integer is   EVEN or odd
        System.out.println("even elements are :-____");





        for(int i=0;i<size;i++){
            if(arr[i]%2==0){
                System.out.println(arr[i]);

            }

        }


          System.out.println("ODD ELEMENTS ARE :-___");
          for(int j=0;j<size;j++){
              if(arr[j]%2!=0){
                  System.out.println(arr[j]);

              }
          }

      }


    }

