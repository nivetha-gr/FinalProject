package com.example.FinalProject.controller;

import com.example.FinalProject.model.Home;
import com.example.FinalProject.service.HomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/homepage")
@CrossOrigin
public class HomeController {

    @Autowired
    private HomeService homeService;

    @PostMapping("/add")
    public String add(@RequestBody Home h){
        homeService.saveDetails(h);
        return "New student is added";
    }

    @GetMapping("/getAll")
    public List<Home> list(){
        return homeService.getAllDetails();
    }



}
