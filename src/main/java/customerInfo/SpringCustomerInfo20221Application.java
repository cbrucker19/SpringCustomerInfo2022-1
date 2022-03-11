package customerInfo;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import customerInfo.beans.Address;
import customerInfo.beans.CustomerInfo;
import customerInfo.controller.BeanConfiguration;
import customerInfo.repository.CustomerInfoRepository;



@SpringBootApplication
public class SpringCustomerInfo20221Application implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(SpringCustomerInfo20221Application.class, args);
	}
	
	@Autowired
	CustomerInfoRepository repo; 

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		ApplicationContext appContext = new AnnotationConfigApplicationContext(BeanConfiguration.class);
		
		//Using and existing bean
		CustomerInfo c = appContext.getBean("customerinfo", CustomerInfo.class);
		c.setCustNum("a1");
		repo.save(c); 
		
		//Creating a bean to use - not managed by spring
		CustomerInfo d = new CustomerInfo("Cyrus Brucker", "55-555-5555", "a2");
		Address a = new Address("123 Main Street", "Des Moines", "IA");
		d.setAddress(a);
		repo.save(d);
		
		List<CustomerInfo> allMyCustomerInfo = repo.findAll();
		for(CustomerInfo people: allMyCustomerInfo) {
			System.out.println(people.toString());
			
		}
		((AbstractApplicationContext) appContext).close(); 
	}

}
