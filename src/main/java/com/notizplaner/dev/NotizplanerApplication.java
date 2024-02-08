package com.notizplaner.dev;

import java.util.ArrayList;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.notizplaner.dev.entity.Notiz;
import com.notizplaner.dev.managers.db_manager;

@SpringBootApplication
public class NotizplanerApplication {
	public static db_manager manager; 
	public static ArrayList<Notiz> allNotes;
	public static void main(String[] args) {
		manager = new db_manager();
		allNotes = manager.getAllNotes();
		SpringApplication.run(NotizplanerApplication.class, args);
	}

}
