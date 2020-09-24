package payroll.modal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "Funcionario")
public class Employee {
	
	private @Id @GeneratedValue Long id;
	@Column(name = "nome")
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
