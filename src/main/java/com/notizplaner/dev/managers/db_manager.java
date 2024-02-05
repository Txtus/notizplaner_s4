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

    // get and save all entries
    public ArrayList<Notiz> getAllNotes() {
        ArrayList<Notiz> notes = new ArrayList<>();

        String sql = "SELECT id, name, text FROM notes";
        try (Statement stmt = connection_manager.createStatement();
            ResultSet results = stmt.executeQuery(sql);) {
                while (rs.next()) {
                    notes.add(new Notiz(results.getInt(), results.getStringtring()("")))
                }
            }
        return notes;
    }
    public void updateNotes(ArrayList<Notiz> notes) {

    }

}