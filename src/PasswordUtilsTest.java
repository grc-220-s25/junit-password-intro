import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PasswordUtilsTest {
    @Test
    void testDescribePasswordLengthShortPassword() {
        //Arrange
        String password = "hey";
        //Act
        String actual = PasswordUtils.describePasswordLength(password);
        //Assert
        assertEquals("short", actual);
    }
    @Test
    void testDescribePasswordLengthExactly12Chars() {
        //Arrange
        String password = "helloSDEV220";
        //Act
        String actual = PasswordUtils.describePasswordLength(password);
        //Assert
        assertEquals("long", actual);
    }
    @Test
    void testDescribePasswordLengthMedium() {
        //Arrange
        String password = "helloSDEV220";
        //Act
        String actual = PasswordUtils.describePasswordLength(password);
        //Assert
        assertEquals("medium", actual);
    }
    @Test
    void checkIfAllNumeric() {
        //Arrange
        String password = "1234567890";
        //Act
        Boolean actual = PasswordUtils.isAlphanumeric(password);
        //Assert
        assertEquals(false, actual);
        }
            @Test
    void checkIfAllChars() {
        //Arrange
        String password = "abcdefghijk";
        //Act
        Boolean actual = PasswordUtils.isAlphanumeric(password);
        //Assert
        assertEquals(false, actual);
        }
        @Test
        void checkIfHasSpecialChars() {
            //Arrange
            String password = "123456$ 2";
            //Act
            Boolean actual = PasswordUtils.isAlphanumeric(password);
            //Assert
            assertEquals(false, actual);
            }        
    }
