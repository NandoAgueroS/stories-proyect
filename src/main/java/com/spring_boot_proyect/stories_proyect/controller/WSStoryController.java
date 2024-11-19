package com.spring_boot_proyect.stories_proyect.controller;

import com.spring_boot_proyect.stories_proyect.model.StoryEntity;
import com.spring_boot_proyect.stories_proyect.model.StoryFragmentEntity;
import com.spring_boot_proyect.stories_proyect.service.IStoryFragmentService;
import com.spring_boot_proyect.stories_proyect.service.IStoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
public class WSStoryController {
    @Autowired
    private SimpMessagingTemplate messagingTemplate;
    @Autowired
    private IStoryService iStoryService;
    @MessageMapping("/add-fragment")
    public void addFragment(StoryFragmentEntity storyFragment){
        System.out.println(storyFragment);
        /*
        StoryEntity story = storyFragment.getStory();
        story.getStoryFragments().add(storyFragment);
        story= iStoryService.update(story);
        Long roomCode = story.getRoom().getCode();
        messagingTemplate.convertAndSend("/topic/room/" + roomCode,storyFragment);*/
    }
}
