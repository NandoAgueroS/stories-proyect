package com.spring_boot_proyect.stories_proyect.model;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.LinkedList;
import java.util.List;

@Entity
@JsonIdentityInfo(
        generator = ObjectIdGenerators.PropertyGenerator.class,
        property = "id"
)
@Table(name="story")
@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
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
    private UserEntity startedBy;
    @ManyToOne
    @JoinColumn(name = "room_code")
    private RoomEntity room;
}
