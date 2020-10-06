package payroll.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import payroll.modal.Customer;

@Repository
public interface IRepositoryCustomer extends JpaRepository<Customer, Long>  {
	
}
