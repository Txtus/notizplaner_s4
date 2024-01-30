package com.notizplaner.dev.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.sql.*;

@RestController
public class sample_db {
    private String output;
    @GetMapping("/sample_db")
    public String returningString() {
        try{
            output = "Tabelleninhalt:";
            Connection con=DriverManager.getConnection("jdbc:sqlite:./db/notizplaner.db");
            //here sonoo is database name, root is username and password
            Statement stmt=con.createStatement();
            ResultSet rs=stmt.executeQuery("select * from Notizen");
            while(rs.next()) {
                output = output + "<br>" + rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3);
            }
            con.close();

            return output;
        }catch(Exception e){
            System.out.println(e);
            return "error";
        }


    }
}
