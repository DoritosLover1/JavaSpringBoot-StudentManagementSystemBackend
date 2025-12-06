package com.sms.ems_backend.controller;

import com.sms.ems_backend.dto.StudentDto;
import com.sms.ems_backend.service.StudentService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/api/students")
public class StudentController {

    private StudentService studentService;

    @PostMapping("/create-student")
    public ResponseEntity<StudentDto> createStudent(@RequestBody StudentDto studentDto) {
        StudentDto savedStudent = studentService.createStudent(studentDto);
        return new ResponseEntity<>(savedStudent, HttpStatus.CREATED);
    }

    @PostMapping("/create-students")
    public ResponseEntity<List<StudentDto>> createStudents(@RequestBody List<StudentDto> studentDtoList) {
        List<StudentDto> savedStudents = studentService.createStudents(studentDtoList);
        return new ResponseEntity<>(savedStudents, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<StudentDto> getAllStudents() {
        return new ResponseEntity<>(new StudentDto(),HttpStatus.FOUND);
    }

    @GetMapping("/get-student/by/{id}")
    public ResponseEntity<StudentDto> getStudentById(@PathVariable("id") int id) {
        StudentDto studentDto = studentService.getStudentById(id);
        return ResponseEntity.ok(studentDto);
    }
}

