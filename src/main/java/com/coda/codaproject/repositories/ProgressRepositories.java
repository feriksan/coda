package com.coda.codaproject.repositories;

import com.coda.codaproject.entities.Progress;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProgressRepositories extends JpaRepository<Progress, Long>{
}
