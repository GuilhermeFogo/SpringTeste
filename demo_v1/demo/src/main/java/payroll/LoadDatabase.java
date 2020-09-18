package payroll;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import lombok.extern.slf4j.Slf4j;

@Configuration
@Slf4j
public class LoadDatabase {

	@Bean
	CommandLineRunner initDataBase(EmployeeRepository repository) {
		return args ->{
			log.info();
			//repository.save(new Employee("Guilherme","teste"));
		};
	}
}
