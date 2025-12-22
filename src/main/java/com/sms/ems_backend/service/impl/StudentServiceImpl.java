package com.sms.ems_backend.service.impl;

import com.sms.ems_backend.dto.LessonDto;
import com.sms.ems_backend.dto.PersonDto;
import com.sms.ems_backend.dto.StudentDto;
import com.sms.ems_backend.entity.Lesson;
import com.sms.ems_backend.entity.Student;
import com.sms.ems_backend.exception.ResourceNotFoundException;
import com.sms.ems_backend.mapper.LessonMapper;
import com.sms.ems_backend.mapper.PersonMapper;
import com.sms.ems_backend.mapper.StudentMapper;
import com.sms.ems_backend.repository.StudentRepository;
import com.sms.ems_backend.service.StudentService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

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
    public List<StudentDto> getAllStudents() {
        List<Student> studentList = studentRepository.findAll();
        return studentList.stream().map(StudentMapper::mapToStudentDto)
                .collect(Collectors.toList());
    }

    // Düzeltilecek bunlar
    @Override
    public StudentDto updateStudentPersonById(int id, PersonDto personDto) {
         Student student = studentRepository.findById(id).orElseThrow(
                 () -> new ResourceNotFoundException("Student is not exist with given id: " + id)
         );

         student.setPerson(PersonMapper.mapToPerson(personDto));

         return StudentMapper.mapToStudentDto(studentRepository.save(student));
    }

    // Düzeltilecek bunlar
    @Override
    public StudentDto updateStudentLessonById(int id, List<LessonDto> lessonDto) {
        Student student = studentRepository.findById(id).orElseThrow(
                () -> new ResourceNotFoundException("Student is not exist with given id: " + id)
        );

        student.setLessons(lessonDto.stream().map(LessonMapper::mapToLesson)
                .collect(Collectors.toList()));

        return StudentMapper.mapToStudentDto(studentRepository.save(student));
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

    @Override
    public void deleteStudentById(int id) {
        Student student = studentRepository.findById(id).orElseThrow(
                () ->  new ResourceNotFoundException("Student is not exist with given id: " + id)
        );
        studentRepository.deleteById(id);
    }
}
