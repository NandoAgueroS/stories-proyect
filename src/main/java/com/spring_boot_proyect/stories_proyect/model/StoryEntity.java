package com.spring_boot_proyect.stories_proyect.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.LinkedList;
import java.util.List;

@Entity
@Table(name="story")
@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor
public class StoryEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private boolean state;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    @OneToMany (mappedBy = "story")
    private List<StoryFragmentEntity> storyFragments;
    @ManyToOne
    @JoinColumn(name = "started_by")
    private UserEntity user;
    @ManyToOne
    @JoinColumn(name = "room_code")
    private RoomEntity room;
}
