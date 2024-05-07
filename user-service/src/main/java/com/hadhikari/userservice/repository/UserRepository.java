package com.hadhikari.userservice.repository;

import com.hadhikari.userservice.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
