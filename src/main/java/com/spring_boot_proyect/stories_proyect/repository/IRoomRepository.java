package com.spring_boot_proyect.stories_proyect.repository;

import com.spring_boot_proyect.stories_proyect.model.RoomEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IRoomRepository extends JpaRepository<RoomEntity, Long> {
}
