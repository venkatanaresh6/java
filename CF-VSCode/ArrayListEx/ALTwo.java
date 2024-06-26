import java.util.*;
public class ALTwo {
    public static void main(String[] args) {
        
        ArrayList al =new ArrayList(); //allowed heterogenous
        ArrayList<String> enames=new ArrayList<String>(); //allowed String objects
        al.add(1);
        al.add(1.1);
        al.add('c');
        al.add("Rahul");
        System.out.println(al);
    }
}
