package com.coda.codaproject.services;

import com.coda.codaproject.entities.Users;
import com.coda.codaproject.repositories.UsersRepositories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsersService {
    @Autowired
    UsersRepositories usersRepositories;

    public List<Users> getAll(){return usersRepositories.findAll();}
}
