package com.example.demo.Service;

import com.example.demo.Entity.Skieur;

import java.util.List;

public interface ISkieurService {
    public Skieur addSkieur(Skieur skieur);
    public Skieur getSkieur(Long numSkieur);
    public List<Skieur> getAllSkieur();
    public void updateSkieur(Skieur skieur);
    public void deleteSkieur(Long numSkieur);

}
