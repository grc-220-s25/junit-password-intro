import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import javax.swing.Action;

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
        //Assert
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
    void testIsAlphanumericFalse() {
        // Arrange
        String password = "$#@!";
        // Act
        boolean actual = PasswordUtils.isAlphanumeric(password);
        // Assert
        assertEquals(false, actual);
    }

    @Test
    void testIsAlphanumericTrue() {
        // Arrange
        String password = "hello123";
        // Act
        boolean actual = PasswordUtils.isAlphanumeric(password);
        // Assert
        assertEquals(true, actual);
    }
}
