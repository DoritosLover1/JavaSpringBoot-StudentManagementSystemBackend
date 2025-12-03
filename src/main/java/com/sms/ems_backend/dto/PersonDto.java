package com.sms.ems_backend.dto;

import com.sms.ems_backend.entity.Address;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class PersonDto {
    private int person_id;
    private String name;
    private String email;
    private List<Address> address;
}
