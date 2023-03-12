package com.example.demo.Controller;

import com.example.demo.Service.IMoniteurService;
import com.example.demo.Service.MoniteurService;
import com.example.demo.Service.PisteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class MoniteurController {
    @Autowired
    private IMoniteurService service;
}
