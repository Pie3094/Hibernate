package com.example.Hibernate;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data               // Genera Getter e Setter
@NoArgsConstructor  // crea il costruttore vuoto
@Table(name = "classes")
public class Classroom {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "class_id")
    private Long id;

    @Column(name = "titolo", nullable = false)
    @OneToMany(mappedBy = "Classrom")
    private String titolo;

    @Column(name = "descrizione", nullable = false)
    @OneToMany(mappedBy = "Classrom")
    private String descrizione;
}