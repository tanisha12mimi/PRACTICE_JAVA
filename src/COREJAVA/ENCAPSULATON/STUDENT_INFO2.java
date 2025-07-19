package COREJAVA.ENCAPSULATON;

class student1{
    private String name;
    private int studentId;
    static int StudentIdCount=1;


    public student1() {
        this.studentId = StudentIdCount;
        StudentIdCount++;

    }


    public void setName(String name) {
        if (name.equals("")) {
            System.out.println("invald name");
        } else {
            this.name = name;
        }
    }

    public String getname(){
        return(this.name);
   }

   public int getStudentId(){
        return studentId;
   }

}


public class STUDENT_INFO2 {
    public static void main(String[] args) {
        student1 obj1 =new student1();
        obj1.setName("tani");

        System.out.println(obj1.getname());
        System.out.println(obj1.getStudentId());
    }
}
