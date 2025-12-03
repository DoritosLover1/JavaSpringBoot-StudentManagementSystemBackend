package com.sms.ems_backend.mapper;

import com.sms.ems_backend.dto.LessonDto;
import com.sms.ems_backend.entity.Lesson;

public class LessonMapper {

    public static LessonDto mapToLessonDto(Lesson lesson) {
        return new LessonDto(
                lesson.getLesson_id(),
                lesson.getLesson_name(),
                lesson.getLesson_place(),
                lesson.getLesson_date(),
                lesson.getLesson_description(),
                lesson.getNumber_of_students(),
                lesson.getStudents(),
                lesson.getProfessor()
        );
    }

    public static Lesson mapToLesson(LessonDto lessonDto) {
        return new Lesson(
                lessonDto.getLesson_id(),
                lessonDto.getLesson_name(),
                lessonDto.getLesson_place(),
                lessonDto.getLesson_date(),
                lessonDto.getLesson_description(),
                lessonDto.getNumber_of_students(),
                lessonDto.getStudents(),
                lessonDto.getProfessor()
        );
    }
}
