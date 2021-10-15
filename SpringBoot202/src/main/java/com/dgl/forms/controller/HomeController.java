package com.dgl.forms.controller;

import org.springframework.ui.Model;
import com.dgl.forms.model.Song;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
public class HomeController {
	@GetMapping("/songform")
	public String loadFormPage(Model model) {
		model.addAttribute("song", new Song());
		return "songForm";
	}

		@PostMapping("/songform")
		public String loadFormPage(@ModelAttribute Song song, Model model)
		{
			model.addAttribute("song", song);
			return "confirmsong";
		}
}
