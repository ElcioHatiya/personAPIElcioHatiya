package one.digitalInnovation.personAPIElcioHatiya;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication

@RestController
@RequestMapping("/api/v1/people")
public class PersonApiElcioHatiyaApplication {

	public static void main(String[] args) {
		SpringApplication.run(PersonApiElcioHatiyaApplication.class, args);
	}
	@GetMapping
	public String getBook() {

		return "TÔ na nuvem BB! ...primeiro deploy a gente nunca esquece ";
	}
}
