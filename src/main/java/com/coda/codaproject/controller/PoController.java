package com.coda.codaproject.controller;

import com.coda.codaproject.entities.Po;
import com.coda.codaproject.services.PoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PoController {

    @Autowired
    PoService poService;

    @GetMapping("/po/all")
    public ResponseEntity<List<Po>> getAllPo(){
        return new ResponseEntity<>(poService.getPo(), HttpStatus.OK);
    }
}
