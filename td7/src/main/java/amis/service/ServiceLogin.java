package amis.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import amis.entity.Customer;
import amis.entity.Login;
import amis.repository.LoginDao;

@Service("ServiceLogin")
public class ServiceLogin {
	
	@Autowired
	private LoginDao loginDao;

	public LoginDao getLoginDao() {
		return loginDao;
	}

	public void setLoginDao(LoginDao loginDao) {
		this.loginDao = loginDao;
	}

	
	public boolean isValid(Login login) {
	    for (Login l : loginDao.findAll()) {
	        if (l.getMail().equals(login.getMail())
	            && l.getPassword().equals(login.getPassword())) {
	            return true;
	        }
	    }
	    return false;
	}

	
	public void sauve(Login l) {
		loginDao.save(l);
	}
	
	
}
