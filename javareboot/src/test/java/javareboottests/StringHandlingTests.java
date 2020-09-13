package javareboottests;
import static org.junit.Assert.*;

import org.junit.Test;
import javareboot.StringHandling;

public class StringHandlingTests {

	@Test
	public void shouldReturnHelloWorld() {
		StringHandling str = new StringHandling();
		assertEquals("Hello World", str.helloWorld());
	}

}
