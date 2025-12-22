package com.sms.ems_backend.dto;

import com.sms.ems_backend.entity.Lesson;
import com.sms.ems_backend.entity.Person;
import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class StudentDto {
    private Integer student_id;
    private Person person;
    private List<Lesson> lessons;
    private Integer number_of_lessons;
    private String faculty;
    private String major;
}
