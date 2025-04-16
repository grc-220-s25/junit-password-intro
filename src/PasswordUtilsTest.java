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
    void testDescribePasswordLengthExactly12Chars(){
       // Arange 
        String password = "helloSDEV220";
        //Act
        String actual = PasswordUtils.describePasswordLength(password);
        //Assert
        assertEquals("long", actual);
    }

    @Test
    void testDescribePasswordLengthMedium(){
       // Arange 
        String password = "helloSDEV";
        //Act
        String actual = PasswordUtils.describePasswordLength(password);
        //Assert
        assertEquals("medium", actual);
    }

}
