package com.springboot.blog.repository;

import com.springboot.blog.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface UserRepo extends JpaRepository<UserEntity, Long> {
    @Query(" From UserEntity where actFlg = 'Y' ")
    public List<UserEntity> getAllUsers();
}
