package java8;

import java.util.function.Function;

public class calcimp3{
    public static void main(String[] args){
        Function<Integer,Integer>ci=num->num*num;
        System.out.println(ci.apply(10));
    }
}