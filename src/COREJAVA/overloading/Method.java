package COREJAVA.overloading;

public class Method {
    // Creating -----> multiple methods with same method name but with different signatures
//    this is also a static method


    public void study(){
        System.out.println("this is a methode ");

    }
    public String study(String fname , String lname ){
//        System.out.println("this method  is for name");
        return fname+" "+lname;
    }

    public int study(int roll){
//        System.out.println("this method is for roll no");
        return roll;

    }
//    satic method
    public static long study(long phno){
//        System.out.println("this method is for phno");

        return phno;
    }
    public static String study(String email){
//        System.out.println("this method is for email");
        return email;
    }
}

