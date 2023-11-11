package com.example.application.Repositries;

import com.example.application.entities.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account,Integer> {
     Account findByEmail(String email);
     Account findByPhoneNumber(String phoneNumber);


}
