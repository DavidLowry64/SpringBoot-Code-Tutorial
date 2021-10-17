package com.dgl.data.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;

import com.dgl.data.service.JobRepository;
import com.dgl.data.model.Job;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
 

@Controller
public class HomeController {

	@Autowired
	JobRepository jobRepository;
	
    @RequestMapping("/")
    public String listJobs(Model model)
    {
    	model.addAttribute("jobs", jobRepository.findAll());
    	return "list";
    	//return "index";
    }
    
    @GetMapping("/add")
    public String jobForm(Model model)
    {
    	model.addAttribute("job", new Job());
    	return "jobform";
    }
	
    @PostMapping("/process")
    public String processForm(@Valid Job job, BindingResult result)
    {
    	if (result.hasErrors())
    	{
    		return "jobform";
    	}
    	jobRepository.save(job);
        //jobRespository.save(job);	
    	return "redirect:/";
    }
}
