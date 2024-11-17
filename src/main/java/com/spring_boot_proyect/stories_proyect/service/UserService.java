package com.spring_boot_proyect.stories_proyect.service;

import com.spring_boot_proyect.stories_proyect.model.UserEntity;
import com.spring_boot_proyect.stories_proyect.repository.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService implements IUserService{
    @Autowired
    private IUserRepository iUserRepository;
    @Override
    public UserEntity save(UserEntity user) {
        UserEntity savedUser = iUserRepository.save(user);
        return savedUser;
    }

    @Override
    public UserEntity update(UserEntity user) {
        UserEntity updatedUser = iUserRepository.save(user);
        return updatedUser;
    }

    @Override
    public UserEntity findById(Long id) {
        UserEntity user = iUserRepository.findById(id).orElse(null);
        return user;
    }

    @Override
    public boolean deleteById(Long id) {
        iUserRepository.deleteById(id);
        boolean deleted = iUserRepository.findById(id).orElse(null) == null ? true : false;
        return deleted;
    }

    @Override
    public List<UserEntity> findAll() {
        List<UserEntity> users = iUserRepository.findAll();
        return users;
    }
}
