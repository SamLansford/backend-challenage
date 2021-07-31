package service;

import com.example.backendchallenage.models.Person;
import com.example.backendchallenage.repositories.PersonRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class personService {

    @Autowired private PersonRepo repo;

    public List<Person> listAll() {
        return (List<Person>) repo.findAll();
    }
}
