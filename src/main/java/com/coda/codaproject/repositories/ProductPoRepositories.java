package com.coda.codaproject.repositories;

import com.coda.codaproject.entities.LoadingStatus;
import com.coda.codaproject.entities.ProductPo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductPoRepositories extends JpaRepository<ProductPo, LoadingStatus> {
}
