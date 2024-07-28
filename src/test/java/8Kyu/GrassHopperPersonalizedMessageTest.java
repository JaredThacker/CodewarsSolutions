import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class GrassHopperPersonalizedMessageTest {
    @Test public void basicTests() {
        assertEquals("For inputs \"Daniel\" and \"Daniel\"", "Hello boss", GrassHopperPersonalizedMessage.greet("Daniel", "Daniel"));
        assertEquals("For inputs \"Greg\" and \"Daniel\"", "Hello guest", GrassHopperPersonalizedMessage.greet("Greg", "Daniel"));
    }
}
