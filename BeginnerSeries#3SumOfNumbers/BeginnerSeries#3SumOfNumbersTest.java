import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.runners.JUnit4;


public class SumTest1 {
    
    Sum s = new Sum();

    @Test
    public void Test1()
    {
      assertEquals(-1, s.GetSum(0, -1));
      assertEquals(1, s.GetSum(0, 1));
    }

}
