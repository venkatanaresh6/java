public class TestThree {
  public static void m1(){
    m2();
  }
  public static void m2(){
    m3();
  }
  public static void m3(){
    System.out.println(10/2); //5
    try{
        System.out.println(10/0); //AE
    }
    catch(ArithmeticException ae){
        //ae.printStackTrace();
        //System.out.println(ae);
        //System.out.println(ae.toString());
        //System.out.println(ae.getMessage());
        System.out.println(10/1);
    }
   
    System.out.println(10/5);//2
  }
  public static void main(String[] args) {
    m1();
  }
}
