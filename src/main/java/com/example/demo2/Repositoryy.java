package com.example.demo2;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface Repositoryy extends JpaRepository<Person,Integer> {

    // use this method or query annotation to search for any specific field
   // List<Person> findByfirstnameContaining(String name);
}
