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
    void testDescribePasswordLengthExatcly12Chars(){
        //Arrange
        String password = "hellosdev220";
        //Act
        String actual = PasswordUtils.describePasswordLength(password);
        //Assert
        assertEquals("long", actual);
    }
    @Test
    void testDescribePasswordLengthMedium(){
        //Arrange
        String password = "hellosdev";
        //Act
        String actual = PasswordUtils.describePasswordLength(password);
        //Assert
        assertEquals("medium", actual);
    }
}
