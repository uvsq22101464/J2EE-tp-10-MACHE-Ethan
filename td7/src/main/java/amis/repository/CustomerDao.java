package amis.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import amis.entity.Customer;

@Repository
public interface CustomerDao extends CrudRepository<Customer, Long>{

	//public void insert(T elem);
	//public void printAll();
	//public T findById(Long id);
	//public T findByName(String name);
	//public void delete(T elem);
	//public int count();
	
	
}
