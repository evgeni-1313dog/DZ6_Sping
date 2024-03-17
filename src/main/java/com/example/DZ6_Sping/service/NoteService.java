package com.example.DZ6_Sping.service;

import com.example.DZ6_Sping.model.Note;
import com.example.DZ6_Sping.repository.NoteRepo;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@AllArgsConstructor
public class NoteService {
    private NoteRepo noteRepo;

    // получение всех заметок
    public List<Note> findAllNote(){
        return noteRepo.findAll();
    }

    public Note createNote(Note note){
        return noteRepo.save(note);
    }

    //поиск заметок по id
    public Note getNoteById(Long id){
        return noteRepo.findById(id).orElseThrow(null);
    }

    public Note updateNote(Note note){
        Note noteUpdate = getNoteById(note.getId());
        noteUpdate.setHeading(note.getHeading());
        noteUpdate.setContent(note.getContent());
        return noteRepo.save(noteUpdate);
    }


    public void deleteById(Long id){
        noteRepo.deleteById(id);
    }



}
