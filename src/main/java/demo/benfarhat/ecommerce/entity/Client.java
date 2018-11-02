package demo.benfarhat.ecommerce.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Client {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private long id;
	private String familyName;
	private String name;
	private String email;
	private String address;
	private String phone;
	
	public Client() {
		super();
	}
	public Client(String familyName, String name, String email, String address, String phone) {
		super();
		this.familyName = familyName;
		this.name = name;
		this.email = email;
		this.address = address;
		this.phone = phone;
	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getFamilyName() {
		return familyName;
	}
	public void setFamilyName(String familyName) {
		this.familyName = familyName;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	@Override
	public String toString() {
		return "Client [id=" + id + ", familyName=" + familyName + ", name=" + name + ", email=" + email + ", address="
				+ address + ", phone=" + phone + "]";
	}
	
}
