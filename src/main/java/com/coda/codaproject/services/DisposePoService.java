package com.coda.codaproject.services;

import com.coda.codaproject.entities.DisposePo;
import com.coda.codaproject.repositories.DisposePoRepositories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DisposePoService {
    @Autowired
    DisposePoRepositories disposePoRepositories;

    public List<DisposePo> getAll(){return disposePoRepositories.findAll();}
}
