package com.sms.ems_backend.dto;

import com.sms.ems_backend.entity.Person;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class AddressDto {
    private Integer address_id;
    private String street;
    private String city;
    private String state;
    private String zip;
    private String country;
    private Person person;
}
