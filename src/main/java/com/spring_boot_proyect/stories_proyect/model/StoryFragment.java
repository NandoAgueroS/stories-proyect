package com.spring_boot_proyect.stories_proyect.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@Getter @Setter
@AllArgsConstructor
public class StoryFragment {
    @Id
    @GeneratedValue (strategy = GenerationType.SEQUENCE)
    private Long id;
    private String text;
    private LocalDate createdAt;
    @ManyToOne
    @JoinColumn(name = "story_id", nullable = false)
    private Story story;
}
