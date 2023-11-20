package com.coda.codaproject.repositories;

import com.coda.codaproject.entities.Cad;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CadRepositories extends JpaRepository<Cad, Long> {
}
