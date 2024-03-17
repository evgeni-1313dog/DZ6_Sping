package com.example.DZ6_Sping.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Entity
@AllArgsConstructor
public class Note {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String heading;
    @Column(nullable = false)
    private String content;
    private LocalDateTime ldt = LocalDateTime.now();

    public Note() {

    }
}
