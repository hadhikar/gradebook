package com.hadhikar.database_service.repository;


import com.hadhikar.database_service.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
