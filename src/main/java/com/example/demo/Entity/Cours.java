package com.example.demo.Entity;
import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;



@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
@FieldDefaults(level = AccessLevel.PRIVATE)
@Builder

public class Cours implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long numCours;
    private Float prix;
    @Enumerated(EnumType.STRING)
    private Support support;
    @Enumerated(EnumType.STRING)
    private TypeCours typecours;
    private Integer creneau;
    private Integer niveau;
    @OneToMany(cascade = CascadeType.ALL, mappedBy="cours")
    private Set<Inscription> Inscriptions;


}