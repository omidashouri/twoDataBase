package ir.omidashouri.twodatabase.controllers;

import ir.omidashouri.twodatabase.entity.oracle.Person;
import ir.omidashouri.twodatabase.services.PersonServiceImpl;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/persons")
public class PersonController {

    private final PersonServiceImpl personService;

    public PersonController(PersonServiceImpl personService) {
        this.personService = personService;
    }

    @PostMapping
    public Person addPerson(@RequestBody Person person) {
        Person person1 = personService.addPerson(person);
        return person1;
    }

    @PutMapping
    public Person updatePerson(@RequestBody @Valid Person person) {
        Person person1 = personService.updatePerson(person);
        return person1;
    }

    @DeleteMapping("/{id}")
    public void erasePerson(@PathVariable Long id) {
        personService.erasePerson(id);
    }

    @GetMapping
    public List<Person> getPersons(){
        List<Person> persons = personService.getPersons();
        return persons;
    }

    @GetMapping("/greeting/{name}")
    public String getGreeting(@PathVariable String name) {
        return personService.getGreeting(name);
    }
}
