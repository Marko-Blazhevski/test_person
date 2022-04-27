package mk.ukim.finki.testt.service;

import mk.ukim.finki.testt.model.Person;

import java.util.List;

public interface personService {

    List<Person> findAll();

    void save(String name , String surname , Integer age);


}
