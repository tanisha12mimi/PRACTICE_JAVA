package BASICJAVA.BASIC;

public class DRIVE {
    public static void main(String[] args) {


//    REFERRENCE VARIABLE
        System.out.println("____________");
        Student var1= new Student();
        System.out.println(var1);
        var1.firstname="Tanisha";
        var1.lastName="Parvin";
        var1.email="tani12@gmail.com";
        var1.rollNo=12;
        var1.mobileNo=9804071;
        var1.universityName="SVU";


        //2ND STUDENT

        Student VAR2 = new Student();
        VAR2.firstname="SOHIN";
        VAR2.lastName="MUKHERJEE";
        VAR2.rollNo=12;
        VAR2.mobileNo=8961579;
        VAR2.email="sohin11@gmail.com";
        VAR2.universityName="RERF";


        var1.showfullName();
        System.out.println(var1.showfullName());
        System.out.println("____________________");
        VAR2.showContactDetails();
        System.out.println("____________________");





















    }

}
