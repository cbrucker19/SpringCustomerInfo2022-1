package customerInfo.controller;
import org.springframework.context.annotation.Bean;

import customerInfo.beans.Address;
import customerInfo.beans.CustomerInfo;


public class BeanConfiguration {

	@Bean
	public CustomerInfo customerinfo() {
		CustomerInfo bean = new CustomerInfo();
		//bean.setName("Joe");
		//bean.setPhone("555-555-5555");
		//bean.setCustNum("a4");
		return bean;
	}
	@Bean
	public Address address() {
		Address bean = new Address("123 Main Street", "Des Moines", "IA");
		return bean; 
	}
}
