package payroll.controller;

import java.util.Collection;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import payroll.error.EmployeeNotFoundException;
import payroll.modal.Employee;
import payroll.repository.EmployeeRepository;
import payroll.services.IEmployeeService;

@RestController
@RequestMapping("api/employees")
public class EmployeeController {

	private final EmployeeRepository repository;
	private final IEmployeeService service;
	
	
	public EmployeeController(EmployeeRepository repository, IEmployeeService service) {
		this.repository= repository;
		this.service = service;
	}
	
	@GetMapping("/")
	public Collection<Employee> getAll() {
		return service.VerTodos();
	}
	
	@PostMapping("/")
	public void newEmployee(@RequestBody Employee employee) {
		repository.save(employee);
	}
	
	@GetMapping("{id}")
	public Employee one (@PathVariable Long id) {
		return repository.findById(id).orElseThrow(()->
			new EmployeeNotFoundException(id)
		);
	}
	
	@GetMapping("/name/{name}")
	public Employee two (@PathVariable String name) {
		return repository.findByName(name);
	}
	
	@PutMapping("/")
	public Employee replaceEmployee(@RequestBody Employee newEmployee, @PathVariable Long id) {
		return repository.findById(id)
				.map(employee ->{
					employee.setName(newEmployee.getName());
					employee.setRole(newEmployee.getRole());
					return repository.save(employee);
				}).orElseGet(()->{
					newEmployee.setId(id);
					return repository.save(newEmployee);
				});
	}
	
	@DeleteMapping("{id}")
	public void deleteEmployee(@PathVariable Long id) {
		repository.deleteById(id);
	}
}

