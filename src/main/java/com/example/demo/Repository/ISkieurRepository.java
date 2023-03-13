package com.example.demo.Repository;

import com.example.demo.Entity.Piste;
import com.example.demo.Entity.Skieur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

//control+espace
public interface ISkieurRepository extends JpaRepository<Skieur,Long> {
   // List<Skieur> findSkieurBynumInscription(@Param("numInscription") Long numInscription);

    //SQL
    @Query(value = "SELECT * FROM Skieur s " +
            "INNER JOIN Inscription i ON s.numSkieur = i.numSkieur " +
            "where i.numInscription =:numInscription"
            , nativeQuery = true)
    List<Skieur> getSkieurByNumInscription(@Param("numInscription") long numInscription);
    //JPQL
    @Query("select s from Skieur s"+
    " JOIN Inscription i on (i member  s.inscriptions)"+
    "where i.numInscription =:numInscription")
    List<Skieur> findSkieurBynumInscription(@Param("numInscription") Long numInscription);

}
