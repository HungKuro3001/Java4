package Lab03;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import Lab02.MathFunc;


	@RunWith(Parameterized.class)
	public class ParameterTest{
		int so;
		long result;
		MathFunc math =new MathFunc();
	
	@BeforeEach
	public void setup() { 
		math = new MathFunc(); 
		} 
		public ParameterTest(int sotinh, long ketqua) { 
		this.so = sotinh; 
		this.result = ketqua; 
		} 
		@Parameterized.Parameters 
		public static Collection input() { 
		return Arrays.asList(new Object[][] {  
		{ 1, 1 },  
		{ 2, 2 },  
		{ 3, 6 },  
		{ 4, 24 },  
		{ 5, 120 }, 
		{ 6, 720 }, 
		{ 7, 5040 } 
		}); 
		} 
		@Test 
		public void testParameters() { 
		
		long ketqua = math.factorial(so); 
		assertEquals(result, ketqua); 
		} 


}
