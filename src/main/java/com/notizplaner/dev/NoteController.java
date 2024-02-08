package com.notizplaner.dev;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class NoteController {

	@GetMapping("/note")
	public String note(@RequestParam(name="id", required=false, defaultValue="World") int name, Model model) {
		model.addAttribute("id", name);
		return "note";
	}

}