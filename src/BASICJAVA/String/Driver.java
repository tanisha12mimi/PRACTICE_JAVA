package BASICJAVA.String;

public class Driver {
//    1)	Program To Convert Given String Into LowerCase Without Using Built-In-method

        public static void main(String[] args) {
            String s="RENUKA";
            for(int i=0;i<s.length();i++) {
                System.out.print((char)(s.charAt(i)+32));
            }
        }
    }


