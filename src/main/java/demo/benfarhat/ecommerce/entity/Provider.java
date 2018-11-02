package demo.benfarhat.ecommerce.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Provider {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private long id;
	private String name;
	private long enterpriseNumber;
	private String registerNumber;
	private String address;
	private String email;
	private String phone;
	
	public Provider() {
		super();
	}
	public Provider(String name, long enterpriseNumber, String registerNumber, String address, String email,
			String phone) {
		super();
		this.name = name;
		this.enterpriseNumber = enterpriseNumber;
		this.registerNumber = registerNumber;
		this.address = address;
		this.email = email;
		this.phone = phone;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getEnterpriseNumber() {
		return enterpriseNumber;
	}
	public void setEnterpriseNumber(long enterpriseNumber) {
		this.enterpriseNumber = enterpriseNumber;
	}
	public String getRegisterNumber() {
		return registerNumber;
	}
	public void setRegisterNumber(String registerNumber) {
		this.registerNumber = registerNumber;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	@Override
	public String toString() {
		return "Provider [id=" + id + ", name=" + name + ", enterpriseNumber=" + enterpriseNumber + ", registerNumber="
				+ registerNumber + ", address=" + address + ", email=" + email + ", phone=" + phone + "]";
	}
	
}
