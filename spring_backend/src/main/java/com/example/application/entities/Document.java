package com.example.application.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.LinkedHashSet;
import java.util.Set;

@Getter
@Setter
@Entity
@Table(name = "documents", schema = "dbtogo")
public class Document {
    @Id
    @Column(name = "id", nullable = false)
    private Integer id;

    @Size(max = 255)
    @Column(name = "name")
    private String name;

    @Size(max = 255)
    @Column(name = "category")
    private String category;

    @Column(name = "expiration")
    private Date expiration;

    @OneToMany(mappedBy = "document")
    private Set<Accountdocument> accountdocuments = new LinkedHashSet<>();

}