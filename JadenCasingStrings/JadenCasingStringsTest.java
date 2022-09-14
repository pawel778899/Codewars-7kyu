import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import org.junit.Test;

public class JadenCaseTest {

	
	JadenCase jadenCase = new JadenCase();
	
	@Test
	public void test() {
		assertEquals("toJadenCase doesn't return a valide JadenCase String! try again please :)", "Most Trees Are Blue", jadenCase.toJadenCase("most trees are blue"));
	}
	
	@Test
	public void testNullArg() {
		assertNull("Must return null when the arg is null", jadenCase.toJadenCase(null));
	}
	
	@Test
	public void testEmptyArg() {
		assertNull("Must return null when the arg is empty string", jadenCase.toJadenCase(""));
	}

}
