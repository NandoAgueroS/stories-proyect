package com.spring_boot_proyect.stories_proyect.controller;

import com.spring_boot_proyect.stories_proyect.dto.StoryRoomDTO;
import com.spring_boot_proyect.stories_proyect.model.StoryEntity;
import com.spring_boot_proyect.stories_proyect.model.StoryFragmentEntity;
import com.spring_boot_proyect.stories_proyect.model.UserEntity;
import com.spring_boot_proyect.stories_proyect.service.IStoryFragmentService;
import com.spring_boot_proyect.stories_proyect.service.IStoryService;
import com.spring_boot_proyect.stories_proyect.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;

import java.time.LocalDateTime;

@Controller
public class WSStoryController {
    @Autowired
    private SimpMessagingTemplate messagingTemplate;
    @Autowired
    private IStoryService iStoryService;
    @Autowired
    private IStoryFragmentService iStoryFragmentService;
    @Autowired
    private IUserService iUserService;

    @MessageMapping("/add-fragment")
    public void addFragment(StoryRoomDTO newFragment){
        System.out.println(newFragment);
        /*StoryEntity story = iStoryService.findById(newFragment.getStoryId());
        UserEntity user = iUserService.findById(newFragment.getCreatedBy());
        StoryFragmentEntity storyFragment = new StoryFragmentEntity();
        storyFragment.setCreatedAt(LocalDateTime.now());
        storyFragment.setText(newFragment.getFragmentText());
        storyFragment.setCreatedBy(user);
        storyFragment.setStory(story);
        StoryFragmentEntity fragment= iStoryFragmentService.save(storyFragment);
        System.out.println(fragment);*/
        messagingTemplate.convertAndSend("/topic/room/" + newFragment.getRoomCode(), newFragment);
    }
}
