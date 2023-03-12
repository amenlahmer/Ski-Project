package com.example.demo.Controller;

import com.example.demo.Service.IPisteService;
import com.example.demo.Service.PisteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PisteController {
    @Autowired
    private IPisteService service;
}
