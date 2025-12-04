package com.sms.ems_backend.service;

import com.sms.ems_backend.dto.PersonDto;
import org.springframework.stereotype.Service;

@Service
public interface PersonService {
    PersonDto createPerson(PersonDto personDto);
}
