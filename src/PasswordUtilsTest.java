import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PasswordUtilsTest {
    @Test
    void testDescribePasswordLengthShortPassword() {

        // Arrange
        String password = "hey";


        // Act
        String actual = PasswordUtils.describePasswordLength(password);

        // We dont have to manually add print method, junit will do it for us under Assert part
        //System.out.println(actual);


        // Assert
        // comparing 2 variables for the test, where one is expect, and one is actual one
        assertEquals("short", actual);

    }

    @Test
    void testDescribePasswordLengthExactly12chars(){

        // Arrange
        String password = "hellosdev220";

        // Act
        String actual = PasswordUtils.describePasswordLength(password);

        // Assert
        assertEquals("long", actual);
    }


    @Test
    void testDescribePasswordLengthMedium(){

        // Arrange
        String password = "helloSDEV";

        // Act
        String actual = PasswordUtils.describePasswordLength(password);

        // Assert
        assertEquals("medium", actual);
    }




    
}
