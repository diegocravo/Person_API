package one.digitalinnovation.presonapi.service;

import one.digitalinnovation.presonapi.dto.MessageResponseDTO;
import one.digitalinnovation.presonapi.dto.request.PersonDTO;
import one.digitalinnovation.presonapi.entity.Person;
import one.digitalinnovation.presonapi.mapper.PersonMapper;
import one.digitalinnovation.presonapi.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class PersonService {

    private PersonRepository personRepository;
    
    private final PersonMapper personMapper = PersonMapper.INSTANCE;

    @Autowired
    public PersonService(PersonRepository personRepository){
        this.personRepository = personRepository;
    }

    public MessageResponseDTO createPerson( PersonDTO personDTO ){
        Person personToSave = personMapper.toModel(personDTO);

        Person savedPerson = personRepository.save(personToSave);
        return MessageResponseDTO
                .builder()
                .message("Created person with ID " + savedPerson.getId())
                .build();
    }

}
