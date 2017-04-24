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

    @Test
    public void testFactorialZero() {
        assertEquals(1, Recursion.factorial(0));
    }

    @Test
    public void testFactorialOne() {
        assertEquals(1, Recursion.factorial(0));
    }

    @Test
    public void testFactorialThree() {
        assertEquals(6, Recursion.factorial(3));
    }

    @Test
    public void testFibZero() {
        assertEquals(0, Recursion.fib(0));
    }

    @Test
    public void testFibOne() {
        assertEquals(1, Recursion.fib(1));
    }

    @Test
    public void testFibThree() {
        assertEquals(2, Recursion.fib(3));
    }
}
