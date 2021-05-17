package one.digitalinnovation.presonapi.repository;

import one.digitalinnovation.presonapi.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long> {



}
