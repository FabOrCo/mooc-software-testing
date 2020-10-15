package tudelft.caesarshift;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class CaesarShiftCipherTest {

    @Test
    public void FirstonABC(){
        CaesarShiftCipher CSC = new CaesarShiftCipher();
        String result = CSC.CaesarShiftCipher("abc",3);
        Assertions.assertEquals("def", result);
    }

    @ParameterizedTest(name = "message={0}, shift={1}, result={2}")
    @CsvSource({ "abc,3,def", "abc,-1,zab", "abc,0,abc", "abc,1,bcd" })
    public void FirstLetters(String message, int shift, String expectedResult) {
        CaesarShiftCipher CSC = new CaesarShiftCipher();
        String result = CSC.CaesarShiftCipher(message,shift);
        Assertions.assertEquals(expectedResult, result);
    }

    @ParameterizedTest(name = "message={0}, shift={1}, result={2}")
    @CsvSource({ "xyz,3,abc", "xyz,-1,wxy","xyz,0,xyz", "xyz,1,yza", "xyzab,2,zabcd" })
    public void LastLetters(String message, int shift, String expectedResult) {
        CaesarShiftCipher CSC = new CaesarShiftCipher();
        String result = CSC.CaesarShiftCipher(message,shift);
        Assertions.assertEquals(expectedResult, result);
    }

    @ParameterizedTest(name = "message={0}, shift={1}, result={2}")
    @CsvSource({ "xyz,26,xyz", "abc,26,abc","xyzab,26,xyzab",
            "xyz,25,wxy", "abc,25,zab","xyzab,25,wxyza",
            "xyz,27,yza", "abc,27,bcd","xyzab,27,yzabc"})
    public void twist(String message, int shift, String expectedResult) {
        CaesarShiftCipher CSC = new CaesarShiftCipher();
        String result = CSC.CaesarShiftCipher(message,shift);
        Assertions.assertEquals(expectedResult, result);
    }

    @ParameterizedTest(name = "message={0}, shift={1}, result={2}")
    @CsvSource({ "x+z,3,invalid", "xy*,-1,invalid","x z,0,invalid", "x/z,1,invalid", "xy=ab,2,invalid",
            "x`z,3,invalid", "xy{,-1,invalid","x[z,0,invalid", "x@z,1,invalid", "xy☺ab,2,invalid"})
    public void SpecialChar(String message, int shift, String expectedResult) {
        CaesarShiftCipher CSC = new CaesarShiftCipher();
        String result = CSC.CaesarShiftCipher(message,shift);
        Assertions.assertEquals(expectedResult, result);
    }

}
