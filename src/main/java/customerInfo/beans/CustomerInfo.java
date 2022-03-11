package customerInfo.beans;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.beans.factory.annotation.Autowired;
@Entity
public class CustomerInfo {

	@Id
	@GeneratedValue
	private long id;
	private String name; 
	private String phone;
	private String custNum; 
	@Autowired
	private Address address;
	
	public CustomerInfo() {
		super();
		this.custNum = "a3";
	}
	public CustomerInfo(String name) {
		
	}
	public CustomerInfo(String name, String phone, String custNum) {
		
	}
	public CustomerInfo(int id, String name, String phone, String custNum) {
		
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
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getCustNum() {
		return custNum;
	}
	public void setCustNum(String custNum) {
		this.custNum = custNum;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "CustomerInfo [id=" + id + ", name=" + name + ", phone=" + phone + ", custNum=" + custNum + ", address="
				+ address + "]";
	}
}