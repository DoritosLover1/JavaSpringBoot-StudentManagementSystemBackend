package com.sms.ems_backend.mapper;

import com.sms.ems_backend.dto.StudentDto;
import com.sms.ems_backend.entity.Student;

public class StudentMapper {

    public static StudentDto mapToStudentDto(Student student) {
        return new StudentDto(
                student.getStudent_id(),
                student.getPerson(),
                student.getLessons(),
                student.getNumber_of_lessons(),
                student.getFaculty(),
                student.getMajor()
        );
    }

    public static Student mapToStudent(StudentDto studentDto) {
        return new Student(
                studentDto.getStudent_id(),
                studentDto.getPerson(),
                studentDto.getLessons(),
                studentDto.getNumber_of_lessons(),
                studentDto.getFaculty(),
                studentDto.getMajor()
        );
    }
}
