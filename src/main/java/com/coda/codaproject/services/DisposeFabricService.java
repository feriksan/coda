package com.coda.codaproject.services;

import com.coda.codaproject.entities.DisposeFabric;
import com.coda.codaproject.repositories.DisposeFabricRepositories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DisposeFabricService {
    @Autowired
    DisposeFabricRepositories disposeFabricRepositories;

    public List<DisposeFabric> getAll(){return disposeFabricRepositories.findAll();}
}
