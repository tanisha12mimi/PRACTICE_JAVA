package COREJAVA.overloading;

public class Drive {
    public static void main(String[] args) {
//      for  non-static
//        we need to create an object
        Method M1= new Method();
        M1.study();
        System.out.println("_______________");
//       NON-STATIC
        String var=M1.study("TANISHA","PARVIN");
        System.out.println(var);

        int VAR2 = M1.study(12);
        System.out.println(VAR2);

//        SATIC

        System.out.println(Method.study("tanisha55@gmail.com"));


        System.out.println(Method.study(4568962445666L));
        System.out.println("_______________");
        System.out.println("_______________");

//CONSTRUTOR OVERLOADING


        Constructor C1=new Constructor("tanisha",12,4569756l,"BCA");
        C1.info();















    }
}
