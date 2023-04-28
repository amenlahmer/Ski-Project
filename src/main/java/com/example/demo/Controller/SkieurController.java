package com.example.demo.Controller;

import com.example.demo.Entity.Skieur;
import com.example.demo.Entity.Skieur;
import com.example.demo.Service.ISkieurService;

import com.example.demo.Service.SkieurService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/skieur")
public class SkieurController {
    @Autowired
    private ISkieurService service;
    @GetMapping("/get-all-skieurs")
    public List<Skieur> getAllSkieurs() {
        List<Skieur> listSkieurs = service.getAllSkieur();
        return listSkieurs;

    }
    @GetMapping("/get-skieur/{skieur-num}")
    public Skieur getSkieur(@PathVariable( "skieur-num")Long id) {
        Skieur skieur = service.getSkieur(id);
        return skieur;

    }
    @PostMapping("/add-skieur")
    public Skieur addSkieur(@RequestBody Skieur s) {
        Skieur skieur = service.addSkieur(s);
        return  s ;
    }
    @DeleteMapping("/remove-skieur/{skieur-num}")
    public void removeSkieur(@PathVariable("skieur-num") Long numSkieur) {
        service.deleteSkieur(numSkieur);
    }
    @PutMapping("/update-skieur")
    public void updateSkieur(@RequestBody Skieur s) {
        service.updateSkieur(s);

    }






    }


