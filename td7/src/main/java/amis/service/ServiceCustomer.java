package amis.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import amis.entity.Customer;
import amis.repository.CustomerDao;

@Service("ServiceCustomer")
public class ServiceCustomer {
	
	@Autowired
	private CustomerDao customerDao;

	public CustomerDao getCustomerDao() {
		return customerDao;
	}

	public void setCustomerDao(CustomerDao customerDao) {
		this.customerDao = customerDao;
	}
	
	public void sauve(Customer c) {
		customerDao.save(c);
	}
	
	public void delete(Long id) {
		customerDao.deleteById(id);
	}
	
	public List<Customer> listAll() {
		return (List<Customer>) customerDao.findAll();
	}
	
	public Optional<Customer> findById(Long id) {
		return customerDao.findById(id);
	}
	
	
}
