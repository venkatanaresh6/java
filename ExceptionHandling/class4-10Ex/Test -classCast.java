class Test{
   
    public static void main(String[] args)  {
       /*  String ename ="Rahul";
        Object obj = (Object)ename;
        System.out.println(obj); */
        //Parent can hold child object.
        Object obj= new Object();
        String str=(String)obj; //.ClassCastException
    }
}