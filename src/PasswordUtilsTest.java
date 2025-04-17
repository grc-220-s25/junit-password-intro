import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PasswordUtilsTest {
    @Test
    void testDescribePasswordLengthShortPassword() {
        //Arrange
        String password = "hey";

        //Act
        String actual = PasswordUtils.describePasswordLength(password);

        //Assert: the result SHOULD be 'short'. Compare it to actual result.
        assertEquals("short", actual);
    }

    @Test
    void testDescribePasswordLengthExactly12chars(){
        //Arrange
        String password = "helloSDEV220";

        //Act
        String actual = PasswordUtils.describePasswordLength(password);

        //Assert
        assertEquals("long", actual);
    }

    @Test
    void testDescribePasswordLengthMedium(){
        //Arrange
        String password = "helloSDEV";

        //Act
        String actual = PasswordUtils.describePasswordLength(password);

        //Assert
        assertEquals("medium", actual);
    }

    @Test
    void testIsAlphanumericWithoutNonAlphanumeric(){
        String password = "validPassword";

        boolean actual = PasswordUtils.isAlphanumeric(password);

        assertEquals(true, actual);
    }

    @Test
    void testIsAlphanumericWithNonAlphanumeric(){
        String password = "valid&Password";

        boolean actual = PasswordUtils.isAlphanumeric(password);

        assertEquals(false, actual);
    }
}
