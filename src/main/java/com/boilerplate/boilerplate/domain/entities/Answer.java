package com.boilerplate.boilerplate.domain.entities;

import lombok.Data;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;

@Data
@Entity
@DynamicInsert
@DynamicUpdate

@Table(name="answers")

public class Answer {
    @Id
    @Column(name="id", unique = true, nullable = false, precision = 20, scale = 0)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name = "possibleAnswer")
    private String possibleAnswer;

    @Column(name = "questionID")
    private Integer questionID;

    @Column(name = "isCorrect")
    private Boolean isCorrect;
}
