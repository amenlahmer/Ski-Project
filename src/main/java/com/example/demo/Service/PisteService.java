package com.example.demo.Service;

import com.example.demo.Entity.Piste;
import com.example.demo.Entity.Skieur;
import com.example.demo.Repository.IPisteRepository;
import com.example.demo.Repository.ISkieurRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

//architecture en couche
@Service
public class PisteService implements IPisteService {
    @Autowired
    private IPisteRepository myRepository;
    private ISkieurRepository skieurRepository;
    public void setMyRepository(IPisteRepository myRepository) {

        this.myRepository = myRepository;
    }
    public Piste getpisteById(long id)
    {
        return myRepository.findById(id).get();
    }


    public IPisteRepository getMyRepository() {
        return myRepository;
    }
    public List<Piste> getAllPiste(){
        List<Piste> pistes=new ArrayList<>();

        myRepository.findAll()
                .forEach(pistes::add);
        return pistes;

    }
    public Piste addPiste(Piste p){
        myRepository.save(p);

        return p;
    }
    public void updatePiste(Piste p){
        myRepository.save(p);
    }
    public void deletePiste(long numPiste)
    {
        myRepository.deleteById(numPiste);
    }




    }




