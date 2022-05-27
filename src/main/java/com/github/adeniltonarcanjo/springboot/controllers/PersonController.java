package com.github.adeniltonarcanjo.springboot.controllers;

import com.github.adeniltonarcanjo.springboot.model.Person;
import com.github.adeniltonarcanjo.springboot.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/persons")
public class PersonController {


    @Autowired
    private PersonRepository personRepository;

    @GetMapping("/{id}")
    public Person user(@PathVariable("id") Long id ) {
        Optional <Person> userFind= this.personRepository.findById(id);

        if (userFind.isPresent()){
            return userFind.get();
        }else {
            return null;
        }
    }

    @PostMapping("/")
    public Person user(@RequestBody Person user){
        return this.personRepository.save(user);

    }

    @GetMapping("/list")
    public List<Person> userList(){
        return this.personRepository.findAll();
    }

    @GetMapping("/list/{id}")
    public List<Person> userListMoreThan(@PathVariable("id") Long id){
        return this.personRepository.findByIdGreaterThan(id);
    }

    @GetMapping("/findByName/{name}")
    public List<Person> userListName(@PathVariable("name") String name){
        return this.personRepository.findByName(name);
    }

    @GetMapping("/listOrder")
    public List<Person> userListNameOrder(){
        return this.personRepository.findByOrderByName();
    }


}
