package Lab03;
import static org.junit.Assert.*;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class PersonTest {


	@Rule
		public ExpectedException exception = ExpectedException.none();
		@Test
		public void testExpectedException() {
			exception.expect(IllegalArgumentException.class);
			new Person("Fpoly",-1);			
			new Person("Fpoly",14);
			new Person("Fpoly",66);


			
		}
	@Test(expected = IllegalArgumentException.class)
	public void testExpectedException2() {
		new Person("Dũng",-1);
		new Person("Dũng",14);
		new Person("Dũng",66);
		
	}
	@Test
	public void testExpectedException3() {
		try {
			new Person("Hùng",-1);
			new Person("Hùng",14);
			new Person("Hùng",66);
			fail("Should have thrown an IllegalArgumentException because age is invalid!");

		} catch (IllegalArgumentException e) {
			e.getMessage();
		}
	}
		
}
