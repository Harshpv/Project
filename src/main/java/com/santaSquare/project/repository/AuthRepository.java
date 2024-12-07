package com.santaSquare.project.repository;

import com.santaSquare.project.model.UserAccount;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthRepository extends JpaRepository<UserAccount, String> {
}
