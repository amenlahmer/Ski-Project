package com.example.demo.Controller;

import com.example.demo.Entity.Moniteur;
import com.example.demo.Entity.Piste;
import com.example.demo.Service.IMoniteurService;
import com.example.demo.Service.MoniteurService;
import com.example.demo.Service.PisteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class MoniteurController {
    @Autowired
    private IMoniteurService service;
    @PostMapping("/add-moniteur")
    public Moniteur addMoniteur(@RequestBody Moniteur m){
       return  service.addMoniteur(m);

    }

}
