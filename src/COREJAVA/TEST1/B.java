package COREJAVA.TEST1;

public class B extends A {
    public static void main(String[] args) {
        A obj1= new A();

        System.out.println(obj1.var1);// its public
        System.out.println(obj1.var2);// default accessible in same class and same package
        System.out.println(obj1.var3);//in  same package, and in subclasses (even if different package).
//        is not accessible because its private


    }
}
