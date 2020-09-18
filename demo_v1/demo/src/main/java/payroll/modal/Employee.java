package payroll.modal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Employee {
	
	private @Id @GeneratedValue Long id;
	private String name;
	private String role;
	
	public Employee() {
		super();
	}

	public Employee(String name, String role) {
		super();
		this.name = name;
		this.role = role;
	}
	
	
	

}
