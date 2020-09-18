package payroll.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import payroll.modal.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long>{

	Employee findByName(String name);
}
