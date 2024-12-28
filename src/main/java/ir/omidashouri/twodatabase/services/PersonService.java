package ir.omidashouri.twodatabase.services;

import ir.omidashouri.twodatabase.entity.oracle.Person;
import ir.omidashouri.twodatabase.repository.oracle.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.Transactional;

import javax.sql.DataSource;
import java.util.List;
import java.util.Optional;

@Service
@Transactional(transactionManager = "transactionManagerOracle")
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
        return savedPerson;
    }

    public Person updatePerson(Person person) {
        return personRepository.save(person);
    }

    public void erasePerson(Long id) {
        Optional<Person> person = personRepository.findById(id);
        person.ifPresent(personRepository::delete);
    }

    public List<Person> getPersons(){
        return personRepository.findAll();
    }
}