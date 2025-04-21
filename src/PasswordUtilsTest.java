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
    @Test
    void testIsAlphanumericFalse(){
        //Arrange 
        String password = "$$$$";
        //Act
        boolean actual = PasswordUtils.isAlphanumeric(password);
        //Assert
        assertEquals(false, actual);
    }
    @Test
    void testIsAlphanumericTrue(){
        //Arrange 
        String password = "H ello123";
        //Act
        boolean actual = PasswordUtils.isAlphanumeric(password);
        //Assert
        assertEquals(false, actual);
    }
    @Test
    void testContainsTripleTrue(){
        //Arrange 
        String password = "Heeello";
        //Act
        boolean actual = PasswordUtils.containsTriple(password);
        //Assert
        assertEquals(true, actual);
    }
    @Test
    void testContainsTripleFalse(){
        String password = "hael";
        boolean actual = PasswordUtils.containsTriple(password);
        assertEquals(false, actual);
    }
    @Test
    void  testNumberSpecialTrue(){
        String password = "###abc";
        int actual = PasswordUtils.countSpecialCharacters(password);
        assertEquals(3, actual);

    }
    @Test
    void  testNumberSpecialFalse(){
        String password = "###4+  abc";
        int actual = PasswordUtils.countSpecialCharacters(password);
        assertEquals(4, actual);

    }
}
