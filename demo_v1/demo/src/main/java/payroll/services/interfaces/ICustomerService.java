package payroll.services.interfaces;

import java.util.Collection;

import payroll.modal.Customer;

public interface ICustomerService {
	Collection<Customer> LookAll();
	void AddCustomer(Customer customer);
	Customer EditCustumer(Customer newCustomer ,long id);
	void DeleteCustomerById(long id);
}
