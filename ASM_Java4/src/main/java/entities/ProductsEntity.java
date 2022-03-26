package entities;

import javax.persistence.*;

@Entity
@Table(name = "products", schema = "java4", catalog = "")
public class ProductsEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private int id;
    @Basic
    @Column(name = "ten")
    private String ten;
    @Basic
    @Column(name = "category_id")
    private int categoryId;
    @Basic
    @Column(name = "so_luong")
    private int soLuong;
    @Basic
    @Column(name = "mau_sac")
    private String mauSac;
    @Basic
    @Column(name = "kich_thuoc")
    private String kichThuoc;
    @Basic
    @Column(name = "img")
    private String img;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public String getMauSac() {
        return mauSac;
    }

    public void setMauSac(String mauSac) {
        this.mauSac = mauSac;
    }

    public String getKichThuoc() {
        return kichThuoc;
    }

    public void setKichThuoc(String kichThuoc) {
        this.kichThuoc = kichThuoc;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ProductsEntity that = (ProductsEntity) o;

        if (id != that.id) return false;
        if (categoryId != that.categoryId) return false;
        if (soLuong != that.soLuong) return false;
        if (ten != null ? !ten.equals(that.ten) : that.ten != null) return false;
        if (mauSac != null ? !mauSac.equals(that.mauSac) : that.mauSac != null) return false;
        if (kichThuoc != null ? !kichThuoc.equals(that.kichThuoc) : that.kichThuoc != null) return false;
        if (img != null ? !img.equals(that.img) : that.img != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (ten != null ? ten.hashCode() : 0);
        result = 31 * result + categoryId;
        result = 31 * result + soLuong;
        result = 31 * result + (mauSac != null ? mauSac.hashCode() : 0);
        result = 31 * result + (kichThuoc != null ? kichThuoc.hashCode() : 0);
        result = 31 * result + (img != null ? img.hashCode() : 0);
        return result;
    }
}
