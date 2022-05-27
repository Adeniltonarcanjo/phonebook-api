package com.github.adeniltonarcanjo.springboot.controllers;

import com.github.adeniltonarcanjo.springboot.model.User;
import com.github.adeniltonarcanjo.springboot.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.swing.text.html.Option;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/users")
public class UserController {


    private List<User> listUser= new ArrayList<>();

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/{id}")
    public User user(@PathVariable("id") Long id ) {
        Optional <User> userFind= this.userRepository.findById(id);

        if (userFind.isPresent()){
            return userFind.get();
        }else {
            return null;
        }
    }

    @PostMapping("/")
    public User user(@RequestBody User user){
        return this.userRepository.save(user);

    }

    @GetMapping("/list")
    public List<User> userList(){
        return this.userRepository.findAll();
    }

    @GetMapping("/list/{id}")
    public List<User> userListMoreThan(@PathVariable("id") Long id){
        return this.userRepository.findAllMoreThan(id);
    }


}
