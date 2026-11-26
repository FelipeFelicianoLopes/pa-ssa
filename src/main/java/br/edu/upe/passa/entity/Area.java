package br.edu.upe.passa.entity;


import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;








@Entity
@Table(name = "area")
@Getter
@Setter
@NoArgsConstructor
public class Area {
@Id
    
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_area")
    private Integer id;

    

    @Column(nullable = false, unique = true)
    private String nome;

    @OneToMany(mappedBy = "area")
    private List<Disciplina> disciplinas = new ArrayList<>();
}