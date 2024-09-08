package br.com.psiplanner.repository;

import br.com.psiplanner.domain.person.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository extends JpaRepository<Person, Long> {

    Person findByEmail(String email);

    Boolean existsByEmail(String email);
}
