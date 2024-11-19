package com.spring_boot_proyect.stories_proyect.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter @Getter
@AllArgsConstructor
@ToString
public class StoryRoomDTO {
    private String fragmentText;
    private Long createdBy;
    private Long roomCode;
    private Long storyId;
}
