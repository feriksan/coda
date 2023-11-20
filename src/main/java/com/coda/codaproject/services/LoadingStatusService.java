package com.coda.codaproject.services;

import com.coda.codaproject.entities.LoadingStatus;
import com.coda.codaproject.repositories.LoadingStatusRepositories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LoadingStatusService {
    @Autowired
    LoadingStatusRepositories loadingStatusRepositories;

    public List<LoadingStatus> getAll(){return loadingStatusRepositories.findAll();}
}
