package com.notizplaner.dev.controller.notes;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.sql.*;

@RestController
public class New {
    private String output;
    @GetMapping("/notes/api/new")
    public String returningString() {
        try{
           
           
            return "<h1>New</h1>";

            
        }catch(Exception e){
            System.out.println(e);
            return "error";
        }


    }
}
