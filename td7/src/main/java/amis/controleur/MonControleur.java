package amis.controleur;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import amis.entity.Customer;
import amis.entity.Login;
import amis.service.ServiceCustomer;
import amis.service.ServiceLogin;

@Controller
public class MonControleur {
	
	@Autowired
	private ServiceCustomer serviceCustomer;
	
	@Autowired
	private ServiceLogin serviceLogin;
	
	
	@RequestMapping("/")
	public String home(Model model) {
		return "redirect:/login";
	}
	
	
	@RequestMapping("/index")
	public String affiche(Model model) {
		model.addAttribute("customer", new Customer());
	    model.addAttribute("listCustomer", serviceCustomer.listAll());
		return "index";
	}

	@RequestMapping("/delete")
	public String deleteCustomerForm(@RequestParam long id) {
		serviceCustomer.delete(id);
		return "redirect:/index";
	}
	
	
	@RequestMapping("/save")
	public String saveCustomer(@ModelAttribute("customer") Customer customer) {
		serviceCustomer.sauve(customer);
		
		return "redirect:/index";
	}
	
	@RequestMapping("/edit")
	public String editCustomer(@RequestParam long id, Model model) {
		Optional<Customer> customer = serviceCustomer.findById(id);
        model.addAttribute("customer", customer);
        return "newCustomer";
	}
	
	@RequestMapping("/add")
	public String addCustomerForm(Model model) {
	    model.addAttribute("customer", new Customer());
	    return "newCustomer";
	}
	
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String loginForm(Login login, Model model) {
		if (serviceLogin.isValid(login)) {
			return "redirect:/index";
		} else {
			return "login";
		}
		
	}
	
	
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String showLogin(Model model) {
	    model.addAttribute("login", new Login());
	    return "login";
	}

	
}
