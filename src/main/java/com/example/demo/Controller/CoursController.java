package com.example.demo.Controller;

import com.example.demo.Service.CoursService;
import com.example.demo.Service.ICoursService;
import com.example.demo.Service.PisteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class CoursController {
    @Autowired
    private ICoursService service;
}
