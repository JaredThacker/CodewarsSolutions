import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class LeapYearTest
{

    @Test
    public void testYear2020()
    {
        assertEquals(true, LeapYear.isLeapYear(2020));
    }

    @Test
    public void testYear2000()
    {
        assertEquals(true, LeapYear.isLeapYear(2000));
    }

    @Test
    public void testYear2015()
    {
        assertEquals(false, LeapYear.isLeapYear(2015));
    }

    @Test
    public void testYear2100()
    {
        assertEquals(false, LeapYear.isLeapYear(2100));
    }
}

