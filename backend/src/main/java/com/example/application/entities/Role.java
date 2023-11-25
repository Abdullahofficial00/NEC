package com.example.application.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;


import java.util.LinkedHashSet;
import java.util.Set;

@Getter
@Setter
@Entity
@Table(name = "roles", schema = "dbtogo")
public class Role {
    @Id
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "name")
    private String name;


  

}