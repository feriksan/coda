package com.coda.codaproject.services;

import com.coda.codaproject.entities.ProgressImage;
import com.coda.codaproject.repositories.ProgressImageRepositories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProgressImageService {
    @Autowired
    ProgressImageRepositories progressImageRepositories;

    public List<ProgressImage> getAll(){
        return progressImageRepositories.findAll();
    }
}
