package com.spring_boot_proyect.stories_proyect.service;

import com.spring_boot_proyect.stories_proyect.model.StoryEntity;
import com.spring_boot_proyect.stories_proyect.repository.IStoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class StoryService implements IStoryService{
    @Autowired
    private IStoryRepository iStoryRepository;
    @Override
    public StoryEntity findById(Long id) {
        StoryEntity story = iStoryRepository.findById(id).orElse(null);
        return story;
    }

    @Override
    public List<StoryEntity> findAll() {
        List<StoryEntity> stories = iStoryRepository.findAll();
        return stories;
    }

    @Override
    public StoryEntity save(StoryEntity story) {
        StoryEntity savedStory = iStoryRepository.save(story);
        return savedStory;
    }

    @Override
    public StoryEntity update(StoryEntity story) {
        StoryEntity updatedStory = iStoryRepository.save(story);
        return updatedStory;
    }

    @Override
    public boolean delete(Long id) {
        iStoryRepository.deleteById(id);
        boolean deleted = iStoryRepository.findById(id).orElse(null)==null ? true : false;
        return deleted;
    }

    @Override
    public List<StoryEntity> findByRoomCode(Long code) {
        return iStoryRepository.findAllByRoomCode(code);
    }
}
