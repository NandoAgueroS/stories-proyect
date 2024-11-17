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
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private String title;
    private boolean status;
    private LocalDate createdAt;
    private LocalDate updatedAt;
    @OneToMany (mappedBy = "story")
    private LinkedList<StoryFragment> storyFragments;
}
