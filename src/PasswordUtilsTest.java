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

    @Test
    void testDescribePasswordLengthLong(){
       // Arange 
        String password = "helloLazyStudentSDEV220";
        //Act
        String actual = PasswordUtils.describePasswordLength(password);
        //Assert
        assertEquals("long", actual);
    }

    @Test 
    void testCheckForALphanumbericDigit(){
        String password = "hello123";

        boolean actual = PasswordUtils.isAlphanumeric(password);

        assertEquals(true, actual);
    }

    @Test 
    void testCheckForALphanumbericDigitFalse(){
        String password = "hello";

        boolean actual = PasswordUtils.isAlphanumeric(password);

        assertEquals(false, actual);
    }

    @Test 
    void CheckingForTripleCharachter(){
        String password = "paaassword";

        boolean actual =PasswordUtils.containsTriple(password);

        assertEquals(true, actual);
    }

    @Test 
    void CheckingForlessthanTriple(){
        String password = "paassword";

        boolean actual =PasswordUtils.containsTriple(password);

        assertEquals(true, actual);
    }

    @Test 
    void CheckingForlessthanTriplewithnumber(){
        String password = "paassword***";

        boolean actual =PasswordUtils.containsTriple(password);

        assertEquals(true, actual);
    }
    
    @Test
    void CountSpecialCharacters(){
        String password = "Hello@#d";

        int actual = PasswordUtils.countSpecialCharacters(password);

        assertEquals(2, actual);
    }

    @Test
    void CountSpecialCharactersWithNumber(){
        String password = "Hello123@@#3";

        int actual = PasswordUtils.countSpecialCharacters(password);

        assertEquals(3, actual);
    }

    @Test
    void CountSpecialCharactersWithSpace(){
        String password = "A B C  ";

        int actual = PasswordUtils.countSpecialCharacters(password);

        assertEquals(4, actual);
    }


}
