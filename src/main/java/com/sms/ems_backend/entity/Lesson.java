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
    private Integer lesson_id;

    @Column
    private String lesson_name;

    @Column
    private String lesson_place;

    @Column
    private String lesson_date;

    @Column
    private String lesson_description;

    @Column
    private Integer number_of_students;

    @ManyToMany(mappedBy = "lessons")
    private List<Student> students;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "professor_id")
    private Professor professor;
}
