package knowledge;

import static org.junit.Assert.*;

import org.junit.Test;

public class AddTest {

	@Test
	public void AddTest() {
		JUClass junit = new JUClass();
		int result = junit.add(100, 200);
		assertEquals(301, result);
	}

}
