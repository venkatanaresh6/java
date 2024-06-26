class Test{
    public static void m1(){
        m2();
    }
    public static void m2(){
        m3();
    }
    public static void m3(){
        m1();//StackOverflowError
    }
    public static void main(String[] args) {
        m1();
    }
}