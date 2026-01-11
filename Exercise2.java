public class Exercise2 {

    // Function to compute the quotient of two integers
    public static int computeQuotient(int dividend, int divisor) {
        // TODO: Implement this function
        
        if(divisor == 0) {
            
            return 0;
            
        }
        
        return dividend / divisor;
    }

    // Function to compute the remainder of two integers
    public static int computeRemindar(int dividend, int divisor) {
        // TODO: Implement this function
        
        
        if(divisor == 0) {
            
            return 0;
        }
        
        return dividend % divisor;

    }

    // Function to return both quotient and remainder as an array
    public static int[] getQuotientAndRemainder(int dividend, int divisor) {
        
        
        int quotient = computeQuotient( dividend, divisor);
        int remainder = computeRemindar( dividend, divisor);
        
        
        
        return new int[] {quotient,remainder};
    }
}
