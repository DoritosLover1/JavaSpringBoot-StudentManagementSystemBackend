package com.sms.ems_backend.service.impl;

import com.sms.ems_backend.dto.PersonDto;
import com.sms.ems_backend.entity.Person;
import com.sms.ems_backend.mapper.PersonMapper;
import com.sms.ems_backend.mapper.StudentMapper;
import com.sms.ems_backend.repository.PersonRepository;
import com.sms.ems_backend.service.PersonService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class PersonServiceImpl implements PersonService {

    private PersonRepository personRepository;

    @Override
    public PersonDto createPerson(PersonDto personDto) {
        Person person = PersonMapper.mapToPerson(personDto);
        Person savedPerson = personRepository.save(person);

        return PersonMapper.mapToPersonDto(savedPerson);
    }
}
