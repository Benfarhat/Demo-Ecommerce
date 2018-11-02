package demo.benfarhat.ecommerce.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Product {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private long id;
	private String name;
	private String code;
	private List<Provider> providers;
	private int stock;
	
	public Product() {
		super();
	}
	public Product(String name, String code, List<Provider> providers, int stock) {
		super();
		this.name = name;
		this.code = code;
		this.providers = providers;
		this.stock = stock;
	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public List<Provider> getProviders() {
		return providers;
	}
	public void setProviders(List<Provider> providers) {
		this.providers = providers;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", code=" + code + ", providers=" + providers + ", stock="
				+ stock + "]";
	}
}
