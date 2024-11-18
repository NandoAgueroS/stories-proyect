package com.spring_boot_proyect.stories_proyect.repository;

import com.spring_boot_proyect.stories_proyect.model.StoryEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IStoryRepository extends JpaRepository<StoryEntity, Long> {
    List<StoryEntity> findAllByRoomCode(Long code);
}
