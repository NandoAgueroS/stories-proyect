package com.spring_boot_proyect.stories_proyect.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@Table(name="story_fragment")
@Getter @Setter
@AllArgsConstructor
public class StoryFragmentEntity {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;
    private String text;
    private LocalDate createdAt;
    @ManyToOne
    @JoinColumn(name = "story_id", nullable = false)
    private StoryEntity story;
    @ManyToOne
    @JoinColumn(name = "created_by")
    private UserEntity user;
}
