package com.example.demo.Service;


import com.example.demo.Entity.Piste;
import com.example.demo.Entity.Skieur;
import com.example.demo.Entity.TypeAbonnement;
import com.example.demo.Repository.IPisteRepository;
import com.example.demo.Repository.ISkieurRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

@Service

public  class SkieurService implements ISkieurService {
    @Autowired
    private ISkieurRepository myRepository;
    private IPisteRepository pisteRepository;

    @Override
    @Scheduled(fixedDelay = 30000)

    public List<Skieur> getAllSkieur() {
        List<Skieur> myList = myRepository.findAll();
        return myList;
    }


    public Skieur getSkieur(Long numSkieur) {
        return myRepository.findById(numSkieur).get();
    }


    public Skieur addSkieur(Skieur s) {
        myRepository.save(s);

        return s;
    }

    @Override
    public void deleteSkieur(Long numSkieur) {
        myRepository.deleteById(numSkieur);

    }

    public void updateSkieur(Skieur s) {
        myRepository.save(s);
    }
    public Skieur assignSkieurToPiste(Long numSkieur, Long numPiste) {


            Skieur s = myRepository.findById(numSkieur).get();
            Piste p = pisteRepository.findById(numPiste).get();
            if(s.getPistes()!=null){
           s.getPistes().add(p);}
            else {
                Set<Piste> lp= new HashSet<Piste>();
                lp.add(p);
                s.setPistes(lp);
            }



        return myRepository.save(s);
    }

    List<Skieur> retrieveSkieursByTypeAbonnement(TypeAbonnement typeAbonnement){
        return myRepository.findAll()
                .stream()
                .filter(s->s.getAbonnement().getTypeAbon()==typeAbonnement)
                .collect(Collectors.toList());
    }
}
