package com.coda.codaproject.controller;

import com.coda.codaproject.entities.CadImage;
import com.coda.codaproject.services.CadImageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CadImageController {
    @Autowired
    CadImageService cadImageService;

    @GetMapping("cadImage/all")
    public ResponseEntity<List<CadImage>> getAll(){return ResponseEntity.ok(cadImageService.getAll());}
}
