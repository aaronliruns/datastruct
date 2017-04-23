import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by Developer on 4/24/2017.
 */
public class TestRecursion {

    @Test
    public void testPowerRecursionTwoPowerZero() {
        assertEquals(1, Recursion.power(2,0),0.0);
    }

    @Test
    public void testPowerResursionTwoPowerTwo() {
        assertEquals(4, Recursion.power(2,2),0.0);
    }
}
