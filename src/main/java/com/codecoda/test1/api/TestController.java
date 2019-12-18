package com.codecoda.test1.api;

import com.codecoda.test1.model.User;
import com.codecoda.test1.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Autowired
    UserRepository userRepository;

    @GetMapping
    public String getResponse() {
        User user1 = new User(1, "name", "email", 13);
        userRepository.save(user1);
        return "<h1>Hello!</h1>";
    }
}
