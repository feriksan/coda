package com.coda.codaproject.repositories;

import com.coda.codaproject.entities.Fabric;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FabricRepositories extends JpaRepository<Fabric, Long> {
}
