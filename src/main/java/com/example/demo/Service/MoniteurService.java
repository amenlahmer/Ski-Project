package com.example.demo.Service;

import com.example.demo.Entity.Moniteur;
import com.example.demo.Repository.IMoniteurRepository;
import com.example.demo.Repository.IMoniteurRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service

public class MoniteurService implements IMoniteurService{
    @Autowired
    private IMoniteurRepository myRepository;

    public void setMyRepository(IMoniteurRepository myRepository) {

        this.myRepository = myRepository;
    }
    public IMoniteurRepository getMyRepository() {
        return myRepository;
    }
    public Moniteur getMoniteurById(long id)
    {
        return myRepository.findById(id).get();
    }

    public List<Moniteur> getAllMoniteur(){
        List<Moniteur> Moniteurs=new ArrayList<>();

        myRepository.findAll()
                .forEach(Moniteurs::add);
        return Moniteurs;
    }
    public void addMoniteur(Moniteur m){
        myRepository.save(m);

    }
    public void updateMoniteur(Moniteur m){
        myRepository.save(m);
    }
    public void delete(long numMoniteur)
    {
        myRepository.deleteById(numMoniteur);
    }



}
