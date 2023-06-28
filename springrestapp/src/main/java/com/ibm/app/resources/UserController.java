package com.ibm.app.resources;

import com.ibm.app.resources.entity.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {

    //@GetMapping(produces = {"application/json"})
    @GetMapping
    public User findAll() {
        return new User(1, "Subramanian");
    }

    //How to send list of Users
    @GetMapping("/list")
    public List<User> list() {
        return List.of(new User(1, "Subramanian"), new User(2, "Ram"));
    }
}
