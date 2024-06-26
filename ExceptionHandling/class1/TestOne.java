class Test{
 
    public static void main(String[] args) {
        System.out.println(10/2); //5
        try{
            System.out.println(10/0); //AE
        }
        catch(ArithmeticException ae){
            System.out.println(ae);
            System.out.println(ae.toString());
            System.out.println(ae.getMessage());
            ae.printStackTrace();
            System.out.println(10/1);
        }
        
        System.out.println(10/5);
    }
}