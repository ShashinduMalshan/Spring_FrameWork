package com.service.o13_auth_back_end_security.Repository;

import com.fasterxml.jackson.databind.annotation.JsonAppend;
import com.service.o13_auth_back_end_security.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;


@Repository
public interface UserRepository extends JpaRepository<User,Long> {
    Optional<User>  findByUsername(String username);
}
