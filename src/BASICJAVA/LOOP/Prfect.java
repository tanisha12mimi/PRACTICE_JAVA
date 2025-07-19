package BASICJAVA.LOOP;

import java.util.Scanner;

public class Prfect {
    public static void main(String[] args) {
      // Perfect Number
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Your Number : ");
        int numberOne= sc.nextInt();

        int sumOfFactors=0;

        for (int i=1; i<numberOne ;i++){
            if (numberOne % i ==0){
                sumOfFactors=sumOfFactors+i;
            }
        }
        System.out.println("Sum of the factors is : "+sumOfFactors);

        if (sumOfFactors == numberOne) {
            System.out.println("Perfect Number");
        }
        else {
            System.out.println("Not a Perfect Number");
        }

    }
}
