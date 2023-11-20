package com.coda.codaproject.repositories;

import com.coda.codaproject.entities.ProductImage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductImageRepositories extends JpaRepository<ProductImage, Long> {
}
