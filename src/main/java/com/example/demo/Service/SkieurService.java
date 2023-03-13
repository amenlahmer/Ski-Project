package com.example.demo.Service;

import com.example.demo.Entity.Skieur;
import com.example.demo.Repository.ISkieurRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

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
    public Skieur getskieurById(long id)
    {
        return myRepository.findById(id).get();
    }



    public List<Skieur> getAllPiste(){
        List<Skieur> skieurs=new ArrayList<>();

        myRepository.findAll()
                .forEach(skieurs::add);
        return skieurs;

    }
    public void addPiste(Skieur p){
        myRepository.save(p);

    }
    public void updatePiste(Skieur s){
        myRepository.save(s);
    }
    public void delete(long numSkieur)
    {
        myRepository.deleteById(numSkieur);
    }
}
