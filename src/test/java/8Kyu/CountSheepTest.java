import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CountSheepTest {
    @Test
    public void testSomething() {
        assertEquals("", CountSheep.countingSheep(0));
        assertEquals("1 sheep...", CountSheep.countingSheep(1));
        assertEquals("1 sheep...2 sheep...", CountSheep.countingSheep(2));
        assertEquals("1 sheep...2 sheep...3 sheep...", CountSheep.countingSheep(3));
    }
}
