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

}
