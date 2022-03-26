package EduSys.entity;

import static org.junit.jupiter.api.Assertions.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.After;

import org.junit.Before;
import org.junit.Test;

public class KhoaHocTest {
	KhoaHoc khoaHoc;
	SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd");

	@Before
	public void setUp() throws Exception {
		
		 Date dateNow = sf.parse("2022-04-17");
		
		khoaHoc = new KhoaHoc(1, "CD001", 100000, 100, dateNow, "Hello", "NV001", dateNow,true);
	}

	@After
	public void tearDown() throws Exception {
		khoaHoc = null;
	}

	@Test
	public void testIsIdList() {
		boolean expected = true;
		boolean actual = khoaHoc.isIdList();
		assertTrue(khoaHoc.isIdList());
		assertEquals(expected, actual);

	}

	@Test
	public void testSetIdList() {
		khoaHoc.setIdList(true);
		boolean expected = true;
		boolean actual = khoaHoc.isIdList();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetMaKH() {
		int expected= 1;
		int result = khoaHoc.getMaKH();
		assertEquals(expected,expected);
	}

	@Test
	public void testSetMaKH() {
		khoaHoc.setMaKH(1);
		int expected= 1;
		int result = khoaHoc.getMaKH();
		assertEquals(expected,expected);
	}

	@Test
	public void testGetMaCD() {
		String expected = "CD001";
		String result = khoaHoc.getMaCD();
		assertEquals(expected, result);
	}

	@Test
	public void testSetMaCD() {
		khoaHoc.setMaCD("CD001");
		String expected = "CD001";
		String result = khoaHoc.getMaCD();
		assertEquals(expected, result);
	}

	@Test
	public void testGetHocPhi() {
		float expected = 100000;
		float result = khoaHoc.getHocPhi();
		assertEquals(expected, result);
	}

	@Test
	public void testSetHocPhi() {
		khoaHoc.setHocPhi(100000);
		float expected = 100000;
		float result = khoaHoc.getHocPhi();
		assertEquals(expected, result);
	}

	@Test
	public void testGetThoiLuong() {
		int expected = 100;
		int result = khoaHoc.getThoiLuong();
		assertEquals(expected, result);
	}

	@Test
	public void testSetThoiLuong() {
		khoaHoc.setThoiLuong(100);
		int expected = 100;
		int result = khoaHoc.getThoiLuong();
		assertEquals(expected, result);
	}

	@Test
	public void testGetNgayKG() throws ParseException {
		Date expected = sf.parse("2022-04-17");
		Date result = khoaHoc.getNgayKG();
		assertEquals(expected, result);
	}

	@Test
	public void testSetNgayKG() throws ParseException {
		khoaHoc.setNgayKG(sf.parse("2022-04-17"));
		Date expected = sf.parse("2022-04-17");
		Date result = khoaHoc.getNgayKG();
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
	public void testGetMaNV() {
		String expected = "NV001";
		String result = khoaHoc.getMaNV();
		assertEquals(expected, result);
	}

	@Test
	public void testSetMaNV() {
		khoaHoc.setMaNV("NV001");
		String expected = "NV001";
		String result = khoaHoc.getMaNV();
		assertEquals(expected, result);
	}

	@Test
	public void testGetNgayTao() throws ParseException {
		Date expected = sf.parse("2022-04-17");
		//convert result to "yyyy-MM-dd"
		Date result = khoaHoc.getNgayTao();
		assertEquals(expected, result);
	}

	@Test
	public void testSetNgayTao() throws ParseException {
		khoaHoc.setNgayTao(sf.parse("2022-04-17"));
		Date expected = sf.parse("2022-04-17");
		//convert result to "yyyy-MM-dd"
		Date result = khoaHoc.getNgayTao();
		assertEquals(expected, result);
	}

}
