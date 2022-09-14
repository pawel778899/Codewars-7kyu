import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.runners.JUnit4;

public class SolutionTest {
  
  @Test
  public void fixedTestsNegative() {
    
    assertEquals(null, Kata.center(new int[0][0]));
    assertEquals(null, Kata.center(new int[][]{ {5,1}, {6,2}, {7,4}, {1,3} }));
    assertEquals(null, Kata.center(new int[][]{ {5,1}, {3,7}, {4,5} }));
    assertEquals(null, Kata.center(new int[][]{ {5,1,3}, {7,4,5} }));
    assertEquals(null, Kata.center(new int[3][0]));
  }
  
  @Test
  public void fixedTestsPositive() {
    assertEquals(Integer.valueOf(3), Kata.center(new int[][]{ {3} }));
    assertEquals(Integer.valueOf(2), Kata.center(new int[][]{ {5,1,3}, {6,2,6}, {7,4,5} }));
    assertEquals(Integer.valueOf(4), Kata.center(new int[][]{ {5,1,3}, {6,2,6}, {7,4,5}, {10,12,12}, {14,0,0} }));
    assertEquals(Integer.valueOf(1), Kata.center(new int[][]{ {5,1,3} }));
    assertEquals(Integer.valueOf(1), Kata.center(new int[][]{ {5}, {1}, {3} }));
  }
}
