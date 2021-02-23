package world.inetum.clinicalplatformol.demokeycloakauth.model;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/model")
public class DemoKeycloackModel {
	
	@GetMapping
	public String hello() {
		return "Hello world model";
	}
}
