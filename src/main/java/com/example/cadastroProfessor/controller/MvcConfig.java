package com.example.cadastroProfessor.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MvcConfig {

		@RequestMapping("/")
		public String index() {
			
			return "login";
		}
		
		@RequestMapping("/login")
		public String login() {
			
			return "login";
		}
}