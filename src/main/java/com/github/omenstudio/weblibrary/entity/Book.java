package com.github.omenstudio.weblibrary.entity;

import com.github.omenstudio.weblibrary.annotation.HydraEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@HydraEntity
public class Book {

    @Id
    @GeneratedValue
    private long id;

    @Column(nullable = false)
    private String title;

    public Book() {
        this.id = 777;
        this.title = "Три топора";
    }

}
