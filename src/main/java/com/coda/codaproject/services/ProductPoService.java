package com.coda.codaproject.services;

import com.coda.codaproject.entities.ProductPo;
import com.coda.codaproject.repositories.ProductPoRepositories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductPoService {
    @Autowired
    ProductPoRepositories poRepositories;

    public List<ProductPo> getAll(){return poRepositories.findAll();}
}
