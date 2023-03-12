package com.example.demo.Service;

import com.example.demo.Repository.IInscriptionRepository;
import com.example.demo.Repository.IPisteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class InscriptionService implements IInscriptionService {
    @Autowired
    private IInscriptionRepository myRepository;
    public IInscriptionRepository getMyRepository() {
        return myRepository;
    }
    public void setMyRepository(IInscriptionRepository myRepository) {

        this.myRepository = myRepository;
    }
}
