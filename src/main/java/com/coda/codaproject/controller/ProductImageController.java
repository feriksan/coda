package com.coda.codaproject.controller;

import com.coda.codaproject.services.ProductImageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductImageController {
    @Autowired
    ProductImageService productImageService;

    @GetMapping("productImage/all")
    public ResponseEntity<List<?>> getAllProductImage(){return ResponseEntity.ok(productImageService.getAll());}
}
