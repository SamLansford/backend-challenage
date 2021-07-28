package com.example.backendchallenage;

import com.example.backendchallenage.models.Person;
import com.example.backendchallenage.repositories.PersonRepo;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.data.cassandra.DataCassandraTest;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.annotation.Rollback;

import java.util.Optional;


@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@Rollback(value = false)
class BackendChallengeApplicationTests {

    @Autowired private PersonRepo repo;

    @Test
    public void testAddNew() {
        Person person = new Person();
        person.setName("Cat");
        person.setAge("20");

        Person savedPerson = repo.save(person);

        Assertions.assertThat(savedPerson).isNotNull();
        Assertions.assertThat(savedPerson.getId()).isGreaterThan(0);
    }

    @Test
    public void testAll() {
       Iterable<Person> people = repo.findAll();
       Assertions.assertThat(people).hasSizeGreaterThan(0);

       for (Person person : people) {
           System.out.println(person);
       }
    }

    @Test
    public void testUpdate() {
        long personId = 1;
        Optional<Person> optionalPerson = repo.findById(personId);
        Person person = optionalPerson.get();
        person.setName("kate");
        repo.save(person);

        Person updatedPerson = repo.findById(personId).get();
        Assertions.assertThat(updatedPerson.getName()).isEqualTo("kate");
    }

    @Test
    public void testGet() {
        long personId = 2;
        Optional<Person> optionalPerson = repo.findById(personId);
        Assertions.assertThat(optionalPerson).isPresent();
        System.out.println(optionalPerson.get());
    }

    @Test
    public void testDelete() {
        long userId = 1;
        repo.deleteById(userId);
        Optional<Person> optionalPerson = repo.findById(userId);
        Assertions.assertThat(optionalPerson).isNotPresent();

    }
}
