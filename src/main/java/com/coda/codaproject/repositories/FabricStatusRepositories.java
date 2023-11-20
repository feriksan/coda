package com.coda.codaproject.repositories;

import com.coda.codaproject.entities.FabricStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FabricStatusRepositories extends JpaRepository<FabricStatus, Long> {
}
