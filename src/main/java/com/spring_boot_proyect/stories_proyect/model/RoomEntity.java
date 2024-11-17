package com.spring_boot_proyect.stories_proyect.model;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@JsonIdentityInfo(
        generator = ObjectIdGenerators.PropertyGenerator.class,
        property = "code"
)
@Table(name = "room")
@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor
public class RoomEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long code;
    @OneToMany(mappedBy = "room")
    private List<StoryEntity> stories;
    @OneToMany(mappedBy = "currentRoom")
    private List<UserEntity> users;
    private LocalDateTime lastActivity;
}
