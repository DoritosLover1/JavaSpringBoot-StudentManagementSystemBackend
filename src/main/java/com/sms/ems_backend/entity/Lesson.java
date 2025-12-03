package com.sms.ems_backend.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "lessons")
public class Lesson {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int lesson_id;

    @Column
    private String lesson_name;

    @Column
    private String lesson_place;

    @Column
    private String lesson_date;

    @Column
    private String lesson_description;

    @Column
    private int number_of_students;

    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn
    private List<Student> students;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn
    private Professor professor;
}
