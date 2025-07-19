package COREJAVA.TEST2;

import COREJAVA.TEST1.A;

public class D extends A {
    public static void main(String[] args) {
        A obj1 = new A();
        System.out.println(obj1.var1);// only public is accesible
//        System.out.println(obj1.var2);// default accessible in same class and same package
//        System.out.println(obj1.var3);// protected accessible Accessible in same package, and in subclasses (even if different package).
//        System.out.println(obj1.var4);




        D Obj2 = new D(); // object od subclass

        System.out.println(Obj2.var1);
        System.out.println(Obj2.var3);// protected subclass in different package














    }
}