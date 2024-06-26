class Test{
   
    public static void main(String[] args) {
     Thread t=new Thread();
     t.setPriority(11); //IllegalArgumentException
    }
    //Thread priority 1-10
}