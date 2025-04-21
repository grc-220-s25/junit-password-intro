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

    @Test
    void testContainsTriple() {
        // Arrange
        String password = "paaassword";
        // Act
        boolean actual = PasswordUtils.containsTriple(password);
        // Assert
        assertEquals(true, actual);
    }

    @Test
    void testNotContainsTriple() {
        // Arrange
        String password = "password";
        // Act
        boolean actual = PasswordUtils.containsTriple(password);
        // Assert
        assertEquals(false, actual);
    }

    @Test
    void testCountSpecialCharacters() {
        // Arrange
        String password = "p@$$w!%rd";
        // Act
        int actual = PasswordUtils.countSpecialCharacters(password);
        // Assert
        assertEquals(5, actual);
    }

    @Test
    void testCountNoSpecialCharacters() {
        // Arrange
        String password = "password123";
        // Act
        int actual = PasswordUtils.countSpecialCharacters(password);
        // Assert
        assertEquals(0, actual);
    }
}
