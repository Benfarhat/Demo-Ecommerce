package demo.benfarhat.ecommerce.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Price {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private long id;
	private Date date;
	private double price;
	private Product product;
	
	public Price() {
		super();
	}
	public Price(Date date, double price, Product product) {
		super();
		this.date = date;
		this.price = price;
		this.product = product;
	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	
	@Override
	public String toString() {
		return "Price [id=" + id + ", date=" + date + ", price=" + price + ", product=" + product + "]";
	}
}
