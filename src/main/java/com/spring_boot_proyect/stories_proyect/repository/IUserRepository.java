package com.spring_boot_proyect.stories_proyect.repository;

import com.spring_boot_proyect.stories_proyect.model.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IUserRepository extends JpaRepository<UserEntity, Long> {
}
