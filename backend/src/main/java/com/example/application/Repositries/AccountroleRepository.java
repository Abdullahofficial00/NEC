package com.example.application.Repositries;

import com.example.application.entities.Accountrole;
import com.example.application.entities.Role;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AccountroleRepository extends JpaRepository<Accountrole, Integer> {
    List<Accountrole> findByRole(Role role);
}