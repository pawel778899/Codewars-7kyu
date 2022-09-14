import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.runners.JUnit4;

public class GreatestCommonDivisorTest {
    @Test
    public void testGcd() {
        assertEquals(6, GCD.compute(30,12));
        assertEquals(1, GCD.compute(8,9));
        assertEquals(1, GCD.compute(1,1));       
    }
}
