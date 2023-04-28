package com.example.demo.Service;

import com.example.demo.Entity.Cours;
import com.example.demo.Entity.Inscription;
import com.example.demo.Entity.Skieur;
import com.example.demo.Entity.TypeCours;
import com.example.demo.Repository.ICoursRepository;
import com.example.demo.Repository.IInscriptionRepository;
import com.example.demo.Repository.ISkieurRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service

public class InscriptionService implements IInscriptionService {
    @Autowired
    private IInscriptionRepository myRepository;
    private ICoursRepository iCoursRepository;
    private ISkieurRepository skieurRepository;
    public IInscriptionRepository getMyRepository() {
        return myRepository;
    }
    public void setMyRepository(IInscriptionRepository myRepository) {

        this.myRepository = myRepository;
    }
    public Inscription getInscription(Long numInscription){
        return myRepository.findById(numInscription).get();
    }
   // public Inscription assignInscriptionToCours(Long numInscription, Long numCours){
     //   Inscription inscription = myRepository.findById(numInscription).get();
    //    Cours cours =crepo.findById(numCours).get();
//
     //   cours.setInscriptions(inscriptions);
    //    crepo.save(cours);


     //   return inscription;
   //}

    public Inscription assignInscriptionToCours(Long numInscription, Long numCours)
    {
        Inscription i = myRepository.findById(numInscription).get();
        Cours cours = iCoursRepository.findById(numCours).get();
        /*if (cours.getInscriptions() != null){
        cours.getInscriptions().add(i);
    }
    else {
        Set<Inscription> lI  = new HashSet<>(); this was in case the cours entity is the parent entity
       lI.add(i);
        cours.setInscriptions(lI);
    }
        iCoursRepository.save(cours);*/
        i.setCours(cours);
        myRepository.save(i);
        return i;
    }
    Inscription addInscriptionAndAssignToSkieurAndCours(Inscription inscription, Long

            numSkieur, Long numCours){
        Skieur skieur = skieurRepository.findById(numSkieur).get();
        Cours cours=iCoursRepository.findById(numCours).get();
        if (cours.getTypecours() == TypeCours.COLLECTIF_ENFANT || cours.getTypecours() == TypeCours.COLLECTIF_ADULT || cours.getInscriptions().size()<6) {

            inscription.setSkieur(skieur);
            inscription.setCours(cours);
            }
        return myRepository.save(inscription);
        }

    }

