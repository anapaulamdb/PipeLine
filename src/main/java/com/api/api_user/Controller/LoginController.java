package com.api.api_user.Controller;

import com.api.api_user.Entity.User;
import com.api.api_user.Repository.UserRepository;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.AllArgsConstructor;


//Pesquisar SPRINGBOOT JPA

@RestController
@AllArgsConstructor
@RequestMapping("/user")

public class LoginController {
    UserRepository userRepository;
    @PutMapping("login")
    public String login(@RequestBody User user)
    { 
        
            return "lol";
    }
    
    
}
