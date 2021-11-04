package one.digitalInnovation.personAPIElcioHatiya;

import one.digitalInnovation.personAPIElcioHatiya.dto.MessageResponse;
import one.digitalInnovation.personAPIElcioHatiya.entity.Person;
import one.digitalInnovation.personAPIElcioHatiya.repository.PersonRepository;
import one.digitalInnovation.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@SpringBootApplication

@RestController
@RequestMapping("/api/v1/people")
public class PersonApiElcioHatiyaApplication {

	private final PersonRepository personRepository;
	private PersonService personService;

	public static void main(String[] args) {
		SpringApplication.run(PersonApiElcioHatiyaApplication.class, args);
	}

	@Autowired
	public PersonApiElcioHatiyaApplication(PersonRepository personRepository) {
		this.personRepository = personRepository;
	}

		@PostMapping
		@ResponseStatus(HttpStatus.CREATED)
		public MessageResponse createPerson (@RequestBody Person person){
			return personService.createPerson(person);
		}

	@GetMapping
	public String getBook() {

		return "Deploy on Heroku OK!!!  Git push -> Auto Deploy  /ElcioHatiya";

	}

}
