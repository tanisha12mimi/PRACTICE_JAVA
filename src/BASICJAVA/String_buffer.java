package BASICJAVA;

public class String_buffer {
    public static void main(String[] args) {
        StringBuffer sb1 = new StringBuffer(" I JAVA");

        System.out.println(sb1.insert(2,"like"));// insert it

        System.out.println(sb1);
//        String s1= sb1.toString();// in tostrng
//        System.out.println(sb1.deleteCharAt(0));
//        System.out.println(sb1);
//        System.out.println(sb1.delete(0,6));
        System.out.println(sb1);
        System.out.println(sb1.replace(2,6," love"));//replace like to love
        System.out.println(sb1);

    }
}