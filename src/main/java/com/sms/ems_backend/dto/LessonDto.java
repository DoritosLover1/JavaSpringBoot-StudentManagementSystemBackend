package com.sms.ems_backend.dto;

import com.sms.ems_backend.entity.Professor;
import com.sms.ems_backend.entity.Student;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class LessonDto {
    private int lesson_id;
    private String lesson_name;
    private String lesson_place;
    private String lesson_date;
    private String lesson_description;
    private int number_of_students;
    private List<Student> students;
    private Professor professor;
}
