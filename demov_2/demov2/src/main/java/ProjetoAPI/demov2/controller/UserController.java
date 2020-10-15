package ProjetoAPI.demov2.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:8080/", maxAge = 3600, allowCredentials = "true")
@RequestMapping("/auth")
public class UserController {
	
	@CrossOrigin
	@GetMapping()
	public List<String> LookAll(){
		
		List<String> a = new ArrayList<String>();
		a.add("dssiojcdiosjciofd");
		a.add("dssiojcdiosjciofd");
		a.add("dssiojcdiosjciofd");
		a.add("dssiojcdiosjciofd");
		return a;
	}
}
