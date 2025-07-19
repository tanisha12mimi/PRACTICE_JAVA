package BASICJAVA.BASIC;


public class Student {

    String firstname;
    String lastName;
    String email;
    long mobileNo;
    int rollNo;
    String universityName;


// function

    public void showDetail() {
        System.out.println(firstname);
        System.out.println(lastName);
        System.out.println(email);
        System.out.println(mobileNo);
        System.out.println(rollNo);
        System.out.println(universityName);
    }

    public String showfullName() {
        return firstname+lastName;
    }



   public void showContactDetails(){
       System.out.println(mobileNo);
       System.out.println(email);
   }



}