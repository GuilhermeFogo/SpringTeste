package payroll.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import payroll.modal.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long> {

}
