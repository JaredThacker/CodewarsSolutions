import org.junit.Test;
import org.junit.experimental.runners.Enclosed;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertEquals;

@RunWith(Enclosed.class)
public class Multiples3or5Test {

    public static class SolutionTest {
        @Test
        public void test() {
            assertEquals(23, new Multiples3Or5().solution(10));
        }
    }
}
