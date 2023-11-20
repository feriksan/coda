package com.coda.codaproject.services;

import com.coda.codaproject.entities.CadImage;
import com.coda.codaproject.repositories.CadImageRepositories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CadImageService {
    @Autowired
    CadImageRepositories cadImageRepositories;

    public List<CadImage> getAll(){return cadImageRepositories.findAll();}
}
