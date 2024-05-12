package com.wageneinsatzplanung.backend;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "USERTABLE")
public class User {

    @Id
    @Column(name = "ID")
    @GeneratedValue(generator = "USERTABLE_SEQ")
    @SequenceGenerator(name = "USERTABLE_SEQ", sequenceName = "USERTABLE_SEQ", allocationSize = 1)
    private Long id;

    @Column(name = "NAME")
    private String name;

    @Column(name = "EMAIL")
    private String email;

    public User(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public User() {

    }


}