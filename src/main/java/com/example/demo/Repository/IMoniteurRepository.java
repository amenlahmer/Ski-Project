package com.example.demo.Repository;

import com.example.demo.Entity.Moniteur;
import com.example.demo.Entity.Piste;
import com.example.demo.Entity.TypeCours;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.sql.Date;
import java.util.List;

public interface IMoniteurRepository extends JpaRepository<Moniteur,Long> {

//afficher la liste des  moniteurs en entrant des parametres de recherche comme date de recrutementet typecours
    List<Moniteur> findByMoniteursDateRecruAndMoniteursCoursTypeCourscontains(Date daterecru, TypeCours typecours);
//SQL afficher la liste des moniteurs avec le typecours entre en parametre
@Query(value= "select * from Moniteur M  JOIN Cours c"+
        " ON c.numCours=M.numCours where TypeCours=:type",nativeQuery = true)
List<Moniteur> findMoniteursByTypeCours(@Param("type") String type);

//JPQL afficher la liste des moniteurs avec le numcours entré en parametre
@Query("SELECT m FROM Moniteur m JOIN m.cours c WHERE c.numCours = :num")
List<Moniteur> findMoniteursBynumCours(@Param("num") String type);



}