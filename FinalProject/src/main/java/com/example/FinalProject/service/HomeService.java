package com.example.FinalProject.service;

import com.example.FinalProject.model.Home;

import java.util.List;

public interface HomeService {
    public Home saveDetails(Home h);
    public List<Home> getAllDetails();
}
