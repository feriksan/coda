package com.coda.codaproject.repositories;

import com.coda.codaproject.entities.LoadingStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LoadingStatusRepositories extends JpaRepository<LoadingStatus, LoadingStatus> {
}
