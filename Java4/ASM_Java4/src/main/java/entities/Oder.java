package entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the oder database table.
 * 
 */
@Entity
@NamedQuery(name="Oder.findAll", query="SELECT o FROM Oder o")
public class Oder implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	@Column(name="mo_ta")
	private String moTa;

	@Column(name="phuong_thuc")
	private int phuongThuc;

	@Column(name="tinh_trang")
	private int tinhTrang;

	@Column(name="tong_tien")
	private double tongTien;

	//bi-directional many-to-one association to User
	@ManyToOne
	private User user;
	@OneToMany(mappedBy="oder")
	private List<Orderdetail> orderdetails;

	public Oder() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMoTa() {
		return this.moTa;
	}

	public void setMoTa(String moTa) {
		this.moTa = moTa;
	}

	public int getPhuongThuc() {
		return this.phuongThuc;
	}

	public void setPhuongThuc(int phuongThuc) {
		this.phuongThuc = phuongThuc;
	}

	public int getTinhTrang() {
		return this.tinhTrang;
	}

	public void setTinhTrang(int tinhTrang) {
		this.tinhTrang = tinhTrang;
	}

	public double getTongTien() {
		return this.tongTien;
	}

	public void setTongTien(double tongTien) {
		this.tongTien = tongTien;
	}

	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public List<Orderdetail> getOrderdetails() {
		return this.orderdetails;
	}

	public void setOrderdetails(List<Orderdetail> orderdetails) {
		this.orderdetails = orderdetails;
	}

	public Orderdetail addOrderdetail(Orderdetail orderdetail) {
		getOrderdetails().add(orderdetail);
		orderdetail.setOder(this);

		return orderdetail;
	}

	public Orderdetail removeOrderdetail(Orderdetail orderdetail) {
		getOrderdetails().remove(orderdetail);
		orderdetail.setOder(null);

		return orderdetail;
	}
	
}