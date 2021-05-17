package one.digitalinnovation.presonapi.controller;


import one.digitalinnovation.presonapi.dto.MessageResponseDTO;
import one.digitalinnovation.presonapi.dto.request.PersonDTO;
import one.digitalinnovation.presonapi.entity.Person;
import one.digitalinnovation.presonapi.service.PersonService;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/people")
public class PersonController {

    private PersonService personService;

    @Autowired
    public PersonController(PersonService personService){
        this.personService = personService;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public MessageResponseDTO createPerson(@RequestBody @Valid PersonDTO personDTO ){
        return personService.createPerson(personDTO);
    }

    @GetMapping
    public List<PersonDTO> listAll(){
    	return personService.listAll();
    }
    
}
