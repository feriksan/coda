package com.coda.codaproject.repositories;

import com.coda.codaproject.entities.DisposeFabric;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DisposeFabricRepositories extends JpaRepository<DisposeFabric, Long> {
}
