package com.sms.ems_backend.repository;

import com.sms.ems_backend.entity.Lesson;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LessonRepository extends JpaRepository<Lesson, Integer> {

}
