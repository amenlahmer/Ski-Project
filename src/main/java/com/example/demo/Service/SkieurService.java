package com.example.demo.Service;

import com.example.demo.Repository.IPisteRepository;
import com.example.demo.Repository.ISkieurRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class SkieurService implements ISkieurService{
    @Autowired
    private ISkieurRepository myRepository;
    public ISkieurRepository getMyRepository() {
        return myRepository;
    }
    public void setMyRepository(ISkieurRepository myRepository) {

        this.myRepository = myRepository;
    }
}
