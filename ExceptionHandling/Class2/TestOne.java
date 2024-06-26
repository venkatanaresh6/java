import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class TestOne {
    public static void main(String[] args) {
        try{
            PrintWriter pw=new PrintWriter("data.text");
            pw.append('Y');
        }
        catch(FileNotFoundException fnf){
            System.out.println(fnf.getMessage());
        }
    }
}
