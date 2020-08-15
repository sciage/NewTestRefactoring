package RomanTest;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class RomanTest {

    @Test
    public void junitWorks(){
        assertTrue(true);
    }

    @Test
    public void convertSingleDigitRoman(){
        int arabic = convert("I");
        assertEquals(1, arabic);
    }

    private int convert(String romanNumeral) {
        return 1;
    }
}
