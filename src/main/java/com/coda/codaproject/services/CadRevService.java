package com.coda.codaproject.services;

import com.coda.codaproject.entities.CadRev;
import com.coda.codaproject.repositories.CadRevRepositories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CadRevService {
    @Autowired
    CadRevRepositories cadRevRepositories;

    public List<CadRev> getAll(){return cadRevRepositories.findAll();}
}
