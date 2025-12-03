package com.sms.ems_backend.dto;

import com.sms.ems_backend.entity.Lesson;
import com.sms.ems_backend.entity.Person;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ProfessorDto {
    private int person_id;
    private Person person;
    private List<Lesson> lessons;
    private int number_of_lessons;
}
