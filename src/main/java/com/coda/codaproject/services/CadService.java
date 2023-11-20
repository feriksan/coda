package com.coda.codaproject.services;

import com.coda.codaproject.entities.Cad;
import com.coda.codaproject.repositories.CadRepositories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CadService {
    @Autowired
    CadRepositories cadRepositories;

    public List<Cad> getAll(){return cadRepositories.findAll();}
}
