package com.springboot.blog.serviceImpl;

import com.springboot.blog.entity.UserEntity;
import com.springboot.blog.repository.UserRepo;
import com.springboot.blog.responseModel.ResponseModel;
import com.springboot.blog.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepo userRepo;

    public UserServiceImpl(UserRepo userRepo) {
        this.userRepo = userRepo;
    }

    @Override
    public ResponseModel save(UserEntity userEntity) {
        //business logic
        UserEntity entity = userRepo.save(userEntity);

        ResponseModel model = new ResponseModel();
        if(entity.getId()>0){
            model.setOutCode(String.valueOf(entity.getId()));
            model.setOutMessage("Save Successfully");
        }

        return model;
    }

    @Override
    public List<UserEntity> getAllUsers() {
        return userRepo.getAllUsers();
    }
}
