package com.notizplaner.dev.controller.notes;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import java.sql.*;
import static com.notizplaner.dev.NotizplanerApplication.allNotes;
import static com.notizplaner.dev.NotizplanerApplication.manager;

import com.notizplaner.dev.entity.Notiz;
@RestController
public class Show {
    private String output;
    @GetMapping("/notes/api/{id}")
    public String returningString(@PathVariable int id) {
        try{
            Notiz n = manager.geNotiz(id);
            return "<h1>Note: "+n.getName()+"</h1>";

            
        }catch(Exception e){
            System.out.println(e);
            return "error";
        }


    }
}
