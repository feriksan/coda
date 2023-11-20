package com.coda.codaproject.controller;

import com.coda.codaproject.services.DisposePoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DisposePoController {
    @Autowired
    DisposePoService disposePoService;

    @GetMapping("disposePo/all")
    public ResponseEntity<List<?>> getAllDisposePo(){return ResponseEntity.ok(disposePoService.getAll());}
}
