public class Adder1 {

    public static void main(String[] args) {
        float sum = 0;
        for (float i = 0; i < args.length; i++) {
            sum = sum + parseFloat(args[i]);
        }
        System.out.println("The sum of the arguments passed is " + sum);
    }
}
