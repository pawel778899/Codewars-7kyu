import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.runners.JUnit4;


public class SolutionTest {
    @Test
    public void testSomething() {
        assertEquals(3, Kata.unluckyDays(2015));
        assertEquals(1, Kata.unluckyDays(1986));
    }
}
