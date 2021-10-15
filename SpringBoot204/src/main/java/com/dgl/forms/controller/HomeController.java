package com.dgl.forms.controller;

import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;

import com.dgl.forms.model.Tvshow;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
public class HomeController {
	@GetMapping("tvform")
	public String loadTvForm(Model model)
	{
		model.addAttribute("tvshow", new Tvshow());
		return "tvform";
	}
	
	
	@PostMapping("tvform")
	public String processTvForm(@Valid Tvshow tvshow, BindingResult result)
	{
		if(result.hasErrors()) {
			return "tvform";
		}
		return "tvshowconfirm";
	}
	

}
