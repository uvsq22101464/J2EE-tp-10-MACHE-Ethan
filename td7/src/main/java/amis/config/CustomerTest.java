package amis.config;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import amis.entity.Customer;
import amis.service.ServiceCustomer;

public class CustomerTest {
	
	public static void main(String[] args) {
		AnnotationConfigApplicationContext monContext = new AnnotationConfigApplicationContext();
		monContext.scan("amis");
		monContext.refresh();
		ServiceCustomer serviceCustomer = (ServiceCustomer) monContext.getBean("ServiceCustomer");
		serviceCustomer.sauve(new Customer((long) 1, "raoul", "mail", "adresse"));
	
	}
	
}