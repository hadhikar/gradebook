package com.hadhikari.userservice.controller;

import com.hadhikari.userservice.model.User;
import com.hadhikari.userservice.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/api/user")
public class UserController {

    @Autowired
    private final UserService userService;

    @PostMapping("/save-user")
    public User saveUser(@RequestBody User user){
        return userService.saveUser(user);
    }

    @GetMapping("/get-user")
    public List<User> getUsers(){
        return userService.getUsers();
    }

    @PatchMapping("/update-user")
    public User updateUser(@RequestBody User user){
        return userService.updateUser(user);
    }
    @DeleteMapping("/delete-user/{id}")
    public void deleteUser(@PathVariable long id){
        userService.deleteUser(id);
    }



}
