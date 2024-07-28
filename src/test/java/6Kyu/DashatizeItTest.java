import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DashatizeItTest {

    @Test
    public void testBasic() {
        assertEquals("2-7-4", DashatizeIt.dashatize(274));
        assertEquals("5-3-1-1", DashatizeIt.dashatize(5311));
        assertEquals("86-3-20", DashatizeIt.dashatize(86320));
        assertEquals("9-7-4-3-02", DashatizeIt.dashatize(974302));
    }

    @Test
    public void testWeird() {
        assertEquals("0", DashatizeIt.dashatize(0));
        assertEquals("1", DashatizeIt.dashatize(-1));
        assertEquals("28-3-6-9", DashatizeIt.dashatize(-28369));
    }

    @Test
    public void testEdgeCases() {
        assertEquals("2-1-4-7-48-3-64-7", DashatizeIt.dashatize(Integer.MAX_VALUE));
        assertEquals("2-1-4-7-48-3-648", DashatizeIt.dashatize(Integer.MIN_VALUE));
        assertEquals("1-1-1-1-1-1-1-1-1-1", DashatizeIt.dashatize(-1111111111));
    }

    @Test
    public void testRandom() {
        assertEquals("1-7-20-1-9-9-9-1-1", DashatizeIt.dashatize(1720199911));
        assertEquals("1-9-3-248-1-8-5-1", DashatizeIt.dashatize(1932481851));
        assertEquals("1-9-4-9-482-3-3-5", DashatizeIt.dashatize(1949482335));
        assertEquals("1-0-7-3-5-5-9-9-84", DashatizeIt.dashatize(1073559984));
        assertEquals("844-1-7-4-7-7-6", DashatizeIt.dashatize(844174776));
        assertEquals("1-9-8-7-5-1-9-5-82", DashatizeIt.dashatize(1987519582));
        assertEquals("1-0-1-4-5-9-862-7", DashatizeIt.dashatize(1014598627));
    }

}
