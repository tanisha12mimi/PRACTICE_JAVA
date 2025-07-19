package COREJAVA.Ploymarphism;

 class teacher{
     public  void teaching(){
      System.out.println("TEACHER");
  }
}
 class Student1 extends teacher{
     public void teaching(){
         System.out.println("STUDENT1");
     }
 }
 class Student2 extends teacher{
     public void teaching(){
         System.out.println("student2");
     }
 }

public class runTime {
    public static void main(String[] args) {

//        default object
        teacher obj1 = new teacher();
        obj1.teaching();

        System.out.println("-----------------");
//        polymrphism

        teacher obj2 =new Student1();
        obj2.teaching();

        teacher obj3=new Student2();
        obj3.teaching();

    }

}
