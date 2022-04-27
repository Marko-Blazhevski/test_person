package mk.ukim.finki.testt.config;

import mk.ukim.finki.testt.service.personService;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class dataIntializer {

    private final personService personService;

    public dataIntializer(mk.ukim.finki.testt.service.personService personService) {
        this.personService = personService;
    }

    @PostConstruct
    public void initData() {

        this.personService.save("Marko","Blazhevski" , 21);
        this.personService.save("David" , "Blazhevski" , 20);
    }
}
