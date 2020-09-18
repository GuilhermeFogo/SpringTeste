package payroll.fakedb;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import lombok.extern.slf4j.Slf4j;
import payroll.modal.Customer;
import payroll.modal.Employee;
import payroll.repository.CustomerRepository;
import payroll.repository.EmployeeRepository;

@Configuration
@Slf4j
public class LoadDatabase {
	@Bean
	CommandLineRunner initDataBase(EmployeeRepository repository, CustomerRepository repository2) {
		return args->{
			log.info("Preloading"+ repository.save(new Employee("Bilbo Baggins", "burglar")));
			log.info("Preloading"+ repository.save(new Employee("Frodo Baggins","thief")));
			repository2.save(new Customer("Guilherme","1234567","gui.fogo@teste.com"));
			log.info("DB em meroria OK");
		};
	}
}