package com.spring_boot_proyect.stories_proyect.service;

import com.spring_boot_proyect.stories_proyect.model.StoryFragmentEntity;

public interface IStoryFragmentService {
    public StoryFragmentEntity findById(Long id);
    public StoryFragmentEntity save(StoryFragmentEntity storyFragment);
}
