package COREJAVA.STATIC;

public class DEMO1 {

//    DATA MEMBER
    static String staticName;
    int a;
    int b;
    String s;

    //static methode
    public static void staticmethod(){
        System.out.println(staticName);
        System.out.println("this is static method");

    }


    public static void main(String[] args) {
//static methode or var|
//        we don't need to create an object'
        DEMO1.staticName="THIS IS VAULE";
        DEMO1.staticmethod();

        //

    }


}
