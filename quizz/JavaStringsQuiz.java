public class JavaStringsQuiz
{
    public static void main(String[] args)
    {
        StringBuffer sb=new StringBuffer("01234");
        sb.append(1.1).append('A').append(22).append(false).append("null");
        System.out.println(sb);
    }
}
//output:-012341.1A22falsenull