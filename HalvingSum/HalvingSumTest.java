import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.runners.JUnit4;
import java.util.Random;

public class HalvingSumTest {
    @Test
    public void test() {
        HalvingSum hs = new HalvingSum();
        assertEquals(47,hs.halvingSum(25));
        assertEquals(247,hs.halvingSum(127));
    }
}
