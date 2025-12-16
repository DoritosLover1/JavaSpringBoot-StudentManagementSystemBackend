package com.sms.ems_backend.controller;

import com.sms.ems_backend.dto.LessonDto;
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

    @GetMapping("/get-all-students")
    public ResponseEntity<List<StudentDto>> getAllStudents() {
        List<StudentDto> savedStudents = studentService.getAllStudents();
        return new ResponseEntity<>(savedStudents, HttpStatus.FOUND);
    }

    @PostMapping("/update-student-lessons/by/{id}")
    public ResponseEntity<StudentDto> updateStudentLessonById(@PathVariable("id") int id, @RequestBody List<LessonDto> lessonDto) {
        StudentDto studentDto = studentService.updateStudentLessonById(id, lessonDto);
        return new ResponseEntity<>(studentDto, HttpStatus.OK);
    }

    @GetMapping("/get-student/by/{id}")
    public ResponseEntity<StudentDto> getStudentById(@PathVariable("id") int id) {
        StudentDto studentDto = studentService.getStudentById(id);
        return ResponseEntity.ok(studentDto);
    }
}

