package model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "professor")
public class Professor {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String nome;
    private String disciplina;


}
