package ir.omidashouri.twodatabase.services;

import ir.omidashouri.twodatabase.entity.oracle.Person;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Omid Ashouri on 12/30/24 2:29 PM
 */

public interface PersonService {

    Person addPerson(Person person);

    Person updatePerson(Person person);

    void erasePerson(Long id);

    List<Person> getPersons();

    String getGreeting(String name);


}
