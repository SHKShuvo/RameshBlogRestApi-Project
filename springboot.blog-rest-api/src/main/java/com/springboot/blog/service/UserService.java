package com.springboot.blog.service;

import com.springboot.blog.entity.UserEntity;
import com.springboot.blog.responseModel.ResponseModel;

import java.util.List;

public interface UserService {

    ResponseModel save(UserEntity userEntity);
    List<UserEntity> getAllUsers();
}
