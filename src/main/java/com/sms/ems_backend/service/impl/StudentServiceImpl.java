package com.sms.ems_backend.service.impl;

import com.sms.ems_backend.dto.StudentDto;
import com.sms.ems_backend.entity.Student;
import com.sms.ems_backend.exception.ResourceNotFoundException;
import com.sms.ems_backend.mapper.StudentMapper;
import com.sms.ems_backend.repository.StudentRepository;
import com.sms.ems_backend.service.StudentService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

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

    @Override
    public StudentDto getStudentById(int id) {
        Student gottenStudent = studentRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Student is not exist with given id: " + id));
        return StudentMapper.mapToStudentDto(gottenStudent);
    }

    @Override
    public List<StudentDto> createStudents(List<StudentDto> studentDtoList) {
        List<StudentDto> savedStudentDtoList = new ArrayList<>();
        for  (StudentDto studentDto : studentDtoList) {
            Student student = StudentMapper.mapToStudent(studentDto);
            Student savedStudent = studentRepository.save(student);
            savedStudentDtoList.add(StudentMapper.mapToStudentDto(savedStudent));
        }
        return savedStudentDtoList;
    }
}
