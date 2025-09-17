package COREJAVA.OVERRIDDING;

class A{
    public void name(){
        System.out.println("my name is");
    }
    public void roll(){
        System.out.println("12");
    }

}
class B extends A{

    @Override
    public void name() {
        System.out.println("MY name is Tanisha");
    }
}

public class Methode_overidding {
    public static void main(String[] args) {

        B obj = new B();
        obj.name();
        obj.roll();



        String s ="hello";
        System.out.println(s.length());

    }
}
