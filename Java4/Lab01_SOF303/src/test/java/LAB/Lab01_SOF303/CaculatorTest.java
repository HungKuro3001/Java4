package LAB.Lab01_SOF303;

import static org.junit.Assert.assertEquals;

import javax.annotation.processing.Generated;

import org.junit.Test;

@Generated(value = "org.junit-tools-1.1.0")
public class CaculatorTest {

	private Caculator createTestSubject() {
		return new Caculator();
	}

	@Test
	public void testTong() throws Exception {
		Caculator testSubject;
		int x = 2;
		int y = 3;
		int result;
		int expected=5;

		// default test
		testSubject = createTestSubject();
		result = testSubject.tong(x, y);
		assertEquals(expected, result);
	}

	@Test
	public void testTru() throws Exception {
		Caculator testSubject;
		int x = 3;
		int y = 2;
		int result;
		int expected=0;

		// default test
		testSubject = createTestSubject();
		result = testSubject.tru(x, y);
		assertEquals(expected, result);
	}

	@Test
	public void testNhan() throws Exception {
		Caculator testSubject;
		int x = 0;
		int y = 0;
		int result;
		int expected=0;
		// default test
		testSubject = createTestSubject();
		result = testSubject.nhan(x, y);
		assertEquals(expected, result);
	}

	@Test
	public void testChia() throws Exception {
		Caculator testSubject;
		int x = 10;
		int y = 1;
		int result;
		int expected=19;

		// default test
		testSubject = createTestSubject();
		result = testSubject.chia(x, y);
		assertEquals(expected, result);
	}
}