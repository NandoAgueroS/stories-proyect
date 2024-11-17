package com.spring_boot_proyect.stories_proyect.repository;

import com.spring_boot_proyect.stories_proyect.model.StoryFragmentEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IStoryFragmentRepository extends JpaRepository<StoryFragmentEntity, Long> {
}
