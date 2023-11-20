package com.coda.codaproject.services;

import com.coda.codaproject.entities.PoRev;
import com.coda.codaproject.repositories.PoRevRepositories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PoRevService {

    @Autowired
    PoRevRepositories poRevRepositories;

    public List<PoRev> getAll(){return poRevRepositories.findAll();}
}
