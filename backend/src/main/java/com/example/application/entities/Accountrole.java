package com.example.application.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.springframework.security.core.GrantedAuthority;

import java.util.Date;

@Getter
@Setter
@Entity
@Table(name = "accountroles", schema = "dbtogo")
public class Accountrole implements GrantedAuthority {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id", nullable = false)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "account_id", nullable = false)
    private Account account;

    @ManyToOne
    @JoinColumn(name = "role_id", nullable = false)
    private Role role;


    @Override
    public String getAuthority() {
        return role.getName();
    }
}