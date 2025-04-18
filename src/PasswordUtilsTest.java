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
    @Test
    void checkingForAlphanumeric() {
        // arrange
        String password = "helloSDEV220";
        // act
        boolean actual = PasswordUtils.isAlphanumeric(password);
        // assert
        assertEquals(true, actual);
    }
    @Test
    void checkingForNumbers() {
        // arrange
        String password = "12345678";
        // act
        boolean actual = PasswordUtils.isAlphanumeric(password);
        // assert
        assertEquals(true, actual);
    }
    @Test
    void checkingIfHasSpecialChar() {
        // arrange
        String password = "123456$ 2";
        // act
        boolean actual = PasswordUtils.isAlphanumeric(password);
        // assert
        assertEquals(false, actual);
    }
    @Test
    void checkingForAnySpecialCharAtLastIndex() {
        // arrange
        String password = "12345678$";
        // act
        boolean actual = PasswordUtils.isAlphanumeric(password);
        // assert
        assertEquals(false, actual);
    
    }
    @Test
    void checkingForRepeats() {
        // arrange
        String password = "aaa";
        // act
        boolean actual = PasswordUtils.containsTriple(password);
        // assert
        assertEquals(true, actual);
    }
    @Test
    void checkingForNonRepeats() {
        // arrange
        String password = "abc";
        // act
        boolean actual = PasswordUtils.containsTriple(password);
        // assert
        assertEquals(false, actual);
    }
    @Test
    void checkingRepeatsNotInRow() {
        // arrange
        String password = "abacad";
        // act
        boolean actual = PasswordUtils.containsTriple(password);
        // assert
        assertEquals(false,actual);
    }
    @Test
    void checkingForSpacesInRow() {
        // arrange
        String password = "a   abc";
        // act
        boolean actual = PasswordUtils.containsTriple(password);
        // assert
        assertEquals(true,actual);
    }
}