class index {
   public static void main(String[] args)
    {
        String str = "inthu shaik!";
        System.out.println("The given string is = " + str);
        // Get the character at positions 0 and 10.
        int index1 = str.charAt(3);
        int index2 = str.charAt(9);

        // Print out the results.
        System.out.println("The character at position 0 is " +
            (char)index1);
        System.out.println("The character at position 10 is " +
            (char)index2);
    }
}
