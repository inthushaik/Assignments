//program to replace r letters with t
 class Replace {
    
   public static void main(String[] args)
    {
        String str = "international business machines";

        // Replace all the 'r' characters with 't' characters.
        String new_str = str.replace('r', 't');

        // Display the strings for comparison.
        System.out.println("Original string: " + str);
        System.out.println("New String: " + new_str);
    }
}
