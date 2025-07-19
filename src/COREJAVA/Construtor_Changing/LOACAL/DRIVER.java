package COREJAVA.Construtor_Changing.LOACAL;

class A{
    public A(){
        System.out.println("this is A ");
    }

    public A(String S){
        this();
        System.out.println("this is A  with string");
    }
    public A(int a){
        this("hi");

        System.out.println("this is A  with int");
    }

}

public class DRIVER {
    public static void main(String[] args) {
        A OBJ1=new A(45);



    }
}
