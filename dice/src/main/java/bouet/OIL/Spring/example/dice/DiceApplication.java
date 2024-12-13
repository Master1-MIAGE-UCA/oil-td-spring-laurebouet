package bouet.OIL.Spring.example.dice;

import org.springframework.boot.SpringApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class DiceApplication {
	@GetMapping("/")
	public String home(){
		return "hello world";
	}
	public static void main(String[] args) {
		SpringApplication.run(DiceApplication.class, args);
	}

}
