public class Exercise6 {

    // Function to check if a character is a vowel
    public static boolean isVowel(char ch) {
        ch = Character.toLowerCase(ch); // handle uppercase letters

        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }

    // Function to determine if a character is a vowel, consonant, or not an alphabet
    public static String checkVowelOrConsonant(char ch) {

        if (!Character.isLetter(ch)) {
            return "Not an alphabet";
        }

        if (isVowel(ch)) {
            return "Vowel";
        } else {
            return "Consonant";
        }
    }
}
