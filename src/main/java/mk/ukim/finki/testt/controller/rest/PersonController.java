package mk.ukim.finki.testt.controller.rest;

import mk.ukim.finki.testt.model.Person;
import mk.ukim.finki.testt.service.personService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/person")
public class PersonController {

    private final personService personService;

    public PersonController(mk.ukim.finki.testt.service.personService personService) {
        this.personService = personService;
    }

    @GetMapping
    public List<Person> findAll() {
        return this.personService.findAll();
    }

}
