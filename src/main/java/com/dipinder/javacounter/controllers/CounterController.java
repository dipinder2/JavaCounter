package com.dipinder.javacounter.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CounterController {
	
	@RequestMapping("/")
	public String index(HttpSession session) {
		if(session.getAttribute("counter") ==null) {
			session.setAttribute("counter", 0);
		}
		int x = (int)session.getAttribute("counter");
		session.setAttribute("counter", x+1);	

		return "index.jsp";
	}
	@RequestMapping("/counter")
	public String counter() {
		return "counter.jsp";
	}
	
}
