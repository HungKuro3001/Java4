package Lab04;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class VatCaCulatorTest {

  @Test
  public void getVatTest1() {
	  assertEquals(VatCaCulator.getVat(15000000), 2250000);
  }
  @Test
  public void getVatTest2() {
	  assertEquals(VatCaCulator.getVat(25000000), 2250000);
  }
}
