package com.example.demo.Repository;

import com.example.demo.Entity.Inscription;
import com.example.demo.Entity.Piste;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IInscriptionRepository extends JpaRepository<Inscription,Long> {
}
