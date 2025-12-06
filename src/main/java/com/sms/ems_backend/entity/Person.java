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
@Table(name = "persons")
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer person_id;

    @Column
    private String name;

    @Column
    private String email;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "person")
    private List<Address> address;
}
