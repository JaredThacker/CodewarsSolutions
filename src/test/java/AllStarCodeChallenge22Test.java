import org.junit.Test;
import static org.junit.Assert.assertEquals;

import org.junit.experimental.runners.Enclosed;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(Enclosed.class)
public class AllStarCodeChallenge22Test {

    public static class timeConverterTest {

        @Test
        public void fixedTests() {
            assertEquals("1 hour(s) and 0 minute(s)", timeConverter.toTime(3600));
            assertEquals("1 hour(s) and 0 minute(s)", timeConverter.toTime(3601));
            assertEquals("0 hour(s) and 58 minute(s)", timeConverter.toTime(3500));
            assertEquals("89 hour(s) and 51 minute(s)", timeConverter.toTime(323500));
            assertEquals("0 hour(s) and 0 minute(s)", timeConverter.toTime(0));
        }
    }
}
