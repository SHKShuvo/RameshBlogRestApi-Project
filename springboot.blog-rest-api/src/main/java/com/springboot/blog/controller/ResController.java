package com.springboot.blog.controller;

import com.springboot.blog.entity.UserEntity;
import com.springboot.blog.responseModel.ResponseModel;
import com.springboot.blog.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/rest-api/")
public class ResController {
    @Autowired
    private UserService userService;
    @PostMapping("/save")
    @ResponseBody
    public ResponseModel save(@RequestBody UserEntity userEntity){
        return userService.save(userEntity);
    }

    @GetMapping("/users")
    @ResponseBody
    public List<UserEntity> getAllUsers(){
        return userService.getAllUsers();
    }
}
