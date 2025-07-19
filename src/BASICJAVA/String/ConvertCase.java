package BASICJAVA.String;

public class ConvertCase {
    public static void main(String[] args) {
// 1)	Program To Convert Given String Into LowerCase Without Using Built-In-method

        String S ="TANISHA";
        for (int i =0;i<S.length();i++){
            System.out.print((char)(S.charAt(i)+32));
        }

//uppercase
        System.out.println("______________________");




        String a="tanisha";
        for(int i=0;i<a.length();i++){
            System.out.print((char)(a.charAt(i)-32));
        }









    }
}
