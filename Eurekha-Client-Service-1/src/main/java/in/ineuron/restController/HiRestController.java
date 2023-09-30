package in.ineuron.restController;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HiRestController {
	
	@GetMapping("/himsg/{name}")
	public String msg(@PathVariable("name") String name) {
		
		String himsg = "Hi";
		
		return himsg +" "+ name + " How r u?";
	}
}
