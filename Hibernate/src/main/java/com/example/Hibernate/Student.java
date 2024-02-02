package com.example.Hibernate;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data               // Genera Getter e Setter
@NoArgsConstructor  // crea il costruttore vuoto
@Table(name = "students")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "student_id")
    private Long id;

    @Column(name = "cognome", nullable = false)
    @OneToMany(mappedBy = "Student")
    private String cognome;

    @Column(name = "nome", nullable = false)
    @OneToMany(mappedBy = "Student")
    private String nome;

    @Column(name = "email", unique = true, nullable = false)
    @OneToMany(mappedBy = "Student")
    private String email;

}
