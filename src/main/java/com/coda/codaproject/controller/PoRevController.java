package com.coda.codaproject.controller;

import com.coda.codaproject.services.PoRevService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PoRevController {

    @Autowired
    PoRevService poRevService;

    @GetMapping("poRev/all")
    public ResponseEntity<List<?>> getAllRev(){return ResponseEntity.ok(poRevService.getAll());}
}
