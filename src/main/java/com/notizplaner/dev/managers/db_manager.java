package com.notizplaner.dev.managers;

import com.notizplaner.dev.entity.Notiz;
import java.sql.*;
import java.util.ArrayList;

public class db_manager {
    private final String CONNECTIONURL = "jdbc:sqlite:./db/notizplaner.db";
    private Connection connection_manager;
    
    public db_manager() {
        try {
            connection_manager = DriverManager.getConnection("jdbc:sqlite:./db/notizplaner.db");
        } catch(SQLException sqlException) {
            System.out.println("Could not establish sql connection to following SQLIT file: " + CONNECTIONURL);
            System.out.println(sqlException);
        }
        
    }

    // CRUD
    public ArrayList<Notiz> getAllNotes() {
        ArrayList<Notiz> notes = new ArrayList<>();

        String sqlName = "SELECT name FROM notes";
        String sqlText = "SELECT text FROM notes";

        try (Statement stmt = connection_manager.createStatement(sqlName);
            Result res = stmt.executeQuery(sqlName);
            Result
        return notes;
    }
    public void updateNotes(ArrayList<Notiz> notes) {

    }

}