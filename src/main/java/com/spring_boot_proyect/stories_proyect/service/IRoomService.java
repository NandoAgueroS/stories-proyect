package com.spring_boot_proyect.stories_proyect.service;

import com.spring_boot_proyect.stories_proyect.model.RoomEntity;

public interface IRoomService {
    public RoomEntity save(RoomEntity roomEntity);
    public RoomEntity findByRoomCode(Long code);
}
