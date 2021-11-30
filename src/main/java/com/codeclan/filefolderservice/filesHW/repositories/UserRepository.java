package com.codeclan.filefolderservice.filesHW.repositories;

import com.codeclan.filefolderservice.filesHW.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
