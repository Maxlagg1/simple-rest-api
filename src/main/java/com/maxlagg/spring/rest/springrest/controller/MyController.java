package com.maxlagg.spring.rest.springrest.controller;

import com.maxlagg.spring.rest.springrest.entity.UserEntity;
import com.maxlagg.spring.rest.springrest.service.UserEntityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class MyController {

    @Autowired
    private UserEntityService userEntityService;

    @GetMapping("/users")
    public List<UserEntity> showAllUsers() {

        return userEntityService.getAllUsers();
    }

    @GetMapping("/users/{id}")
    public UserEntity getUser(@PathVariable int id) {
        return userEntityService.getUser(id);
    }

    @PostMapping("/users")
    public UserEntity addNewUser(@RequestBody UserEntity userEntity){
        userEntityService.saveUser(userEntity);
        return userEntity;
    }
    @DeleteMapping("/users/{id}")
    public String deleteUser(@PathVariable int id){
        userEntityService.deleteUser(id);
        return "User with id = " + id + "was deleted";
    }

    @PutMapping("/users")
    public UserEntity updateUser(@RequestBody UserEntity userEntity) {
        userEntityService.saveUser(userEntity);
        return userEntity;
    }
}
