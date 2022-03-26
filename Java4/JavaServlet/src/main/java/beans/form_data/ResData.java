package beans.form_data;

public class ResData {
	private String hoten;
	private String diachi;
	private String sdt;
	private String email;
	private String password;
	private int gioitinh;
	private int loaiKH;
	
	
	
	
	public ResData() {
		super();
	}

	public ResData(String hoten, String diachi, String sdt, String email, String password, int gioitinh, int loaiKH) {
		super();
		this.hoten = hoten;
		this.diachi = diachi;
		this.sdt = sdt;
		this.email = email;
		this.password = password;
		this.gioitinh = gioitinh;
		this.loaiKH = loaiKH;
	}

	//Getter & setter
	public String getHoten() {
		return hoten;
	}
	public void setHoten(String hoten) {
		this.hoten = hoten;
	}
	public String getDiachi() {
		return diachi;
	}
	public void setDiachi(String diachi) {
		this.diachi = diachi;
	}
	public String getSdt() {
		return sdt;
	}
	public void setSdt(String sdt) {
		this.sdt = sdt;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getGioitinh() {
		return gioitinh;
	}
	public void setGioitinh(int gioitinh) {
		this.gioitinh = gioitinh;
	}
	public int getLoaiKH() {
		return loaiKH;
	}
	public void setLoaiKH(int loaiKH) {
		this.loaiKH = loaiKH;
	}
	
}
