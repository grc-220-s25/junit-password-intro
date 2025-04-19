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
        assertEquals("long", actual);
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
        assertEquals(true, actual);
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
        //Unit-tests for countSpecialCharacters
        @Test
        void noCharactersInserted() {
            //Arrange
        String password = "";
            //Act
        int actual = PasswordUtils.countSpecialCharacters(password);
            //Assert
        assertEquals(0, actual);
        }
        @Test
        void hasOneSpecialCharacter() {
            //Arrange
        String password = "$";
            //Act
        int actual = PasswordUtils.countSpecialCharacters(password);
            //Assert
        assertEquals(1, actual);
        }
        @Test
        void twoSpecialCharactersSeparatedByASpace() {
            //Arrange
        String password = "@ &";
            //Act
        int actual = PasswordUtils.countSpecialCharacters(password);
            //Assert
        assertEquals(3, actual);
        }
        @Test
        void hasOnlyLetters() {
            //Arrange
        String password = "dmfodceucdsmekedjh";
            //Act
        int actual = PasswordUtils.countSpecialCharacters(password);
            //Assert
        assertEquals(0, actual);
        }
        @Test
        void hasOnlyNumbers() {
            //Arrange
        String password = "129493095573092948";
            //Act
        int actual = PasswordUtils.countSpecialCharacters(password);
            //Assert
        assertEquals(0, actual);
        }
        @Test
        void hasNoSpecialCharacters() {
            //Arrange
        String password = "d2m3f4o5d6c7e8u8c9d0s1m2e3k4e5d6j6h7";
            //Act
        int actual = PasswordUtils.countSpecialCharacters(password);
            //Assert
        assertEquals(0, actual);
        }
        @Test
        void hasOneSpecialCharacterAtTheEnd() {
            //Arrange
        String password = "d2m3f4o5d6c7e8u8c9d0s1m2e3k4e5d6j6h7*";
            //Act
        int actual = PasswordUtils.countSpecialCharacters(password);
            //Assert
        assertEquals(1, actual);
        }
        @Test
        void hasSpecialCharactersSeparatedByNormalOnes() {
            //Arrange
        String password = "d!2@m#3$f%4^o&5*d(6)c 7-e_8+u=8`c~9;d'0?s>1<m!2@e#3$k%4^e&5*d(6)j!6@h#7$";
            //Act
        int actual = PasswordUtils.countSpecialCharacters(password);
            //Assert
        assertEquals(36, actual);
        }
        //Unit-tests for hasSufficientSpecialCharacters
        @Test
        void containsNoSpecialCharacters() {
            //Arrange
        String password = "";
        int minimum = 3;
            //Act
        int actual = PasswordUtils.hasSufficientSpecialCharacters(password);
            //Assert
        assertEquals(false, actual);
        }
        @Test
        void hasAtLeastThreeSpecialCharacters() {
            //Arrange
        String password = "d!2@m#3$f%4^o&5*d(6)c 7-e_8+u=8`c~9;d'0?s>1<m!2@e#3$k%4^e&5*d(6)j!6@h#7$";
        int minimum = 3;
            //Act
        int actual = PasswordUtils.hasSufficientSpecialCharacters(password);
            //Assert
        assertEquals(true, actual);
        }
        @Test
        void hasOneHundredAndThreeSpecialCharacters() {
            //Arrange
        String password = "d!2@m#3$f%4^o&5*d(6)c 7-e_8+u=8`c~9;d'0?s>1<m!2@e#3$k%4^e&5*d(6)j!6@h#7$";
        int minimum = 103;
            //Act
        int actual = PasswordUtils.hasSufficientSpecialCharacters(password);
            //Assert
        assertEquals(false, actual);
        }
        @Test
        void hasNegativeNumberOfSpecialCharacters() {
            //Arrange
        String password = "d!2@m#3$f%4^o&5*d(6)c 7-e_8+u=8`c~9;d'0?s>1<m!2@e#3$k%4^e&5*d(6)j!6@h#7$";
        int minimum = -3;
            //Act
        int actual = PasswordUtils.hasSufficientSpecialCharacters(password);
            //Assert
        assertEquals(false, actual);
        }
        @Test
        void hasThreeSpecialCharacters() {
            //Arrange
        String password = "!@$";
        int minimum = 3;
            //Act
        int actual = PasswordUtils.hasSufficientSpecialCharacters(password);
            //Assert
        assertEquals(true, actual);
        }
        @Test
        void doesNotHaveEnoughSpecialCharacters() {
            //Arrange
        String password = "%^";
        int minimum = 3;
            //Act
        int actual = PasswordUtils.hasSufficientSpecialCharacters(password);
            //Assert
        assertEquals(false, actual);
        }
        @Test
        void whenMinimumSpecialCharactersIsZero() {
            //Arrange
        String password = "dkfjk120342";
        int minimum = 0;
            //Act
        int actual = PasswordUtils.hasSufficientSpecialCharacters(password);
            //Assert
        assertEquals(true, actual);
        }
    }
