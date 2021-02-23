package world.inetum.clinicalplatformol.demokeycloakauth.service;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/service")
public class DemoKeycloackService {
	
	@GetMapping
	public String hello() {
		return "Hello world service";
	}
}
