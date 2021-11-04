package one.digitalInnovation.service;


import one.digitalInnovation.personAPIElcioHatiya.dto.MessageResponse;
import one.digitalInnovation.personAPIElcioHatiya.entity.Person;
import one.digitalInnovation.personAPIElcioHatiya.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonService {

    private PersonRepository personRepository;

    @Autowired
    public PersonService(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    public MessageResponse createPerson(Person person) {
        Person savedPerson = personRepository.save(person);
        return MessageResponse
                .builder()
                .message("Created Person with ID" + savedPerson.getId())
                .build();
    }
}
