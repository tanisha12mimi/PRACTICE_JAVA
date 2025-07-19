package COREJAVA.Practice;

class A{
    public void  student(){
        System.out.println("default");

    }

    public String student(String f , String l){
        return f+" "+l;

    }
     public int student( int roll){
        return roll;

     }
//     COREJAVA.ACCESS_SPICEFIER.STATIC
     public  static long  student(long phno){
         return phno;
     }
     public static String student(String email){
        return email;
     }
}


public class Methode {
    public static void main(String[] args) {
        A OBJ1 =new A();
        String VAR1 =OBJ1.student("TANI","SHA");
        System.out.println(VAR1);

        int VAR2 = OBJ1.student(12);
        System.out.println(VAR2);
//       COREJAVA.ACCESS_SPICEFIER.STATIC
        System.out.println(A.student(45698756L));
        System.out.println(A.student("tani@gmail.com"));

    }
}
