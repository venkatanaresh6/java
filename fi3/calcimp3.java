package fi3;

import java.util.function.Predicate;

public class calcimp3 {
    public static void main(String[] args) {
        Predicate<Integer> p=num->num%2==0;
        System.out.println(p.test(31));
    }
}
