package ASM;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class KhoaHocTestNgoaiLe {

	KhoaHoc khoaHoc;

	@Before
	public void setUp() throws Exception {
		khoaHoc = new KhoaHoc();
	}

	@After
	public void tearDown() throws Exception {
		khoaHoc = null;
	}

	@Rule
	public ExpectedException exception = ExpectedException.none();
	
	@Test
	public void testMaKHRong()throws Exception {
		String maKH = null;
		try {
			khoaHoc.setMaKH(maKH);
			fail("Không bắt được ngoại lệ");
		} catch (Exception e) {
			assertEquals("Ma khong duoc rong", e.getMessage());
		}
		exception.expect(IllegalArgumentException.class);

		khoaHoc.setMaKH(maKH);
	}
	@Test
	public void testMaKHCoKiTuDB1() throws Exception{
		String maKH = "***01";
		try {
			khoaHoc.setMaKH(maKH);
			fail("Không bắt được ngoại lệ");
		} catch (Exception e) {
			assertEquals("Ma khong hop le", e.getMessage());
		}
		exception.expect(IllegalArgumentException.class);

		khoaHoc.setMaKH(maKH);
	}
	@Test
	public void testMaKHCoKiTuDB2() throws Exception{
		String maKH = "01";
		try {
			khoaHoc.setMaKH(maKH);
			fail("Không bắt được ngoại lệ");
		} catch (IllegalArgumentException e) {
			assertEquals("Ma khong hop le", e.getMessage());
		}
		exception.expect(IllegalArgumentException.class);

		khoaHoc.setMaKH(maKH);
	}
	@Test
	public void testMaKHCoKiTuDB3()throws Exception{
		String maKH = "0 1";
		try {
			khoaHoc.setMaKH(maKH);
			fail("Không bắt được ngoại lệ");
		} catch (Exception e) {
			assertEquals("Ma khong hop le", e.getMessage());
		}
		exception.expect(IllegalArgumentException.class);

		khoaHoc.setMaKH(maKH);
	}
	@Test
	public void testTenKHRong() throws Exception{
		String tenKH = null;
		try {
			khoaHoc.setTenKH(tenKH);
			fail("Không bắt được ngoại lệ");
		} catch (Exception e) {
			assertEquals("Ten khong duoc rong", e.getMessage());
		}
		exception.expect(IllegalArgumentException.class);

		khoaHoc.setTenKH(tenKH);
	}
	@Test 
	public void testTenKHCoKiTuDB1() throws Exception{
		String tenKH = "***Java";
		try {
			khoaHoc.setTenKH(tenKH);
			fail("Không bắt được ngoại lệ");
		} catch (Exception e) {
			assertEquals("Ten khong hop le", e.getMessage());
		}
		exception.expect(IllegalArgumentException.class);

		khoaHoc.setTenKH(tenKH);
	}
	@Test
	public void testTenKHCoKiTuDB2() throws Exception{
		String tenKH = "ja";
		try {
			khoaHoc.setTenKH(tenKH);
			fail("Không bắt được ngoại lệ");
		} catch (Exception e) {
			assertEquals("Ten khong hop le", e.getMessage());
		}
		exception.expect(IllegalArgumentException.class);

		khoaHoc.setTenKH(tenKH);
	}
	@Test
	public void testTenKHCoKiTuDB3() throws Exception{
		String tenKH = "j a";
		try {
			khoaHoc.setTenKH(tenKH);
			fail("Không bắt được ngoại lệ");
		} catch (Exception e) {
			assertEquals("Ten khong hop le", e.getMessage());
		}
		exception.expect(IllegalArgumentException.class);

		khoaHoc.setTenKH(tenKH);
	}

}
