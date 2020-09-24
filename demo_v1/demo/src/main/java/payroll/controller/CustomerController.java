package payroll.controller;

import java.util.Collection;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import payroll.modal.Customer;
import payroll.services.ICustomerService;

@RestController
@RequestMapping("api/Cliente")
public class CustomerController {
	
	private final ICustomerService customerservice;
	
	public CustomerController(ICustomerService customerservice) {
		this.customerservice= customerservice;
	}
	
	@GetMapping("/")
	public Collection<Customer> All(){
		return this.customerservice.VerTodos();
	}
	
	@PostMapping("/")
	public void createCustomer(@RequestBody Customer customer){
		this.customerservice.salvar(customer);;
	}
}
