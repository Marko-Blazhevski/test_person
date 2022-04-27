package mk.ukim.finki.testt.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Person {

    @Id
    @GeneratedValue
    private Long Id;

    private String name;

    private String surname;

    private Integer age;

    public Person(String name, String surname, Integer age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public Person() {

    }
}
