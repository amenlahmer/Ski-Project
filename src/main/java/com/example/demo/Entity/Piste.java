package com.example.demo.Entity;
import lombok.*;
import lombok.experimental.FieldDefaults;
import java.util.Set;

import javax.persistence.*;
import java.io.Serializable;




@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
@FieldDefaults(level = AccessLevel.PRIVATE)
@Builder

public class Piste implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long numPiste;
    private String nomPiste;
    @Enumerated(EnumType.STRING)
    private Couleur couleur;
    private Integer longueur;
    private Integer pente;
    @ManyToMany(cascade = CascadeType.ALL)
    private Set<Skieur> skieurs;

}
