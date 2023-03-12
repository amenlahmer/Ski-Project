package com.example.demo.Repository;

import com.example.demo.Entity.Piste;
import com.example.demo.Entity.Skieur;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ISkieurRepository extends JpaRepository<Skieur,Long> {
}
