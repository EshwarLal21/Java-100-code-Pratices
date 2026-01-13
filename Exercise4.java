public class Exercise4 {

    // Function to check if a number is even or odd
    public static String checkEvenOrOdd(int number) {
        // TODO: Implement this function
        if(number%2==0) {
            return "Even";
            
        }
        
        return "Odd";
    }

    // Function to return the result of even/odd check
    public static String getResult(int number) {
        // TODO: Implement this function
        
        return checkEvenOrOdd(number);
    }
}
