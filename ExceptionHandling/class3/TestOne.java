class NullPointerExceptionOne extends Exception{
    NullPointerExceptionOne(String message){
        super();
        this.msg=message;
    }
}

public class TestOne {
    public static void main(String[] args) {
        try {
                throw new NullPointerExceptionOne("GM");
        } 
        catch(NullPointerExceptionOne neone){
            System.out.println(neone.getMessage());
        }
        catch (NullPointerException  ne) {
            System.out.println(ne.getMessage());
        }
       
    }
}
