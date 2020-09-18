package com.example.demo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClienteController {

	
	@GetMapping("/Cliente")
	public Collection<Cliente> getClientes(){
		List<Cliente> lista = new ArrayList<Cliente>();
		lista.add(new Cliente("Guilherme", "gui.fogo@teste.com"));
		return lista;
	}
}
