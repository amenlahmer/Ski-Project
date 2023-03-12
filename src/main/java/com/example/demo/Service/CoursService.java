package com.example.demo.Service;

import com.example.demo.Repository.ICoursRepository;
import com.example.demo.Repository.IPisteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class CoursService implements ICoursService {
    @Autowired
    private ICoursRepository myRepository;
    public ICoursRepository getMyRepository() {
        return myRepository;
    }
    public void setMyRepository(ICoursRepository myRepository) {

        this.myRepository = myRepository;
    }
}
