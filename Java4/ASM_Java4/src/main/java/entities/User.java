package entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the users database table.
 * 
 */
@Entity
@Table(name="users")
@NamedQuery(name="User.findAll", query="SELECT u FROM User u")
public class User implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	@Column(name="dia_chi")
	private String diaChi;

	private String email;

	@Column(name="ho_ten")
	private String hoTen;

	private String password;

	private boolean role;

	private String sdt;

	//bi-directional many-to-one association to Oder
	@OneToMany(mappedBy="user")
	private List<Oder> oders;

	public User() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDiaChi() {
		return this.diaChi;
	}

	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getHoTen() {
		return this.hoTen;
	}

	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public boolean getRole() {
		return this.role;
	}

	public void setRole(boolean role) {
		this.role = role;
	}

	public String getSdt() {
		return this.sdt;
	}

	public void setSdt(String sdt) {
		this.sdt = sdt;
	}

	public List<Oder> getOders() {
		return this.oders;
	}

	public void setOders(List<Oder> oders) {
		this.oders = oders;
	}

	public Oder addOder(Oder oder) {
		getOders().add(oder);
		oder.setUser(this);

		return oder;
	}

	public Oder removeOder(Oder oder) {
		getOders().remove(oder);
		oder.setUser(null);

		return oder;
	}

}