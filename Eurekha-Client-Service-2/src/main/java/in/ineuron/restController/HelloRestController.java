package in.ineuron.restController;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloRestController {
	
	@GetMapping("/hellomsg/{name}")
	public String msg(@PathVariable("name") String name) {
		
		String hellomsg = "Hello";
		
		return hellomsg +" "+ name + " How r u?";
	}
}
