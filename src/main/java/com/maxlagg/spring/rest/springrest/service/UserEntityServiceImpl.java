package com.maxlagg.spring.rest.springrest.service;

import com.maxlagg.spring.rest.springrest.entity.UserEntity;
import com.maxlagg.spring.rest.springrest.repository.UserEntityRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class UserEntityServiceImpl implements UserEntityService {
    @Autowired
    private UserEntityRepo userEntityRepo;
    @Override
    public List<UserEntity> getAllUsers() {
        return userEntityRepo.findAll();
    }

    @Override
    public void saveUser(UserEntity userEntity) {
        userEntityRepo.save(userEntity);
    }

    @Override
    public UserEntity getUser(int id) {
        UserEntity user = null;
        Optional<UserEntity> optional = userEntityRepo.findById(id);
        if(optional.isPresent()){
            user = optional.get();
        }
        return user;
    }

    @Override
    public void deleteUser(int id) {
        userEntityRepo.deleteById(id);
    }
}
