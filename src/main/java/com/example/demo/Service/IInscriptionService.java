package com.example.demo.Service;

import com.example.demo.Entity.Inscription;
import com.example.demo.Entity.Skieur;

public interface IInscriptionService {
    public Inscription getInscription(Long numInscription);
    Inscription assignInscriptionToCours(Long numInscription, Long numCours);
}
