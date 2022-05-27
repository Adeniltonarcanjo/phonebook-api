package com.github.adeniltonarcanjo.springboot.controllers;

import com.github.adeniltonarcanjo.springboot.model.User;
import org.springframework.web.bind.annotation.*;

import javax.swing.text.html.Option;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/users")
public class UserController {


    private List<User> listUser= new ArrayList<>();

    @GetMapping("/{id}")
    public User user(@PathVariable("id") Long id ) {
        Optional <User> userFind=listUser.stream().filter(user->user.getId()==id).findFirst();

        if (userFind.isPresent()){
            return userFind.get();
        }else {
            return null;
        }


    }

    @PostMapping("/")
    public User user(@RequestBody User user){
        listUser.add(user);
        return user;
    }

    @GetMapping("/list")
    public List<User> userList(){
        return listUser;
    }


}
