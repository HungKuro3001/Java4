package beans;

import java.util.Date;

public class StudentServlet {
	private String maSV;
	private String hoTen;
	private int gioiTinh;
	private String chuyenNganh;
	private String sdt;
	private Date thoiGian;
	
	
	
	public StudentServlet() {
	}
	public StudentServlet(String maSV, String hoTen, int gioiTinh, String chuyenNganh, String sdt, Date thoiGian) {
		super();
		this.maSV = maSV;
		this.hoTen = hoTen;
		this.gioiTinh = gioiTinh;
		this.chuyenNganh = chuyenNganh;
		this.sdt = sdt;
		this.thoiGian = thoiGian;
	}
	public String getMaSV() {
		return maSV;
	}
	public void setMaSV(String maSV) {
		this.maSV = maSV;
	}
	public String getHoTen() {
		return hoTen;
	}
	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}
	public int getGioiTinh() {
		return gioiTinh;
	}
	public void setGioiTinh(int gioiTinh) {
		this.gioiTinh = gioiTinh;
	}
	public String getChuyenNganh() {
		return chuyenNganh;
	}
	public void setChuyenNganh(String chuyenNganh) {
		this.chuyenNganh = chuyenNganh;
	}
	public String getSdt() {
		return sdt;
	}
	public void setSdt(String sdt) {
		this.sdt = sdt;
	}
	public Date getThoiGian() {
		return thoiGian;
	}
	public void setThoiGian(Date thoiGian) {
		this.thoiGian = thoiGian;
	}
	@Override
	public String toString() {
		return "StudentServlet [maSV=" + maSV + ", hoTen=" + hoTen + ", gioiTinh=" + gioiTinh + ", chuyenNganh="
				+ chuyenNganh + ", sdt=" + sdt + ", thoiGian=" + thoiGian + "]";
	}
	
	
}
