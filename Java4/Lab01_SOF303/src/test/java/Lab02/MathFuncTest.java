package Lab02;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Ignore;
import org.junit.After;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;

public class MathFuncTest {
	private MathFunc math;
	@Before
	public void setUpBeforeClass() throws Exception {
		math = new MathFunc();
		
	}

	@After
	public void tearDownAfterClass() throws Exception {
		math=null;
	}

//	@BeforeEach
//	void setUp() throws Exception {
//	}
//
//	@AfterEach
//	void tearDown() throws Exception {
//		
//	}

	@Test
	public void testGetCalls() {
		assertEquals (0, math.getCalls ());
		math.factorial (1);
		assertEquals (1, math.getCalls ());
		math.factorial (1);
		assertEquals (2, math.getCalls ());
	}

	@Test
	public void testFactorial() {
		assertTrue(math.factorial (0)== 1);
		assertTrue(math.factorial(1)== 1);
		assertTrue(math.factorial(5)== 120);		
	}
	@Test(expected = IllegalArgumentException.class)
	public void factorialNegative() {
		math.factorial(-1);
	}
	 @Ignore
		@Test
		public void testPlus() {
			assertEquals(math.plus(1, 2), 3);
		}
	 public static void main (String[] args) throws Exception {
		    JUnitCore runner = new JUnitCore();
		    Result result = runner.run (MathFuncTest.class);
		    System.out.println ("run tests: " + result.getRunCount () );
		    System.out.println ("failed tests: " + result.getFailureCount ());
		    System.out.println ("ignored tests: " + result.getIgnoreCount ());
		    System.out.println ("success: " + result.wasSuccessful ());
	 }
}
