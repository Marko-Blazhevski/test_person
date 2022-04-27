package mk.ukim.finki.testt.service.impl;

import mk.ukim.finki.testt.model.Person;
import mk.ukim.finki.testt.repository.personRepository;
import mk.ukim.finki.testt.service.personService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class personServiceImplementation implements personService {

    private final personRepository personRepository;

    public personServiceImplementation(mk.ukim.finki.testt.repository.personRepository personRepository) {
        this.personRepository = personRepository;
    }

    @Override
    public List<Person> findAll() {
        return this.personRepository.findAll();
    }

    @Override
    public void save(String name, String surname, Integer age) {
        this.personRepository.save(new Person(name,surname,age));
    }
}
