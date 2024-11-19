package com.spring_boot_proyect.stories_proyect.service;

import com.spring_boot_proyect.stories_proyect.model.StoryFragmentEntity;
import com.spring_boot_proyect.stories_proyect.repository.IStoryFragmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StoryFragmentService implements IStoryFragmentService {
    @Autowired
    private IStoryFragmentRepository iStoryFragmentRepository;
    @Override
    public StoryFragmentEntity findById(Long id) {
        StoryFragmentEntity storyFragment = iStoryFragmentRepository.findById(id).orElse(null);
        return storyFragment;
    }

    @Override
    public StoryFragmentEntity save(StoryFragmentEntity storyFragment) {
        StoryFragmentEntity savedStoryFragment = iStoryFragmentRepository.save(storyFragment);
        return savedStoryFragment;
    }

    @Override
    public List<StoryFragmentEntity> findAll() {
        return iStoryFragmentRepository.findAll();
    }
}
