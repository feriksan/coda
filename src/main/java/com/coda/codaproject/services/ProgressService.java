package com.coda.codaproject.services;

import com.coda.codaproject.entities.Progress;
import com.coda.codaproject.repositories.ProgressRepositories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProgressService {
    @Autowired
    private ProgressRepositories progressRepositories;

    public List<Progress> getProgressAll(){
        return progressRepositories.findAll();
    }

    public Progress createProgress(Progress data){
        return progressRepositories.save(data);
    }
}
