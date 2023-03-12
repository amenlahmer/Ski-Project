package com.example.demo.Service;

import com.example.demo.Entity.Piste;
import com.example.demo.Repository.IPisteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

//architecture en couche
@Service
public class PisteService implements IPisteService {
    @Autowired
    private IPisteRepository myRepository;
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
    public void addPiste(Piste p){
        myRepository.save(p);

    }
    public void updatePiste(Piste p){
        myRepository.save(p);
    }
    public void delete(long numPiste)
    {
        myRepository.deleteById(numPiste);
    }


    public void update(Piste p , long numpiste)
    {
        myRepository.save(p);
    }

}
