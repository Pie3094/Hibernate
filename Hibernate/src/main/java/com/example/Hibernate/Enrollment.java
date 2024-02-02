package com.example.Hibernate;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Table(name = "enrollments")         // in tabella
@Data           // Genera Getter e Setter
@NoArgsConstructor  // crea il costruttore vuoto
@AllArgsConstructor // idem
@Entity             // Oggetti [DTO] che tornano indietro dal DB dopo la richiesta. La risposta insomma dei GET, DELETE, ecc-... Risultati filtrati dal DAO o dal Service
public class Enrollment {
    //Classe per collegare le 2 classi

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "enrollment_id")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "student_id", nullable = false)
    private Student student;

    @ManyToOne
    @JoinColumn(name = "class_id", nullable = false)
    private Classroom classroom;
}
