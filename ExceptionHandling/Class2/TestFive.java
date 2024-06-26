public class TestFive {
    public static void main(String[] args) {
        try{
            int[] eids={101,102,103};  //AIOBE
            System.out.println(eids[0]); //101
            String ename="Rahul";
            System.out.println(ename.length());
            System.out.println(10/0);
            Thread t=new Thread();
            t.setPriority(100);
        }
        catch(ArrayIndexOutOfBoundsException aiob){
            System.out.println(aiob.getMessage());
        }
        catch(ArithmeticException ae){
            //ae.printStackTrace();
            System.out.println(ae.getMessage());
        }
        catch(NullPointerException ne){
            System.out.println(ne.getMessage());
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
