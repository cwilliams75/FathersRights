package com.cwilliams.fathersrights.controllers;

import com.cwilliams.fathersrights.models.User;
import com.cwilliams.fathersrights.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

//Controller talks to the webPage and service
@RestController
public class UserController {

    UserService businessLogic;
    //This will allow me to use the service
    @Autowired
    public UserController(UserService businessLogic) {
        this.businessLogic = businessLogic;
    }
    //This is a way to find users
    @GetMapping("/findUser/{userId}")
    public ResponseEntity<?> findUser(@PathVariable Long userId){
        return new ResponseEntity<>(businessLogic.findUser(userId), HttpStatus.OK);
    }
    //This is a way to create users
    @PostMapping("/create")
    public ResponseEntity<User> createUser(@RequestBody User user){
        return new ResponseEntity<>(businessLogic.createUser(user), HttpStatus.CREATED);
    }

}
