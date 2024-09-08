package br.com.psiplanner.controller;

import br.com.psiplanner.domain.person.Person;
import br.com.psiplanner.service.PersonService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/person")
public class PersonController {

    private final PersonService personService;

    public PersonController(PersonService personService) {
        this.personService = personService;
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Person> findById(@PathVariable("id") Long person_id) {
        Person person = personService.findById(person_id);
        if (person == null)
            return ResponseEntity.notFound().build();
        else
            return ResponseEntity.ok().body(person);
    }

    @PostMapping
    public ResponseEntity<Person> create(@RequestBody Person person) {
        person = personService.save(person);
        return ResponseEntity.ok().body(person);
    }
}
