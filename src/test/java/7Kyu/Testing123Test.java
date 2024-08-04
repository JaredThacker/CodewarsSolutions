import java.util.Arrays;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertIterableEquals;

public class Testing123Test {
    @Test
    public void basicTests() {
        assertIterableEquals(Arrays.asList(), Testing123.number(Arrays.asList()));
        assertIterableEquals(Arrays.asList("1: a", "2: b", "3: c"), Testing123.number(Arrays.asList("a", "b", "c")));
        assertIterableEquals(Arrays.asList("1: ", "2: ", "3: ", "4: ", "5: "), Testing123.number(Arrays.asList("", "", "", "", "")));
    }
}