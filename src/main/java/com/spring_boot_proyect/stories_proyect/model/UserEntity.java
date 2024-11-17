package com.spring_boot_proyect.stories_proyect.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter @Setter
@AllArgsConstructor
public class UserEntity {
    @Id
    @GeneratedValue (strategy = GenerationType.SEQUENCE)
    private Long id;
    private String userName;
}
