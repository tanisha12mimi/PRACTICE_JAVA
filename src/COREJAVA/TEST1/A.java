package COREJAVA.TEST1;

public class A {
    //    DATA MEMBER
    public int var1 = 10;
    int var2 = 20;// dafault
    protected int var3 = 30;
    private int var4 = 40;


    public static void main(String[] args) {
            A obj1=new A();
        System.out.println(obj1.var1);//public accessible    everywhere
        System.out.println(obj1.var2);// default accessible in same class and same package
        System.out.println(obj1.var3);// protected accessible Accessible in same package, and in subclasses (even if different package).
        System.out.println(obj1.var4);//private accessible in only same class



    }

}
