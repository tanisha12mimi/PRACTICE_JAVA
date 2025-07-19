package COREJAVA.ABtraction;

abstract class laptop{
    int price =10;
    String title =" Laptop";


    abstract double description();//abstract method
    public void showtitle(){
        System.out.println(title);
    }
}

class macbook extends laptop {
    public double description() {
        return price * 10.0;
    }

}
class linux extends laptop{
    public double description() {
        return price * 20.0;
    }
}


public class Abtraction {
    public static void userchoice(laptop obj){
        System.out.println(obj.description());
    }
    public static void main(String[] args) {
          laptop obj2 = new macbook();
        System.out.println(obj2.description());
        System.out.println("------------");

        linux obj3=new linux();
        userchoice(obj3);

    }
}

