import java.util.Arrays;

public class FirstNonRepeatedCharacter {
    public static void main(String[] args) {
       String s = "iinntthhushaik";
       char[] chars = s.toCharArray();
       Arrays.sort(chars);
       String sorted = String.valueOf(chars);
       char ch = 0;
       for (int i = 0; i < sorted.length(); i++) {
           if (i == 0) {
              if (sorted.charAt(i) != sorted.charAt(i + 1)) {
                 ch = sorted.charAt(i);
              }
           } else {
                  if (i == sorted.length() - 1) {
                     if (sorted.charAt(i) != sorted.charAt(i - 1)) {
                        ch = sorted.charAt(i);
                     }
                  } else {
                        if (sorted.charAt(i) != sorted.charAt(i + 1)
                              && sorted.charAt(i) != sorted.charAt(i - 1)) {
                           ch = sorted.charAt(i);
                        }
                  }
           }
       }
       System.out.println("First non repeated character in String \"" + s +"\" :" + ch);
    }

}