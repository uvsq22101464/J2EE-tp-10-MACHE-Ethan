package amis.repository;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import amis.entity.Login;

@Repository
public interface LoginDao extends CrudRepository<Login, Long>{

	
}
