package com.example.webapp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {
@RequestMapping("/index")
	public String display()
	{
		return "index.jsp";
	}
}
