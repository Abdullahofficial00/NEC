package com.example.application.Repositries;

import com.example.application.entities.Accountdocument;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountdocumentRepository extends JpaRepository<Accountdocument, Integer> {
}