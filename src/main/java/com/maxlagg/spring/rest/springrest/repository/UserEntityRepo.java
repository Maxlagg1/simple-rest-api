package com.maxlagg.spring.rest.springrest.repository;


import com.maxlagg.spring.rest.springrest.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserEntityRepo extends JpaRepository<UserEntity, Integer> {

}
