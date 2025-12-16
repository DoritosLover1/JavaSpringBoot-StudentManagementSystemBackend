package com.sms.ems_backend.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "addresses")
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer address_id;

    @Column
    private String street;

    @Column
    private String city;

    @Column
    private String state;

    @Column
    private String zip;

    @Column
    private String country;

    @ManyToOne
    @JoinColumn(name = "person_id")
    @JsonBackReference("person-address")
    private Person person;
}
