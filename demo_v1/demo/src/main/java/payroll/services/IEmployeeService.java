package payroll.services;

import java.util.Collection;

import payroll.modal.Employee;

public interface IEmployeeService {
	void Save(Employee employee);
	void Delete(Employee employee);
	Collection<Employee> VerTodos();
}
