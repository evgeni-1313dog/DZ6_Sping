package com.example.DZ6_Sping.repository;

import com.example.DZ6_Sping.model.Note;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface NoteRepo extends JpaRepository<Note, Long> {
    Optional<Note> findById(Long id);
    }
