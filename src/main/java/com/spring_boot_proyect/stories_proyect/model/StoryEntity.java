package com.spring_boot_proyect.stories_proyect.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.LinkedList;

@Entity
@Table(name="story")
@Getter @Setter
@AllArgsConstructor
public class StoryEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private boolean state;
    private LocalDate createdAt;
    private LocalDate updatedAt;
    @OneToMany (mappedBy = "story")
    private LinkedList<StoryFragmentEntity> storyFragments;
    @ManyToOne
    @JoinColumn(name = "started_by")
    private UserEntity user;
}
