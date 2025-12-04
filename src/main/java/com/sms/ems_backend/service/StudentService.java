package com.sms.ems_backend.service;

import com.sms.ems_backend.dto.StudentDto;
import org.springframework.stereotype.Service;

@Service
public interface StudentService {
    StudentDto createStudent(StudentDto studentDto);
}
