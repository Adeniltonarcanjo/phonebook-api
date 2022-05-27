package com.github.adeniltonarcanjo.springboot.repository;

import com.github.adeniltonarcanjo.springboot.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;


import java.util.List;


public interface PersonRepository extends JpaRepository<Person, Long> {

    @Query("SELECT u from Person u where u.id > :id")
    List<Person> findAllMoreThan(@Param("id") Long id);

    // using jpa
    // GreaterThan is on specification
    List<Person> findByIdGreaterThan(Long Id);

    List<Person> findByName(String Name);


}
