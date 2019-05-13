import java.util.StringTokenizer;

public class Split {
    public static void main(String a[]){
    String s = "012ab567";

    String delims = "ab ";

    StringTokenizer st = new StringTokenizer(s, delims);
            //System.out.println("No of Token = " + st.countTokens());

             while (st.hasMoreTokens())
             {
                 System.out.println(st.nextToken());
             }

     }

}