package tudelft.ghappy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class GHappyTest {

    private GHappy gHappy;

    @BeforeEach
    public void initializer() {
       this.gHappy = new GHappy();

    }

    @ParameterizedTest(name="input={0}, result={1}")
    @CsvSource({"xxggxx, true", "ggcc, true", "gkkg, false", "gggx, true", "ddggcc, true"})
    public void inputTest(String input, boolean result) {
        boolean stringVerificatiion = gHappy.gHappy(input);
        Assertions.assertEquals(result, stringVerificatiion);



    }
}
