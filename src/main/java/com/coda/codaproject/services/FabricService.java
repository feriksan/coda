package com.coda.codaproject.services;

import com.coda.codaproject.entities.Fabric;
import com.coda.codaproject.repositories.FabricRepositories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FabricService {
    @Autowired
    FabricRepositories fabricRepositories;

    public List<Fabric> getAll(){return fabricRepositories.findAll();}
}
