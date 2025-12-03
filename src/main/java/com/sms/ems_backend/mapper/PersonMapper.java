package com.sms.ems_backend.mapper;

import com.sms.ems_backend.dto.PersonDto;
import com.sms.ems_backend.entity.Person;

public class PersonMapper {

    public static PersonDto mapToPersonDto(Person person) {
        return new PersonDto(
                person.getPerson_id(),
                person.getName(),
                person.getEmail(),
                person.getAddress()
        );
    }

    public static Person mapToPerson(PersonDto personDto) {
        return new Person(
                personDto.getPerson_id(),
                personDto.getName(),
                personDto.getEmail(),
                personDto.getAddress()
        );
    }
}
