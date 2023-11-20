package com.coda.codaproject.services;

import com.coda.codaproject.entities.Po;
import com.coda.codaproject.repositories.PoRepositories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PoService {

    @Autowired
    private PoRepositories poRepositories;

    public List<Po> getPo(){return poRepositories.findAll();}
}
