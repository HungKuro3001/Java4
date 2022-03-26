package LAB.Lab01_SOF303;

import static org.junit.Assert.assertEquals;

import javax.annotation.processing.Generated;

import org.junit.Test;

@Generated(value = "org.junit-tools-1.1.0")
public class AppTest {

	private App createTestSubject() {
		return new App();
	}

	@Test
	public void testIsEventNumber() throws Exception {
		App testSubject;
		int input = 5;
		boolean result;
		boolean expected = false;

		// default test
		testSubject = createTestSubject();
		result = testSubject.isEventNumber(input);
		assertEquals(expected, result);
	}

	
}