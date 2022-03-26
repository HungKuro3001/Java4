package ASM;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class KhoaHocTestBien {
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
	public void testBienHocPhi() throws Exception {
		double hocPhi = 50000000;
		exception.expect(IllegalArgumentException.class);
		khoaHoc.setHocPhi(-1);
		khoaHoc.setHocPhi(1);
		khoaHoc.setHocPhi(49999999);
		khoaHoc.setHocPhi(50000001);
		
	}
	@Test
	public void testBienThoiLuong() throws Exception {
		int thoiLuong = 120;
		exception.expect(IllegalArgumentException.class);
		khoaHoc.setThoiLuong(-1);
		khoaHoc.setThoiLuong(1);
		khoaHoc.setThoiLuong(119);
		khoaHoc.setThoiLuong(121);

	}
	@Test
	public void testBienHocVien() throws Exception {
		int soHV = 25;
		exception.expect(IllegalArgumentException.class);
		khoaHoc.setSoHV(-1);
		khoaHoc.setSoHV(1);
		khoaHoc.setSoHV(24);
		khoaHoc.setSoHV(26);
		
	}
	

}
