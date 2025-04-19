import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PasswordUtilsTest {
    //Unit-tests for describePasswordLength method
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
    //Unit-tests for isAlphanumeric method
    @Test
    void checkIfAllNumeric() {
        //Arrange
        String password = "1234567890";
        //Act
        Boolean actual = PasswordUtils.isAlphanumeric(password);
        //Assert
        assertEquals(true, actual);
        }
    @Test
    void checkIfAllLetterChars() {
        //Arrange
        String password = "abcdefghijk";
        //Act
        Boolean actual = PasswordUtils.isAlphanumeric(password);
        //Assert
        assertEquals(true, actual);
        }
        @Test
        void checkIfIsAlphanumeric() {
            //Arrange
        String password = "123456$";
            //Act
        Boolean actual = PasswordUtils.isAlphanumeric(password);
            //Assert
        assertEquals(false, actual);
        }
        @Test
        void isNull() {
            //Arrange
        String password = "";
            //Act
        Boolean actual = PasswordUtils.isAlphanumeric(password);
            //Assert
        assertEquals(false, actual);
        }
        //Unit-tests for containsTripple method
        @Test
        void containsTripple() {
            //Arrange
        String password = "aaa";
            //Act
        Boolean actual = PasswordUtils.containsTriple(password);
            //Assert
        assertEquals(true, actual);
        }
        @Test
        void containsDouble() {
            //Arrange
        String password = "aa";
            //Act
        Boolean actual = PasswordUtils.containsTriple(password);
            //Assert
        assertEquals(false, actual);
        }
        @Test
        void threeNonConsecutiveCharacters() {
            //Arrange
        String password = "abacad";
            //Act
        Boolean actual = PasswordUtils.containsTriple(password);
            //Assert
        assertEquals(false, actual);
        }
        @Test
        void noRepeats() {
            //Arrange
        String password = "abcd";
            //Act
        Boolean actual = PasswordUtils.containsTriple(password);
            //Assert
        assertEquals(false, actual);
        }
        @Test
        void blankRepeats() {
            //Arrange
        String password = "   ";
            //Act
        Boolean actual = PasswordUtils.containsTriple(password);
            //Assert
        assertEquals(true, actual);
        }
        @Test
        void threeGroupsOfThree() {
            //Arrange
        String password = "$$$   @@@";
            //Act
        Boolean actual = PasswordUtils.containsTriple(password);
            //Assert
        assertEquals(true, actual);
        }
        @Test
        void rowInTheMiddle() {
            //Arrange
        String password = "aabbbcc";
            //Act
        Boolean actual = PasswordUtils.containsTriple(password);
            //Assert
        assertEquals(true, actual);
        }
        @Test
        void stringIsEmpty() {
            //Arrange
        String password = "";
            //Act
        Boolean actual = PasswordUtils.containsTriple(password);
            //Assert
        assertEquals(false, actual);
        }

    }
