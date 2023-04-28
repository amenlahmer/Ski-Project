package com.example.demo.Controller;

import com.example.demo.Entity.Inscription;
import com.example.demo.Entity.Skieur;
import com.example.demo.Service.IInscriptionService;
import com.example.demo.Service.InscriptionService;
import com.example.demo.Service.PisteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class InscriptionController {
    @Autowired
    private IInscriptionService service;
    public Inscription getInscription(Long id) {
        Inscription inscription = service.getInscription(id);
        return inscription;

    }
    public void assignInscriptionToCours(){

    }
}
