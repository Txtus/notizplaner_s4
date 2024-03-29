package com.notizplaner.dev.managers;

import com.notizplaner.dev.entity.Notiz;
import java.sql.*;
import java.util.ArrayList;

public class db_manager {
    private final String CONNECTIONURL = "jdbc:sqlite:./notizplaner_s4-master/db/notizplaner.db";
    private Connection connection_manager;
    
    public db_manager() {
        try {
            connection_manager = DriverManager.getConnection("jdbc:sqlite:./notizplaner_s4-master/db/notizplaner.db");
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
                while (results.next()) {
                    notes.add(new Notiz(results.getInt("id"), results.getString("name"), results.getString("text")));
                }
            } catch (SQLException sqlException) {
                System.out.println(sqlException);
            }
        return notes;
    }
    public void updateNotes(ArrayList<Notiz> notes) {
        String sql = "INSERT INTO notes(id, name, text) VALUES(?, ?, ?)";
        
        try (PreparedStatement pstmt = connection_manager.prepareStatement(sql)) {
            for (Notiz note : notes) {
                pstmt.setInt(1, note.getID());
                pstmt.setString(2, note.getName());
                pstmt.setString(3, note.getText());
                pstmt.executeUpdate();
            }
        } catch (SQLException sqlException) {
            System.out.println(sqlException);
        }
    }

    public Notiz geNotiz(int id) {
        Notiz p = new Notiz();


        String sql = "SELECT * FROM notes WHERE id=?";
        
        try (PreparedStatement pstmt = connection_manager.prepareStatement(sql)) {
            pstmt.setInt(1, id);
            
            try {
                ResultSet results = pstmt.executeQuery();
                while (results.next()) {
                    p.setName(results.getString("name"));
                    p.setText(results.getString("text"));
                    p.setID(results.getInt("id"));
                }
            } catch (SQLException sq) {
                sq.printStackTrace();
                return p;
            }
        } catch (SQLException sqlException) {
            System.out.println(sqlException);
            return p;
        }

        return p;
    }
}