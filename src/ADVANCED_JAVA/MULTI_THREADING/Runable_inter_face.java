package ADVANCED_JAVA.MULTI_THREADING;

class Test implements Runnable{
    public void run(){
        System.out.println("Print 1 to 5...");
        for(int i=0;i<=5;i++){
            System.out.println(i);
        }
    }
}
public class Runable_inter_face {
    public static void main(String[] args) {
       Thread t= new Thread(new Test());
       t.start();

    }

}
