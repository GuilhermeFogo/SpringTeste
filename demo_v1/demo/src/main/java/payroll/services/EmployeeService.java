package payroll.services;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import payroll.modal.Employee;
import payroll.repository.EmployeeRepository;

@Service
public class EmployeeService implements IEmployeeService {
	
	private final EmployeeRepository repository;
	
	@Autowired
	public EmployeeService(EmployeeRepository repository) {
		this.repository = repository;
	}

	@Override
	public void Save(Employee employee) {
		repository.save(employee);
	}

	@Override
	public void Delete(Employee employee) {
		repository.delete(employee);
	}

	@Override
	public Collection<Employee> VerTodos() {
		return repository.findAll();
	}
	
	
}
