import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

// TODO: Replace examples and use TDD by writing your own tests

class SequenceSumTest {
    @Test
    @DisplayName("Sample Test Cases")
    void testSomething() {
        assertEquals(12, SequenceSum.sequenceSum( 2,  6, 2), "sequenceSum(2, 6, 2)");
        assertEquals(15, SequenceSum.sequenceSum( 1,  5, 1), "sequenceSum(1, 5, 1)");
        assertEquals( 5, SequenceSum.sequenceSum( 1,  5, 3), "sequenceSum(1, 5, 3)");
        assertEquals(45, SequenceSum.sequenceSum( 0, 15, 3), "sequenceSum(0, 15, 3)");
        assertEquals( 0, SequenceSum.sequenceSum(16, 15, 3), "sequenceSum(16, 15, 3)");
    }
}
