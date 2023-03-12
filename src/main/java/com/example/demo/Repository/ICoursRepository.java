package com.example.demo.Repository;

import com.example.demo.Entity.Cours;
import com.example.demo.Entity.Piste;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICoursRepository extends JpaRepository<Cours,Long> {
}
