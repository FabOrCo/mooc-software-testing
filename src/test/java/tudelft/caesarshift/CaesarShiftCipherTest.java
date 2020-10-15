package tudelft.caesarshift;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import tudelft.chocolate.ChocolateBags;

public class CaesarShiftCipherTest {

    @Test
    public void FirstonABC (){
        CaesarShiftCipher CSC = new CaesarShiftCipher();
        String result = CSC.CaesarShiftCipher("abc",3);
        Assertions.assertEquals("def", result);
    }

    @ParameterizedTest(name = "message={0}, shift={1}, result={2}")
    @CsvSource({ "abc,3,def", "xyz,3,abc" })
    public void FirstLetters(String message, int shift, String expectedResult) {
        CaesarShiftCipher CSC = new CaesarShiftCipher();
        String result = CSC.CaesarShiftCipher(message,shift);
        Assertions.assertEquals(expectedResult, result);
    }

}
