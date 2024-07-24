import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class isIsogramTest {
    @Test
    public void FixedTests() {
        assertEquals(true, isIsogram.isIsogram("Dermatoglyphics"));
        assertEquals(true, isIsogram.isIsogram("isogram"));
        assertEquals(false, isIsogram.isIsogram("moose"));
        assertEquals(false, isIsogram.isIsogram("isIsogram"));
        assertEquals(false, isIsogram.isIsogram("aba"));
        assertEquals(false, isIsogram.isIsogram("moOse"));
        assertEquals(true, isIsogram.isIsogram("thumbscrewjapingly"));
        assertEquals(true, isIsogram.isIsogram(""));
    }
}
