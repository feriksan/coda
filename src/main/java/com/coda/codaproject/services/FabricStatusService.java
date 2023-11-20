package com.coda.codaproject.services;

import com.coda.codaproject.entities.FabricStatus;
import com.coda.codaproject.repositories.FabricStatusRepositories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FabricStatusService {
    @Autowired
    FabricStatusRepositories fabricStatusRepositories;

    public List<FabricStatus> getAll(){return fabricStatusRepositories.findAll();}
}
