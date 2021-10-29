package one.digitalInnovation.personAPIElcioHatiya;

import one.digitalInnovation.personAPIElcioHatiya.dto.MessageResponse;
import one.digitalInnovation.personAPIElcioHatiya.entity.Person;
import one.digitalInnovation.personAPIElcioHatiya.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

@SpringBootApplication

@RestController
@RequestMapping("/api/v1/people")
public class PersonApiElcioHatiyaApplication {

	public static void main(String[] args) {
		SpringApplication.run(PersonApiElcioHatiyaApplication.class, args);
	}

	private PersonRepository personRepository;

	@Autowired
	public PersonApiElcioHatiyaApplication(PersonRepository personRepository) {
		this.personRepository = personRepository;
	}

	@PostMapping
	public MessageResponse createPerson(@RequestBody Person person) {
		Person savedPerson = personRepository.save(person);
		return MessageResponse
				.builder()
				.message("Created Person with ID" + savedPerson.getId())
				.build();
	}
}
