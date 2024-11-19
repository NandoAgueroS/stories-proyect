package com.spring_boot_proyect.stories_proyect.model;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@JsonIdentityInfo(
        generator = ObjectIdGenerators.PropertyGenerator.class,
        property = "id"
)
@Table(name="story_fragment")
@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class StoryFragmentEntity {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;
    private String text;
    private LocalDateTime createdAt;
    @ManyToOne
    @JoinColumn(name = "story_id", nullable = false)
    private StoryEntity story;
    @ManyToOne
    @JoinColumn(name = "created_by")
    private UserEntity createdBy;
}
