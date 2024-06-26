
public class TestSix {
    public static void main(String[] args) {
        try{
            new Thread().setPriority(11);
        }
        
        catch(Exception ie){
            System.out.println(ie.getMessage());
        }
        catch(ArithmeticException ae){
            System.out.println(ae.getMessage());
        }
    }
}
