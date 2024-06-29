import java.util.*;

public class HashSetExample {
    public static void main(String[] args) {

        HashSet hs1 = new HashSet();
        Set hs2 = new HashSet();
        Set<Integer> eids = new HashSet<Integer>();

        eids.add(101);
        eids.add(102);
        eids.add(101);
        eids.add(103);
        eids.add(102);
        eids.add(104);
        eids.add(101);
        eids.add(102);
        eids.add(104);

        System.out.println("hs1: " + hs1);
        System.out.println("hs2: " + hs2);
        System.out.println("eids: " + eids);
    }
}
