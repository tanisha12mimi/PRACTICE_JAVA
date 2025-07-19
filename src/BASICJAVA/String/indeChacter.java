package BASICJAVA.String;

public class indeChacter {
    public static void main(String[] args) {

//        4)	Program To Count Number Of Spaces In Given String
        String s = "Mayukh jit ";

        int t = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                t++;
            }
        }
        System.out.println("Nmuber of space" +" "+t);

//        5)	Program To Convert Even Index Character To UpperCase
                String m= "tanisha";
                for(int i=0;i<m.length();i++) {
                    if ((i % 2 == 0)&&(m.charAt(i)!=0)&&(s.charAt(i)>='a'&&(s.charAt(i)<='z'))){

                        System.out.println((char)s.charAt(i)-32);
                    }

                }



//8)	Program To  Remove Space From String Using Built-In -Method?

            
















    }
}







