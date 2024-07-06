package com.example.demo;


import org.springframework.stereotype.Controller;   		// for @Controller on line 9
import org.springframework.ui.Model;						// for Model on line 13
import org.springframework.web.bind.annotation.GetMapping;	// for GetMapping on line 12


@Controller
public class HomePage {
	
	@GetMapping("/version")
	public String index(Model m)
	{
		m.addAttribute("JREVersion", System.getProperty("java.runtime.version") );
		return "version";
	}

}
