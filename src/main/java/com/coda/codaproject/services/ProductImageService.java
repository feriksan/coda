package com.coda.codaproject.services;

import com.coda.codaproject.entities.ProductImage;
import com.coda.codaproject.repositories.ProductImageRepositories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductImageService {

    @Autowired
    ProductImageRepositories productImageRepositories;

    public List<ProductImage> getAll(){return productImageRepositories.findAll();}
}
