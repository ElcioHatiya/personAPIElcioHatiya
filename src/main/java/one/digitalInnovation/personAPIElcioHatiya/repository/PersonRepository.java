package one.digitalInnovation.personAPIElcioHatiya.repository;

import one.digitalInnovation.personAPIElcioHatiya.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long> {

}
