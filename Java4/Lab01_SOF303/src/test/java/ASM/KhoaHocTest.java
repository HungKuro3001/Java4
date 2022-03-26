package ASM;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.After;
import org.junit.Before;

import org.junit.Test;

public class KhoaHocTest {
	KhoaHoc khoaHoc;

	

	@Before
	public void setUp() throws Exception {
		khoaHoc = new KhoaHoc("KH01", "Java", 50, 2000000, "Hello", 5);
	}

	@After
	public void tearDown() throws Exception {
		khoaHoc = null;
	}
	@Test
	public void testGetMaKH() {
		String expected = "KH01";
		String result = khoaHoc.getMaKH();
		assertEquals(expected, result);

	}

	@Test
	public void testSetMaKH() {
		khoaHoc.setMaKH("KH01");
		String expected = "KH01";
		String result = khoaHoc.getMaKH();
		assertEquals(expected, khoaHoc.getMaKH());
	}

	@Test
	public void testGetTenKH() {
		String expected = "Java";
		String result = khoaHoc.getTenKH();
		assertEquals(expected, result);
	}

	@Test
	public void testSetTenKH() {
		khoaHoc.setTenKH("Java");
		String expected = "Java";
		String result = khoaHoc.getTenKH();
		assertEquals(expected, result);
	}

	@Test
	public void testGetThoiLuong() {
		int expected = 50;
		int result = khoaHoc.getThoiLuong();
		assertEquals(expected, result);
	}

	@Test
	public void testSetThoiLuong() {
		khoaHoc.setThoiLuong(50);
		int expected = 50;
		int result = khoaHoc.getThoiLuong();
		assertEquals(expected, result);
	}

	@Test
	public void testGetHocPhi() {
		double expected = 2000000;
		double result = khoaHoc.getHocPhi();
		assertEquals(expected, result);
	}

	@Test
	public void testSetHocPhi() {
		khoaHoc.setHocPhi(2000000);
		double expected = 2000000;
		double result = khoaHoc.getHocPhi();
		assertEquals(expected, result);
	}

	@Test
	public void testGetGhiChu() {
		String expected = "Hello";
		String result = khoaHoc.getGhiChu();
		assertEquals(expected, result);
	}

	@Test
	public void testSetGhiChu() {
		khoaHoc.setGhiChu("Hello");
		String expected = "Hello";
		String result = khoaHoc.getGhiChu();
		assertEquals(expected, result);
	}

	@Test
	public void testGetSoHV() {
		int expected = 5;
		int result = khoaHoc.getSoHV();
		assertEquals(expected, result);
	}

	@Test
	public void testSetSoHV() {
		khoaHoc.setSoHV(5);
		int expected = 5;
		int result = khoaHoc.getSoHV();
		assertEquals(expected, result);
	}

}
