package entities;

import java.io.Serializable;
import javax.persistence.*;

import org.apache.log4j.Logger;

import java.util.List;


/**
 * The persistent class for the categories database table.
 * 
 */
@Entity
@Table(name="categories")
@NamedQuery(name="Category.findAll", query="SELECT c FROM Category c")
public class Category implements Serializable {
	private static  Logger log = Logger.getLogger(Category.class);
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	private String ten;

	//bi-directional many-to-one association to Product
	@OneToMany(mappedBy="category")
	private List<Product> products;

	public Category() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTen() {
		return this.ten;
	}

	public void setTen(String ten) {
		this.ten = ten;
	}

	public List<Product> getProducts() {
		return this.products;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}

	public Product addProduct(Product product) {
		getProducts().add(product);
		product.setCategory(this);

		return product;
	}

	public Product removeProduct(Product product) {
		getProducts().remove(product);
		product.setCategory(null);

		return product;
	}
	@PrePersist
	public void logNewUserAttempt() {
	    log.info("Attempting to add new user with name: " + this.ten);
	}
	    
	@PostPersist
	public void logNewUserAdded() {
	    log.info("Added user '" + this.ten + "' with ID: " + this.id );
	}
	    
	@PreRemove
	public void logUserRemovalAttempt() {
	    log.info("Attempting to delete user: " + this.ten);
	}
	    
	@PostRemove
	public void logUserRemoval() {
	    log.info("Deleted user: " + this.ten);
	}

	@PreUpdate
	public void logUserUpdateAttempt() {
	    log.info("Attempting to update user: " + this.ten);
	}

	@PostUpdate
	public void logUserUpdate() {
	    log.info("Updated user: " + this.ten);
	}

}