package com.example.demo.Service;

import com.example.demo.Entity.Abonnement;
import com.example.demo.Entity.TypeAbonnement;
import com.example.demo.Repository.IAbonnementRepository;
import com.example.demo.Repository.IPisteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

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
    Set<Abonnement> getAbonnementByType(TypeAbonnement type){

        return myRepository.findAll().stream().filter(a->a.getTypeAbon()==type)
                .sorted((a1,a2)->a1.getDateDebut().compareTo(a2.getDateDebut()))
                .collect(Collectors.toSet());

    }
    List<Abonnement> retrieveAbonnementsByDates(LocalDate startDate, LocalDate endDate){
        return myRepository.findAll().stream()
                .filter(a->startDate.isBefore(a.getDateDebut().toInstant().atZone(ZoneId.systemDefault()).toLocalDate())&&
                        endDate.isAfter(a.getDateDebut().toInstant().atZone(ZoneId.systemDefault()).toLocalDate()))
                .collect(Collectors.toList());
    }
}

