package com.example.demo.Controller;

import com.example.demo.Service.IInscriptionService;
import com.example.demo.Service.InscriptionService;
import com.example.demo.Service.PisteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class InscriptionController {
    @Autowired
    private IInscriptionService service;
}
