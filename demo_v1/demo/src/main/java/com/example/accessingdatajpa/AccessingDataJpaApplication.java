package com.example.accessingdatajpa;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class AccessingDataJpaApplication {
	private static final Logger log = 
			LoggerFactory.getLogger(AccessingDataJpaApplication.class);
	
	public static void main(String[] args) {
		SpringApplication.run(AccessingDataJpaApplication.class);
	}
	@Bean
	public CommandLineRunner demo (CustomerRepository repository) {
		return (args)->{
			repository.save(new Customer("Jack", "Bauer"));
		    repository.save(new Customer("Chloe", "O'Brian"));
		    repository.save(new Customer("Kim", "Bauer"));
		    repository.save(new Customer("David", "Palmer"));
		    repository.save(new Customer("Michelle", "Dessler"));
		    repository.save(new Customer("Guilherme", "Dessler"));
		    
		    /*log.info("Customer found whith findall()");
		    log.info("------------------------------");
		    repository.findAll().forEach(x->{
		    	log.info(x.toString());
		    });
		    log.info("");
		    
		    Customer customer = repository.findById(1L);
		    log.info("Customer found with findById(1L):");
		    log.info("--------------------------------");
		    log.info(customer.toString());
		    log.info("");
		    
		    log.info("Customerfound whith findByLastname(Bauer)");
		    log.info("-----------------------------------------");
		    repository.findByLastName("Bauer").forEach(x->{
		    	log.info(x.toString());
		    });
		    log.info("");
		    */
		    
		    log.info("Customer found with findByFirstNameAndLastName");
		    log.info("-----------------------------------------------");
		    Customer x = repository.findByFirstNameAndLastName("Guilherme", "Dessler");
		    log.info(x.toString());
		    log.info("");
		};
	}
}
