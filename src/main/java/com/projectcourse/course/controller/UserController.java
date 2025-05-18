package com.projectcourse.course.controller;

import com.projectcourse.course.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class UserController {

    @GetMapping
    public ResponseEntity<User> findAll() {
        User user = new User( "Jessica", "jessica@gmail.com", "45962315", "123456");
        return ResponseEntity.ok().body(user);
    }
}
