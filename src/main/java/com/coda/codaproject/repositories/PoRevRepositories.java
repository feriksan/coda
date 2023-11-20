package com.coda.codaproject.repositories;

import com.coda.codaproject.entities.PoRev;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PoRevRepositories extends JpaRepository<PoRev, Long> {
}
