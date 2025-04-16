 import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PasswordUtilsTest {

    @Test
    void testDescribePasswordLengthShortPassword() {
        //Arrange
        String password = "hey";

        //Act
        String actual = PasswordUtils.describePasswordLength(password);

        //Assert - expectations vs actual
        assertEquals("short", actual);
    }

    @Test
    void testDescribePasswordLengthExactly12Chars() {
        //Arrange
        String password = "hellosdev220";

        //Act
        String actual = PasswordUtils.describePasswordLength(password);

        //Assert
        assertEquals("long", actual);
    }

    @Test
    void testDescribePasswordLengthMedium() {
        //Arrange
        String password = "hellosdev";

        //Act
        String actual = PasswordUtils.describePasswordLength(password);

        //Assert
        assertEquals("medium", actual);
}

    @Test //Checks if method returns false if password is nonnumerical
    void isAlphanumeric() {
        //Arrange
        String password = "$#&!";
        //Act
        boolean actual = PasswordUtils.isAlphanumeric(password);
        //Assert
        assertEquals(false,actual);

    }
    @Test //checks if method returns true if password is numerical
    void isAlphanumericTrue() {
        //Arrange
        String password = "Hello 123";
        //Act
        boolean actual = PasswordUtils.isAlphanumeric(password);
        //Assert
        assertEquals(true,actual);

    }
}
