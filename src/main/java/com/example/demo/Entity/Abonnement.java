package com.example.demo.Entity;

import lombok.*;
import lombok.experimental.FieldDefaults;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
//@ToString
@EqualsAndHashCode
@FieldDefaults(level = AccessLevel.PRIVATE)
@ToString(exclude={"numAbon"})
@Builder

public class Abonnement implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long numAbon;
    @Temporal(TemporalType.DATE)
    private Date dateDebut;
    @Temporal(TemporalType.DATE)

    private Date dateFin;
    private Float prixAbon;
    @Enumerated(EnumType.STRING)

    private TypeAbonnement typeAbon;
    @OneToOne(mappedBy = "abonnement", cascade = CascadeType.ALL,
            fetch = FetchType.LAZY, optional = false)
    private Skieur skieurs;





}