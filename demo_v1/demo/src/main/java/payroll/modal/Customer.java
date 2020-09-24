package payroll.modal;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "Cliente")
public class Customer {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(name = "nome")
	private String name;
	private String telefone;
	private String email;
	
	public Customer() {
		
	}
	
	public Customer(String name, String tel, String email) {
		this.name = name;
		this.telefone = tel;
		this.email = email;
	}
}
