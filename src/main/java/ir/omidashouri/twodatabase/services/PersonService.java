package ir.omidashouri.twodatabase.services;

import ir.omidashouri.twodatabase.entity.oracle.Person;
import ir.omidashouri.twodatabase.repository.oracle.PersonRepository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class PersonService {

    private final PersonRepository personRepository;

    public PersonService(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    public Person addPerson(Person person) {
        Person newPerson = new Person();
        newPerson.setName(person.getName());
        newPerson.setAge(person.getAge());
        Person savedPerson = personRepository.save(person);
        personRepository.flush();
        return savedPerson;
    }

    public void erasePerson(Long id) {
        Optional<Person> person = personRepository.findById(id);
        person.ifPresent(personRepository::delete);
    }

    public List<Person> getPersons(){
        return personRepository.findAll();
    }
}