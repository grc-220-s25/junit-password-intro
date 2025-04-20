/**
 * Utility class for analyzing passwords.
 */
public class PasswordUtils {

    public static void main(String[] args) {
        // String result = describePasswordLength("hey");
        // System.out.println(result);

        // result = describePasswordLength("h ey$");
        // System.out.println(result);

        // result = describePasswordLength("HEY123!!!");
        // System.out.println(result);

        // result = describePasswordLength("helloSDEV220");
        // System.out.println(result);
    }

    /**
     * Returns a description of the password's length.
     *
     * @param password the password to analyze
     * @return "short" if the password has fewer than 6 characters,
     *         "medium" if it has between 6 and 11 characters (inclusive),
     *         or "long" if it has 12 or more characters
     */
    public static String describePasswordLength(String password) {
        int length = password.length();
        if (length < 6) {
            return "short";
        } else if (length < 12) {
            return "medium";
        }
        return "long";
    }

    /**
     * Checks whether the password contains only letters and digits.
     *
     * @param password the password to check
     * @return true if the password is alphanumeric, false otherwise
     */
    public static boolean isAlphanumeric(String password) {
        for (int i = 0; i < password.length(); i++) {
            char c = password.charAt(i);
            if (!Character.isLetterOrDigit(c)) {
                return false;
            }
        }
        return true;
    }

    /**
     * Checks whether a password has a character that is repeated at least three
     * times in a row.
     * 
     * For example, "paaasword" has the letter 'a' three times in a row.
     * 
     * @param password the password to check
     * @return true if password has a character repeated three times in a row, false
     *         otherwise
     */
    public static boolean containsTriple(String password) {
        // TODO: Make tests FIRST, then implement the method
        // Please have your tests in a separate commit from the implementation
        for (int i = 0; i < password.length() - 2; i++) {
            char pass = password.charAt(i);
            if (pass == password.charAt(i + 1) && pass == password.charAt(i + 2)) {
                return true;
            }
        }
        return false;
    }

    /**
     * Returns the number of special characters in the password.
     * 
     * A special character is any non-alphanumeric (not letter or digit) character.
     * 
     * 
     * @param password the password to check
     * @return the count of special characters
     */
    public static int countSpecialCharacters(String password) {
        // TODO: Make tests FIRST, then implement the method
        // Please have your tests in a separate commit from the implementation
        int count = 0;
        for (int i = 0; i < password.length(); i++) {
            char c = password.charAt(i);
            if (!Character.isLetterOrDigit(c)) {
                count++;
            }
        }
        return count;
    }

    /**
     * Checks whether a password has at least a minimum number of special
     * characters.
     * 
     * A special character is any non-alphanumeric (not letter or digit) character.
     * 
     * @param password the password to check
     * @param minimum  the minimum number of special characters (inclusive)
     * @return true has the minimum number of special charcters or more, false
     *         otherwise
     */
    public static boolean hasSufficientSpecialCharacters(String password, int minimum) {
        // TODO: Make tests FIRST, then implement the method
        // Please have your tests in a separate commit from the implementation
        // Required: please use countSpecialCharacters as a helper method.
        // Don't just copy/paste the logic!
        int specialCount = countSpecialCharacters(password);

        return specialCount >= minimum;
    }
}