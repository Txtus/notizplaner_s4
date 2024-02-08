package com.notizplaner.dev.controller.notes;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.stereotype.Controller;


import java.sql.*;
import static com.notizplaner.dev.NotizplanerApplication.allNotes;
import com.notizplaner.dev.entity.Notiz;
@Controller
public class ShowAll {
    private String output;
    @GetMapping("/notes")
    public String notes(Model model) {
        try{
            for(Notiz n : allNotes) {
                // code for output
                
            }
            model.addAttribute("id", allNotes.get(0).getID());
            return "notes";
        }catch(Exception e){
            System.out.println(e);
            return "error";
        }


    }
}
