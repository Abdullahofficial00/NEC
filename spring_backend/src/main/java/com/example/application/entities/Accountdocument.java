package com.example.application.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@Entity
@Table(name = "accountdocuments", schema = "dbtogo")
public class Accountdocument {
    @Id
    @Column(name = "id", nullable = false)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "accountId")
    private Account account;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "documentId")
    private Document document;

    @NotBlank(message = "Last name cannot be blank")
    @Column(name = "uploadedOn")
    private Date uploadedOn;

}