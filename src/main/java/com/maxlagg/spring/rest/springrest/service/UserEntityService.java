package com.maxlagg.spring.rest.springrest.service;


import com.maxlagg.spring.rest.springrest.entity.UserEntity;

import java.util.List;

public interface UserEntityService {
    public List<UserEntity> getAllUsers();

    public void saveUser(UserEntity userEntity);

    public UserEntity getUser(int id);

    public void deleteUser(int id);
}
