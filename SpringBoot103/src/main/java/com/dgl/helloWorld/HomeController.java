package com.dgl.helloWorld;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;  
import org.springframework.web.bind.annotation.RestController;  

@Controller
public class HomeController {
@RequestMapping("/")
public String homePage() {
	return "homeTemplate";
}
}
