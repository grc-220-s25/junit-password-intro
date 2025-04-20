import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PasswordUtilsTest {
    @Test
    void testDescribePasswordLengthShortPassword() {
        
        //Arrange, means setting up the initial state of the test
        String password = "hey";

        //Act, means executing the code under test

        //inside the PasswordUtils class, we have a static method called describePasswordLength
        //actual is a local variable that holds the result of the describePasswordLength method
        String actual = PasswordUtils.describePasswordLength(password); // This will call the static method describePasswordLength

        //Assert, means checking if the expected outcome matches the actual outcome
        assertEquals("short", actual); // This will check if the actual result matches the expected result, here it should be "short"

    }
    // Add more test cases for other password lengths here... we need to put @Test above each test method
    @Test
    void testDescribePasswordLengthMediumPassword12Chars() {
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
        String password = "helloSDEV";

        //Act
        String actual = PasswordUtils.describePasswordLength(password);

        //Assert
        assertEquals("medium", actual);

    }
}
