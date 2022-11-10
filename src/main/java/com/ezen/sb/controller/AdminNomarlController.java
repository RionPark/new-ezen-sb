package com.ezen.sb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.ezen.sb.service.UserNormalService;

import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
public class AdminNomarlController {
	@Autowired
	private UserNormalService unService;
	
	@GetMapping("/normal/users")
	public String getUsers(Model model){
		model.addAttribute("list", unService.getUsers());
		return "views/user-list";
	}
	

	@GetMapping("/money")
	public String goMoney(@RequestParam("money") int money,
			@RequestParam("name") String name,
			Model model) {
		model.addAttribute("name",name);
		model.addAttribute("money",money);
		
		return "views/money";
	}
}
