package COREJAVA.Construtor_Changing.GLOBAL;

class A{
    public A(){
        System.out.println("1(a)");
    }
    public A(String S){
        System.out.println("1(B)");

    }
}
class B extends A{
    public B() {

        System.out.println("2(a)");
    }
    public B(int a){
        super("e");
        System.out.println("2(B)");
    }

}
class C extends B{
    public C(){

        System.out.println("3 a");
    }
        public C(String S){
            super(7);
            System.out.println("3(B)");
        }

        }
public class Global {
    public static void main(String[] args) {
        C OBJ1= new C ("HI");
    }




}
