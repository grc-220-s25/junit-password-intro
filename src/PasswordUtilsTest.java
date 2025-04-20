import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PasswordUtilsTest {
    @Test
    void testDescribePasswordLengthShortPassword() {
        // Arrange
        String password = "hey";
        // Act
        String actual = PasswordUtils.describePasswordLength(password);
        // Assert
        assertEquals("short", actual);

    }

    @Test
    void testDescribePasswordLengthExactly12Chars() {
        // Arrange
        String password = "helloSDEV220";
        // Act
        String actual = PasswordUtils.describePasswordLength(password);
        // Assert
        assertEquals("long", actual);

    }

    @Test
    void testDescribePasswordLengthMedium() {
        // Arrange
        String password = "helloSDEV";
        // Act
        String actual = PasswordUtils.describePasswordLength(password);
        // Assert
        assertEquals("medium", actual);

    }

    // test for 2nd problem
    @Test
    void testIsAlphaNumeric() {
        // Arrange
        String password = "hey123";
        // Act
        boolean actual = PasswordUtils.isAlphanumeric(password);
        // Assert
        assertEquals(true, actual);
    }

    @Test
    void testIsAlphaNumericOnlyAlpha() {
        // Arrange
        String password = "heyMan";
        // Act
        boolean actual = PasswordUtils.isAlphanumeric(password);
        // Assert
        assertEquals(true, actual);
    }

    @Test
    void testIsAlphaNumericOnlyNumbers() {
        // Arrange
        String password = "123456789";
        // Act
        boolean actual = PasswordUtils.isAlphanumeric(password);
        // Assert
        assertEquals(true, actual);
    }

    @Test
    void testIsAlphaNumericWithSpecialChar() {
        // Arrange
        String password = "!heyBeautiful123!";
        // Act
        boolean actual = PasswordUtils.isAlphanumeric(password);
        // Assert
        assertEquals(false, actual);
    }

    // test for third problem
    @Test
    void containsTripleKkk() {
        // Arrange
        String password = "KkK0573abc";
        // Act
        boolean actual = PasswordUtils.containsTriple(password);
        // Assert
        assertEquals(false, actual);
    }

    @Test
    void containsTriple$$$() {
        // Arrange
        String password = "123$$$$$456";
        // Act
        boolean actual = PasswordUtils.containsTriple(password);
        // Assert
        assertEquals(true, actual);
    }

    @Test
    void containsTripleSameLetter() {
        // Arrange
        String password = "KKKKKK!!!";
        // Act
        boolean actual = PasswordUtils.containsTriple(password);
        // Assert
        assertEquals(true, actual);
    }

    @Test
    void containsTriple() {
        // Arrange
        String password = "aabbccddeeff";
        // Act
        boolean actual = PasswordUtils.containsTriple(password);
        // Assert
        assertEquals(false, actual);
    }

    // test for fourth problrm
    @Test
    void countSpecialCharactersOne() {
        // Arrange
        String password = "abc!def$";
        // Act
        int actual = PasswordUtils.countSpecialCharacters(password);
        // Assert
        assertEquals(2, actual);
    }

    @Test
    void countSpecialCharactersTwo() {
        // Arrange
        String password = "!!hey%hi*lol##";
        // Act
        int actual = PasswordUtils.countSpecialCharacters(password);
        // Assert
        assertEquals(6, actual);
    }

    @Test
    void countSpecialCharactersThree() {
        // Arrange
        String password = "<no!dollar@!?>";
        // Act
        int actual = PasswordUtils.countSpecialCharacters(password);
        // Assert
        assertEquals(6, actual);
    }

}
