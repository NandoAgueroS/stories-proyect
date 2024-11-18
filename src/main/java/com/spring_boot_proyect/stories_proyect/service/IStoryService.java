package com.spring_boot_proyect.stories_proyect.service;

import com.spring_boot_proyect.stories_proyect.model.StoryEntity;

import java.util.List;

public interface IStoryService {
    public StoryEntity findById(Long id);
    public List<StoryEntity> findAll();
    public StoryEntity save(StoryEntity story);
    public StoryEntity update(StoryEntity story);
    public boolean delete(Long id);
    public List<StoryEntity> findByRoomCode(Long code);
}
