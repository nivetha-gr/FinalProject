package com.example.FinalProject.repository;

import com.example.FinalProject.model.Home;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HomeRepository extends JpaRepository<Home,String> {
}
