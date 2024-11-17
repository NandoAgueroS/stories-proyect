package com.spring_boot_proyect.stories_proyect.controller;

import com.spring_boot_proyect.stories_proyect.model.RoomEntity;
import com.spring_boot_proyect.stories_proyect.service.IRoomService;
import com.spring_boot_proyect.stories_proyect.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;

@RestController
@RequestMapping("/room")
public class RoomController {
    @Autowired
    private IUserService iUserService;
    @Autowired
    private IRoomService iRoomService;

    @GetMapping("/create")
    public RoomEntity createRoom(){
        RoomEntity room = new RoomEntity();
        room.setLastActivity(LocalDateTime.now());
        room = iRoomService.save(room);
        return room;
    }
    @GetMapping("/find/{code}")
    public RoomEntity findRoom(@PathVariable Long code){
        RoomEntity room = iRoomService.findByRoomCode(code);
        return room;
    }
}
