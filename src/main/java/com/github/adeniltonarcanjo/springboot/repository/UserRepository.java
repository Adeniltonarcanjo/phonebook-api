package com.github.adeniltonarcanjo.springboot.repository;

import com.github.adeniltonarcanjo.springboot.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface UserRepository extends JpaRepository<User,Long> {

    @Query("SELECT u from User u where u.id > :id")
    public List<User> findAllMoreThan(@Param("id") Long id);

    // using jpa
    // GreaterThan is on specification
    public List<User>findByIdGreaterThan(Long Id);

    public List<User>findByName(String Name);


}
