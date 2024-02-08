package com.notizplaner.dev.controller.notes;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
// import java.sql.*;

@RestController
public class Edit {
    // private String output;
    @GetMapping("/notes/api/edit/{id}")
    public String returningString(@PathVariable int id) {
        try{
            
            return "<h1>Edit: "+id+"</h1>";

            
        }catch(Exception e){
            System.out.println(e);
            return "error";
        }


    }
}
