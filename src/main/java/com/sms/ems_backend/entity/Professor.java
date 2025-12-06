package com.sms.ems_backend.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="professors")
public class Professor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer professor_id;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn
    private Person person;

    @OneToMany(mappedBy = "professor", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<Lesson> lessons;

    @Column
    private Integer number_of_lessons;
}
