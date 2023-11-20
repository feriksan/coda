package com.coda.codaproject.repositories;

import com.coda.codaproject.entities.Po;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PoRepositories extends JpaRepository<Po, Long> {
}
