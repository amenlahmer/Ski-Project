package com.example.demo.Repository;

import com.example.demo.Entity.Cours;
import com.example.demo.Entity.Inscription;
import com.example.demo.Entity.Piste;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IInscriptionRepository extends JpaRepository<Inscription,Long> {
    List<Inscription> findByCours(Cours cours);
}
