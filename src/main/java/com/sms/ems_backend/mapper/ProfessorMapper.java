package com.sms.ems_backend.mapper;

import com.sms.ems_backend.dto.ProfessorDto;
import com.sms.ems_backend.entity.Professor;

public class ProfessorMapper {

    public static ProfessorDto mapToProfessorDto(Professor professor) {
        return new ProfessorDto(
                professor.getProfessor_id(),
                professor.getPerson(),
                professor.getLessons(),
                professor.getNumber_of_lessons()
        );
    }

    public static Professor mapToProfessor(Professor professor) {
        return new Professor(
                professor.getProfessor_id(),
                professor.getPerson(),
                professor.getLessons(),
                professor.getNumber_of_lessons()
        );
    }
}
