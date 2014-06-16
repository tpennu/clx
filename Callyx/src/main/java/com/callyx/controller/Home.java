
package com.callyx.controller;


import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class Home {
	
	@RequestMapping(value="/LoginSuccess.spring", method = RequestMethod.GET)
	public String printWelcome(ModelMap model)
	{
     	User user = (User)SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		String name = user.getUsername();
		model.addAttribute("username", name);
		model.addAttribute("message", "Login Verification example");
		return "hello";
 	}
}