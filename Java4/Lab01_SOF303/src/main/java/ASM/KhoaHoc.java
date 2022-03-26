package ASM;

public class KhoaHoc {
	private String maKH;
	private String tenKH;
	private int thoiLuong;
	private double hocPhi;
	private String ghiChu;
	private int soHV;
	
	
	
	public KhoaHoc() {
		
	}
	public KhoaHoc(String maKH, String tenKH, int thoiLuong, double hocPhi, String ghiChu, int soHV) {
		super();
		this.maKH = maKH;
		this.tenKH = tenKH;
		this.thoiLuong = thoiLuong;
		this.hocPhi = hocPhi;
		this.ghiChu = ghiChu;
		this.soHV = soHV;
	}
	public String getMaKH() {
		return maKH;
	}
	public void setMaKH(String maKH) {
		if (maKH.isEmpty()) {
			throw new IllegalArgumentException("Ma khong duoc rong");
		}
		if(!(checkMa(maKH))) {
			throw new IllegalArgumentException("Ma khong hop le");
		}
		this.maKH = maKH;
	}
	public String getTenKH() {
		return tenKH;
	}
	public void setTenKH(String tenKH) {
		if (tenKH.isBlank()) {
			throw new IllegalArgumentException("Ten khong duoc rong");
		}
		if (!(checkTen(tenKH))) {
			throw new IllegalArgumentException("Ten khong hop le");
		}	
		this.tenKH = tenKH;
	}
	public int getThoiLuong() {
		return thoiLuong;
	}
	public void setThoiLuong(int thoiLuong) {
		if(thoiLuong<=0){
			throw new IllegalArgumentException("Thoi luong khong hop le");
		}
		if (thoiLuong > 120) {
			throw new IllegalArgumentException("Thoi luong khong vuot qua 120h");
		}
		this.thoiLuong = thoiLuong;
	}
	public double getHocPhi() {
		return hocPhi;
	}
	public void setHocPhi(double hocPhi) {
		if (hocPhi <0) {
			throw new IllegalArgumentException("Hoc phi khong hop le");
		}
		if (hocPhi > 50000000) {
			throw new IllegalArgumentException("Hoc phi khong vuot qua 50000000");
		}
		this.hocPhi = hocPhi;
	}
	public String getGhiChu() {
		return ghiChu;
	}
	public void setGhiChu(String ghiChu) {
		this.ghiChu = ghiChu;
	}
	public int getSoHV() {
		return soHV;
	}
	public void setSoHV(int soHV) {
		if (soHV <=0) {
			throw new IllegalArgumentException("So hoc vien khong hop le");
		}
		if(soHV > 25) {
			throw new IllegalArgumentException("So hoc vien khong vuot qua 25");
		}
	}
	public static boolean checkMa(String str) {
		String regex = "[a-zA-Z0-9]{3,15}";
		boolean kt = str.matches(regex);
		return kt;
	}
	public static boolean checkTen(String str) {
		String regex = "[a-zA-Z]{3,100}";
		boolean kt = str.matches(regex);
		return kt;
	}
}
