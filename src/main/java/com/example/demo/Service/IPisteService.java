package com.example.demo.Service;

import com.example.demo.Entity.Piste;

import java.util.List;

public interface IPisteService  {
    public List<Piste> getAllPiste();
    public Piste getpisteById(long id);
    public Piste addPiste(Piste p);
    public void updatePiste(Piste p);
    public void deletePiste(long numPiste);

}
