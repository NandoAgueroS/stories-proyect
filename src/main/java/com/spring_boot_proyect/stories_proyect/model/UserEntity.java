package com.spring_boot_proyect.stories_proyect.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.LinkedList;

@Entity
@Getter @Setter
@AllArgsConstructor
public class UserEntity {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;
    private String userName;
    @OneToMany(mappedBy = "user")
    private LinkedList<Story> stories;
}
