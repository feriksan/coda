package com.coda.codaproject.repositories;

import com.coda.codaproject.entities.ProgressImage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProgressImageRepositories extends JpaRepository<ProgressImage, Long> {
}
