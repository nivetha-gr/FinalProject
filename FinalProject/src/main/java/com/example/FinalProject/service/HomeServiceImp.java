package com.example.FinalProject.service;

import com.example.FinalProject.model.Home;
import com.example.FinalProject.repository.HomeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class HomeServiceImp implements HomeService {
    @Autowired
    private HomeRepository homeRepository;

    @Override
    public Home saveDetails(Home h) {
        return homeRepository.save(h);
    }

    @Override
    public List<Home> getAllDetails() {
        return homeRepository.findAll();
    }
}
