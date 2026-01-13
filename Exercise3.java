public class Exercise3 {

    // Function to swap two numbers using arithmetic operations
    public static int[] swapUsingArithmetic(int a, int b) {
        // TODO: Implement this function
        a = a + b;
        b = a- b;
        a = a - b;
        
        return new int[] {a,b};
    }

    // Function to swap two numbers using bitwise XOR
    public static int[] swapUsingXOR(int a, int b) {
        // TODO: Implement this function
         a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        
        return new int[] {a,b};
    }
}
