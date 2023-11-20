package com.coda.codaproject.controller;

import com.coda.codaproject.entities.Cad;
import com.coda.codaproject.services.CadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CadController {

    @Autowired
    CadService cadService;

    @GetMapping("cad/all")
    public ResponseEntity<List<Cad>> getAllCad(){return new ResponseEntity<>(cadService.getAll(), HttpStatus.OK);}
}
