package com.sms.ems_backend.service;

import com.sms.ems_backend.dto.LessonDto;
import com.sms.ems_backend.dto.PersonDto;
import com.sms.ems_backend.dto.StudentDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface StudentService {
    StudentDto createStudent(StudentDto studentDto);

    StudentDto getStudentById(int id);

    List<StudentDto> getAllStudents();

    List<StudentDto> createStudents(List<StudentDto> studentDtoList);

    StudentDto updateStudentPersonById(int id, PersonDto personDto);

    StudentDto updateStudentLessonById(int id, List<LessonDto> lessonDto);

    void deleteStudentById(int id);
}
