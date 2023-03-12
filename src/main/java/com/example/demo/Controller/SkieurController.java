package com.example.demo.Controller;

import com.example.demo.Service.ISkieurService;
import com.example.demo.Service.PisteService;
import com.example.demo.Service.SkieurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class SkieurController {
    @Autowired
    private ISkieurService skieurService;

}
