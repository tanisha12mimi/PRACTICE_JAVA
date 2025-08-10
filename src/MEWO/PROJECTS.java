package MEWO;


//Design a class as described.
//
//class: Addition
//function: function name : add, parameters : a(int), b(int), return type: int
//access specifier: public, static: yes
//task: returns the sum of the values given in the parameter.
class Addition{
    public static int name(int a , int b){

      return a+b;
    }

}

public class PROJECTS {
    public static void main(String[]args){
        System.out.println("sum of a+ b is  : "+ Addition.name(5,5));


    }
}
