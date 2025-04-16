import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PasswordUtilsTest {
    @Test
    void testDescribePasswordLengthShortPassword() {
        // Arrange
        String password = "hey"; 
        // Act
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
        assetEquals("long", actual);

    }

    @Test
    void testDescribePasswordLengthMedium() {
        //Arrange
        String password = "helloSDEV";
        //Act
        String actual = PasswordUtils.describePasswordLength(password);
        //Assert
        assetEquals("medium", actual);

    }
    

}
