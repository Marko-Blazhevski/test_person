package mk.ukim.finki.testt.repository;

import mk.ukim.finki.testt.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface personRepository extends JpaRepository<Person, Long> {
}
