package com.spring_boot_proyect.stories_proyect.service;

import com.spring_boot_proyect.stories_proyect.model.RoomEntity;
import com.spring_boot_proyect.stories_proyect.repository.IRoomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoomService implements IRoomService{
    @Autowired
    private IRoomRepository iRoomRepository;
    @Override
    public RoomEntity save(RoomEntity roomEntity) {
        RoomEntity savedRoom = iRoomRepository.save(roomEntity);
        return savedRoom;
    }

    @Override
    public RoomEntity findByRoomCode(Long code) {
        RoomEntity room = iRoomRepository.findById(code).orElse(null);
        return room;
    }
}
