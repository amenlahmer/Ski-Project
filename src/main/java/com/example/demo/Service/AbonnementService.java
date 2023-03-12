package com.example.demo.Service;

import com.example.demo.Repository.IAbonnementRepository;
import com.example.demo.Repository.IPisteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class AbonnementService implements IAbonnementService {
    @Autowired
    private IAbonnementRepository myRepository;
    public IAbonnementRepository getMyRepository() {
        return myRepository;
    }
    public void setMyRepository(IAbonnementRepository myRepository) {

        this.myRepository = myRepository;
    }
}

