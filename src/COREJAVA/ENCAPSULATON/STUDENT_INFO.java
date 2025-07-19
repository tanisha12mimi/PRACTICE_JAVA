package COREJAVA.ENCAPSULATON;

 class Student{
     private String name;
     private int Studentid;
     static  int StudentIdCount =1;

//     constructor
     public Student(){
         this.Studentid=StudentIdCount;
         StudentIdCount++;

     }
     public void setName(String N) {
         if (N.equals("")) {
             System.out.println("enter invaild name");
         } else {
             this.name = N;
         }
     }
         public String getname(){
           return (this.name);
         }

     public int getStudentid() {
         return Studentid;
     }
 }


public class STUDENT_INFO {
    public static void main(String[] args) {
        Student OBJ1 =new Student();
        OBJ1.setName("tani");


        System.out.println(OBJ1.getStudentid());
        System.out.println(OBJ1.getname());

    }
}
