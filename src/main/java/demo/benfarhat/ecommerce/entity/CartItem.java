package demo.benfarhat.ecommerce.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class CartItem {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private long id;
	private ShoppingCart shoppingCart;
	private Product product;
	private int quantity;
	
	public CartItem() {
		super();
	}
	public CartItem(ShoppingCart shoppingCart, Product product, int quantity) {
		super();
		this.shoppingCart = shoppingCart;
		this.product = product;
		this.quantity = quantity;
	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public ShoppingCart getShoppingCart() {
		return shoppingCart;
	}
	public void setShoppingCart(ShoppingCart shoppingCart) {
		this.shoppingCart = shoppingCart;
	}
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	@Override
	public String toString() {
		return "CartItem [id=" + id + ", shoppingCart=" + shoppingCart + ", product=" + product + ", quantity="
				+ quantity + "]";
	}
}
