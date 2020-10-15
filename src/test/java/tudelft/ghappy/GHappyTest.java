package tudelft.ghappy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GHappyTest {

    @Test
    public void doubleg() {
        GHappy gg = new GHappy();
        boolean result = gg.gHappy("xxggxx");
        Assertions.assertTrue(result);
    }

    @Test
    public void oneg() {
        GHappy gg = new GHappy();
        boolean result = gg.gHappy("xxgxx");
        Assertions.assertFalse(result);
    }

    @Test
    public void SimpleAfterDoubleg() {
        GHappy gg = new GHappy();
        boolean result = gg.gHappy("xxggyygxx");
        Assertions.assertFalse(result);
    }
}
