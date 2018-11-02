package demo.benfarhat.ecommerce.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ShoppingCart {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private long id;
	private long scNumber;
	private Date scDate;
	private Client client;
	public ShoppingCart() {
		super();
	}
	public ShoppingCart(long scNumber, Date scDate, Client client) {
		super();
		this.scNumber = scNumber;
		this.scDate = scDate;
		this.client = client;
	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public long getScNumber() {
		return scNumber;
	}
	public void setScNumber(long scNumber) {
		this.scNumber = scNumber;
	}
	public Date getScDate() {
		return scDate;
	}
	public void setScDate(Date scDate) {
		this.scDate = scDate;
	}
	public Client getClient() {
		return client;
	}
	public void setClient(Client client) {
		this.client = client;
	}
	
	@Override
	public String toString() {
		return "ShoppingCart [id=" + id + ", scNumber=" + scNumber + ", scDate=" + scDate + ", client=" + client + "]";
	}
}
