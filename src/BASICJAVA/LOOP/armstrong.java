package BASICJAVA.LOOP;

import java.util.Scanner;

public class armstrong {
    public static void main(String[] args) {
        // Armstrong Number
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Your Number : ");
        int numberTwo= sc.nextInt();

        int temp1=numberTwo; // copy of numberTwo
        int count=0;
        while (temp1>0){ // this loop will be counting the number of digits
            count++;
            temp1=temp1/10;
        }
        System.out.println("Your Number of digits present are : "+count);

        int temp2=numberTwo;
        int arm =0;
        while (temp2>0){

            arm=arm+(int)Math.pow(temp2%10,count);
            temp2=temp2/10;
        }

        System.out.println("After operation the answer is : "+arm);

        if (arm==numberTwo){
            System.out.println("Armstrong number");
        }
        else {
            System.out.println("Not an armstrong number");
        }


    }

}

