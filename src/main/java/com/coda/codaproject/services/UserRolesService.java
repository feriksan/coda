package com.coda.codaproject.services;

import com.coda.codaproject.entities.UserRoles;
import com.coda.codaproject.repositories.UserRolesRepositories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserRolesService {
    @Autowired
    UserRolesRepositories userRolesRepositories;

    public List<UserRoles> getAll(){return userRolesRepositories.findAll();}
}
