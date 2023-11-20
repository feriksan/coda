package com.coda.codaproject.controller;

import com.coda.codaproject.entities.ProductPo;
import com.coda.codaproject.services.ProductPoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductPoController {
    @Autowired
    ProductPoService productPoService;

    @GetMapping("product/getAll")
    public ResponseEntity<List<ProductPo>> getAllProduct(){return ResponseEntity.ok(productPoService.getAll());}
}
