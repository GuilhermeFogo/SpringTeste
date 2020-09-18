package payroll.services;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import payroll.modal.Customer;
import payroll.repository.CustomerRepository;

@Service
public class CustomerService implements ICustomerService {

	private final CustomerRepository repository;
	
	@Autowired
	public CustomerService(CustomerRepository repository) {
		this.repository = repository;
	}
	
	@Override
	public Collection<Customer> VerTodos() {
		 return repository.findAll();
	}

}
