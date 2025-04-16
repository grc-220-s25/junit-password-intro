import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PasswordUtilsTest {
    @Test
    void testDescribePasswordLengthShortPassword() {
        // arrange 
        String password = "hey";
        // act
        String acutal = PasswordUtils.describePasswordLength(password);

        // assert
        assertEquals("short", acutal);
    }
    @Test
    void testDescribePasswordExactly12Chars() {
        // arrange
        String password = "helloSDEV220";
        // act
        String actual = PasswordUtils.describePasswordLength(password);
        // assert
        assertEquals("long", actual);
    }
    @Test
    void testDescribePasswordLengthMedium() {
        // arrange
        String password = "helloSDEV";
        // act
        String actual = PasswordUtils.describePasswordLength(password);
        // assert
        assertEquals("medium", actual);
    }
}
