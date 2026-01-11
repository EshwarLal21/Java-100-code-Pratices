public class Exercise {

    // Function to find the ASCII value of a given character
    public static int findAsciiValue(char character) {
        return (int) character;
    }

    // Function to return the ASCII value of a character
    public static int getAsciiValue(char character) {
        return character; // implicit casting works too
    }

    public static void main (String args[]) {
        char character = 'b';
        System.out.println("ASCII value of " + character + " is: " + findAsciiValue(character));
        System.out.println("ASCII value of " + character + " is: " + getAsciiValue(character));
    }
 

}
