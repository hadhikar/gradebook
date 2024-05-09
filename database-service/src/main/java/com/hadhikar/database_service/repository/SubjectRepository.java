package com.hadhikar.database_service.repository;

import com.hadhikar.database_service.model.Subject;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SubjectRepository extends JpaRepository<Subject, Long> {

}
