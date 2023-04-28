package com.example.demo.Service;

import com.example.demo.Entity.Cours;
import com.example.demo.Entity.Moniteur;
import com.example.demo.Entity.Support;
import com.example.demo.Repository.ICoursRepository;
import com.example.demo.Repository.IMoniteurRepository;
import com.example.demo.Repository.IMoniteurRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service

public class MoniteurService implements IMoniteurService{
    @Autowired
    private IMoniteurRepository myRepository;
    private ICoursRepository coursRepository;

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
    public Moniteur addMoniteur(Moniteur m){
        myRepository.save(m);
        return m;

    }
    public void updateMoniteur(Moniteur m){
        myRepository.save(m);
    }
    public void delete(long numMoniteur)
    {
        myRepository.deleteById(numMoniteur);
    }
    public Moniteur addMoniteurAndAssignToCours(Moniteur moniteur, Long numCours)
    {

        if (coursRepository.existsById(numCours))
        {
            Moniteur moniteur1=myRepository.save(moniteur);
            moniteur1.getCours().add(coursRepository.findById(numCours).get());
            addMoniteur(moniteur1);
            return moniteur;
        }
        else
        {
            return moniteur;
        }
    }
   /* List<Integer> numWeeksCourseOfMoniteurBySupport(Long numMoniteur, Support support){
            Moniteur m=myRepository.getById(numMoniteur);
        List<Cours> cours= coursRepository.findAll().stream().filter(a->a.getSupport().equals(support)).collect(Collectors.toList());



        }*/


}
