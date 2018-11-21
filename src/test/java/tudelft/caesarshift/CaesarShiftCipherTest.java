package tudelft.caesarshift;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class CaesarShiftCipherTest {

    private CaesarShiftCipher caesarShiftCipher;

    @BeforeEach
    public void initializer() {
        this.caesarShiftCipher = new CaesarShiftCipher();
    }

    @ParameterizedTest
    @CsvSource({"abc, 3, def", "xyz, 3, abc", "awj, 5, fbo"})
    public void ceaserShiftTest(String message, int shift, String result) {
        String decipherResult = caesarShiftCipher.CaesarShiftCipher(message, shift);
        Assertions.assertEquals(result, decipherResult);

    }
}




