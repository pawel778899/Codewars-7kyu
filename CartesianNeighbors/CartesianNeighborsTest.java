import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;

public class MixedTest {
    @Test
    public void ExampleTest() {
        assertArrayEquals("", Inspection.sortedList(Kata.cartesianNeighbor(2, 2)), new int[][]{{1,1},{1,2},{1,3},{2,1},{2,3},{3,1},{3,2},{3,3}} );
    }    
}
