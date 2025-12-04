package com.sms.ems_backend.service.impl;

import com.sms.ems_backend.dto.StudentDto;
import com.sms.ems_backend.entity.Student;
import com.sms.ems_backend.mapper.StudentMapper;
import com.sms.ems_backend.repository.StudentRepository;
import com.sms.ems_backend.service.StudentService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class StudentServiceImpl implements StudentService {

    private StudentRepository studentRepository;

    @Override
    public StudentDto createStudent(StudentDto studentDto) {

        Student student = StudentMapper.mapToStudent(studentDto);
        Student savedStudent = studentRepository.save(student);

        return StudentMapper.mapToStudentDto(savedStudent);
    }
}
