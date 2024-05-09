package com.hadhikar.database_service.repository;

import com.hadhikar.database_service.model.Exam;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExamRepository extends JpaRepository<Exam, Long> {
}
