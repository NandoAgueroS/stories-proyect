package com.spring_boot_proyect.stories_proyect.controller;

import com.spring_boot_proyect.stories_proyect.model.UserEntity;
import com.spring_boot_proyect.stories_proyect.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private IUserService iUserService;

    @PostMapping("/create")
    private UserEntity createUser(@RequestBody UserEntity user){
        System.out.println(user.getUserName() +" "+ user.getCurrentRoom());
        user = iUserService.save(user);
        return user;
    }
}
