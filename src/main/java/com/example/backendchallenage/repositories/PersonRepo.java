package com.example.backendchallenage.repositories;

import com.example.backendchallenage.models.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepo extends JpaRepository<Person, Long> {
}
