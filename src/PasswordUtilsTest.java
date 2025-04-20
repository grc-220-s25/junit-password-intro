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

    //Doing a test for the method isAlphanumeric

    @Test
    void testIsAlphanumeric() {
        //Arrange
        String password = "helloSDEV220";

        //Act
        boolean actual = PasswordUtils.isAlphanumeric(password);

        //Assert
        assertTrue(actual);
    }

    @Test
    void testIsAlphanumericSpecialChar() {
        //Arrange
        String password = "@sdev220";

        //Act
        boolean actual = PasswordUtils.isAlphanumeric(password);

        //Assert
        assertFalse(actual);
    }

    @Test
    void testIsAlphanumericEmpty() {
        //Arrange
        String password = "";

        //Act
        boolean actual = PasswordUtils.isAlphanumeric(password);

        //Assert
        assertFalse(actual);
    }

    //Doing a test for the method containsTriple
    @Test
    void testContainsTriple() {
        //Arrange
        String password = "helloooSDEV220";

        //Act
        boolean actual = PasswordUtils.containsTriple(password);

        //Assert
        assertTrue(actual);
    }
    
    @Test
    void testContainsTripleShort() {
        //Arrange
        String password = "hel";

        //Act
        boolean actual = PasswordUtils.containsTriple(password);

        //Assert
        assertFalse(actual);
    }

    @Test
    void testContainsTripleEmpty() {
        //Arrange
        String password = "";

        //Act
        boolean actual = PasswordUtils.containsTriple(password);

        //Assert
        assertFalse(actual);
    }

    //Doing a test for the method countSpecialCharacters

    @Test
    void testCountSpecialCharacters() {
        //Arrange
        String password = "helloSD#EV220@";

        //Act
        int actual = PasswordUtils.countSpecialCharacters(password);

        //Assert
        assertEquals(2, actual);
    }

    //Doig a test for the method hasSufficientSpecialCharacters

    @Test
    void testHasSufficientSpecialCharacters() {
        //Arrange
        String password = "helloSD#EV220@";
        int minimum = 1;

        //Act
        boolean actual = PasswordUtils.hasSufficientSpecialCharacters(password, minimum);

        //Assert
        assertTrue(actual);
    }

    @Test
    void testHasSufficientSpecialCharactersOne() {
        //Arrange
        String password = "helloSDEV220";
        int minimum = 1;

        //Act
        boolean actual = PasswordUtils.hasSufficientSpecialCharacters(password, minimum);

        //Assert
        assertFalse(actual);
    }
    
}
