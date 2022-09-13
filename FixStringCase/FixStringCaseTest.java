import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.runners.JUnit4;

public class SampleTest {
    @Test
    public void BasicTests() {
        assertEquals("code", Solution.solve("code"));
        assertEquals("CODE", Solution.solve("CODe"));
        assertEquals("code", Solution.solve("COde"));
        assertEquals("code", Solution.solve("Code"));
        assertEquals("", Solution.solve(""));
    }
}
