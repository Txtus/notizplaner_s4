package com.notizplaner.dev.entity;

import java.util.ArrayList;

public class Notiz {

    private String name;
    private String text;
    private int id;

    
    // Konstruktoren
    public Notiz() {
        name = "Neue Notiz";
        text = "";

    }
    public Notiz(int id, String name, String text) {
        this.name = name;
        this.text = text;
    }

    // Getter & Setter
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getText() {
        return text;
    }
    public void setText(String text) {
        this.text = text;
    }
    public void setID(int id) {
        this.id = id;
    }
    public int getID() {
        return id;
    }

    //CRUD

    public int create(Notiz note) {
        int id = 0; // TODO Notiz erstellen und dabei DB-Index zurückgeben

        

        return id;
    }
    public void update() {

    }
    /*
    public void remove(Notiz note) {
        ArrayList<Notiz> notes = getAllNotes();
        notes.remove(note);
        updateNotes(notes);

    }
    */
}