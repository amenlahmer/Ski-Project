package com.example.demo.Controller;

import com.example.demo.Service.AbonnementService;
import com.example.demo.Service.IAbonnementService;
import com.example.demo.Service.PisteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class AbonnementController {
    @Autowired
    private IAbonnementService service;
}
