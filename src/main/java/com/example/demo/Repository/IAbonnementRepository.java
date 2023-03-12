package com.example.demo.Repository;

import com.example.demo.Entity.Abonnement;
import com.example.demo.Entity.Piste;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IAbonnementRepository extends JpaRepository<Abonnement,Long> {
}
