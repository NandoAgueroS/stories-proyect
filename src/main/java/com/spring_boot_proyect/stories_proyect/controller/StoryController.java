package com.spring_boot_proyect.stories_proyect.controller;

import com.spring_boot_proyect.stories_proyect.model.StoryEntity;
import com.spring_boot_proyect.stories_proyect.model.StoryFragmentEntity;
import com.spring_boot_proyect.stories_proyect.service.IStoryFragmentService;
import com.spring_boot_proyect.stories_proyect.service.IStoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("/stories")
public class StoryController {
    @Autowired
    private IStoryService iStoryService;
    @Autowired
    private IStoryFragmentService iStoryFragmentService;

    @PostMapping("/create")
    public StoryEntity createStory(@RequestBody StoryEntity story){
        story.setCreatedAt(LocalDateTime.now());
        story.setUpdatedAt(LocalDateTime.now());
        story = iStoryService.save(story);
        return story;
    }
    @GetMapping("/find/{code}")
    public List<StoryEntity> getStories(@PathVariable Long code){
        List<StoryEntity> stories =  iStoryService.findByRoomCode(code);
        /*System.out.println(code);
        System.out.println(stories);*/
        return stories;
    }
    @GetMapping("/get-fragments")
    public List<StoryFragmentEntity> getFragments(){
        List<StoryFragmentEntity> fragments = iStoryFragmentService.findAll();
        /*System.out.println(code);
        System.out.println(stories);*/
        return fragments;
    }
    @PostMapping("/add-fragment")
    public StoryFragmentEntity addFragment(@RequestBody StoryFragmentEntity storyFragment){
        storyFragment.setCreatedAt(LocalDateTime.now());
        storyFragment = iStoryFragmentService.save(storyFragment);
        StoryEntity story = iStoryService.findById(storyFragment.getStory().getId());
        iStoryService.update(story);
        return storyFragment;
    }
}
