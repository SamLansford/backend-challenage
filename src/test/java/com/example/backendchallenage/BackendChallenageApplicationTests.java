package com.example.backendchallenage;

import com.example.backendchallenage.models.Person;
import com.example.backendchallenage.repositories.PersonRepo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.data.cassandra.DataCassandraTest;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.annotation.Rollback;

@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@Rollback(value = false)
class BackendChallenageApplicationTests {

    @Autowired private PersonRepo repo;

    @Test
    public void testAddNew() {
        Person person = new Person();

    }
}
