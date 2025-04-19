import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PasswordUtilsTest {
    //describePasswordLength tests
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
        //Arrange
        String password = "helloSDEV220";
        //Act
        String actual = PasswordUtils.describePasswordLength(password);
        //assert
        assertEquals("long", actual);
    }
    @Test
    void testDescribePasswordLengthMedium(){
        //Arrange
        String password = "helloSDEV";
        //Act
        String actual = PasswordUtils.describePasswordLength(password);
        //assert
        assertEquals("medium", actual);
    }

    //isAlphanumeric tests
    @Test
    void isAlphanumericTrue(){
        //Arrange
        String password = "validPasswords";

        //Act
        boolean actual = PasswordUtils.isAlphanumeric(password);

        //Assert
        assertEquals(true, actual);
    }
    @Test
    void isAlphanumericFalse(){
        //Arrange
        String password = "hellos$1223$";

         //Act
        boolean actual = PasswordUtils.isAlphanumeric(password);

         //Assert
        assertEquals(false, actual);

    }

    //containsTriple tests
    @Test
    void containsTripleCheckFalse(){
        String password = "ahahhahaha";

        boolean actual = PasswordUtils.containsTriple(password);

        assertEquals(false, actual);
    }

    @Test
    void containsTripleCheckTrue(){
        String password = "paaasword";

        boolean actual = PasswordUtils.containsTriple(password);

        assertEquals(true, actual);
    }
    
    @Test 
    void containsTwo(){
        String password = "DD";

        boolean acutal = PasswordUtils.containsTriple(password);

        assertEquals(false, acutal);
    }

    //countSpecialCharacters tests
    @Test
    void containsNoSpecial(){
        String password = "heresmypassword12345";

        int actual = PasswordUtils.countSpecialCharacters(password);

        assertEquals(0, actual);
    }
    @Test
    void containsSpecial(){
        String password = "!@##$$%^^&&*())*^";
        int actual = PasswordUtils.countSpecialCharacters(password);
        assertEquals(18, actual);
    }
    @Test
    void containsHalfSpecialandNoSpecial(){
        String password = "s&s&s&s&s&s&s&s&s&s&";
        int actual = PasswordUtils.countSpecialCharacters(password);
        assertEquals(10, actual);
    }

}
