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
@Table(name = "students")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int student_id;

    @OneToOne(cascade = CascadeType.ALL)
    private Person person;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn()
    private List<Lesson> lessons;

    @Column
    private int number_of_lessons;
}
