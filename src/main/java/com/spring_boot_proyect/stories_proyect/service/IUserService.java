package com.spring_boot_proyect.stories_proyect.service;

import com.spring_boot_proyect.stories_proyect.model.UserEntity;

import java.util.List;

public interface IUserService {
    public UserEntity save(UserEntity user);
    public UserEntity update(UserEntity user);
    public UserEntity findById(Long id);
    public boolean deleteById(Long id);
    public List<UserEntity> findAll();
}
