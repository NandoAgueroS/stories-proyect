package com.spring_boot_proyect.stories_proyect.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.LinkedList;
import java.util.List;

@Entity
@Getter @Setter
@AllArgsConstructor
public class Story {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private boolean state;
    private LocalDate createdAt;
    private LocalDate updatedAt;
    @OneToMany (mappedBy = "story")
    private LinkedList<StoryFragment> storyFragments;
    @ManyToOne
    @JoinColumn(name = "started_by")
    private UserEntity user;
}
