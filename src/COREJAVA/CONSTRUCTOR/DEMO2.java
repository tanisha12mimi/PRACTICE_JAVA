package COREJAVA.CONSTRUCTOR;

public class DEMO2 {
    String name ;
    int roll;
    long phnnumber;
    String dept;

    //constructor
//constrctor name and clas name should be same
    public DEMO2(){
        System.out.println("default constructor");
    }

    //parameterrized construtor
    //public Demo2(int a,String s, long b,String p){
//        roll=a;
//        name=s;
//        phoneNumber=b;
//        department=p;
////    }
//


    public DEMO2(int roll,String name ,long phnnumber, String dept){

        this.roll=roll;
        this.name=name;
        this.phnnumber=phnnumber;
        this.dept=dept;

      //THIS PARAMETERIREZED

    }

//    copy construtor
    public DEMO2(Demo3 obj){
        this.roll= obj.studentRoll;
        this.name= obj.fullName;
        this.phnnumber= obj.phoneNumber;
        this.dept= obj.department;
    }




    public void showDetails(){
        System.out.println(name+" "+roll+" "+phnnumber+" "+dept);

    }


}






