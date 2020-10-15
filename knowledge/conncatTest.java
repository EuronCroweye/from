package knowledge;

import static org.junit.Assert.*;

import org.junit.Test;

public class conncatTest {

	@Test
	public void concatTest() {
		JUClass junit = new JUClass();
		String result = junit.ConCat("Hello ", "World");
		assertEquals("Hello World", result);
	}

}
