package com.coda.codaproject.repositories;

import com.coda.codaproject.entities.DisposePo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DisposePoRepositories extends JpaRepository<DisposePo, Long> {
}
