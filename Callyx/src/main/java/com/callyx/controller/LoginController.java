
package com.callyx.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
	
@Controller
public class LoginController
{
 
	@RequestMapping(value="/Login.spring", method = RequestMethod.POST)
	public ModelAndView login(@RequestParam("username") String userName, @RequestParam("password") String password) {

		String message = "Invalid credentials!!";
		ModelAndView modelAndView = new ModelAndView("login", "message", message);
		
		if (userName !=null && password !=null && userName.equals(password))
		{
			message = userName;
			modelAndView = new ModelAndView("login_success", "message", message);
		}
		
		return modelAndView;
	}
	
	@RequestMapping(value="/Index.spring", method = RequestMethod.GET)
	public ModelAndView login() {
		
		return new ModelAndView("login");
	}
	
	@RequestMapping(value="/LoginError.spring", method = RequestMethod.GET)
	public String loginerror(ModelMap model)
	{
     	model.addAttribute("error", "true");
		return "login";
	}
	
	@RequestMapping(value="/Logout.spring", method = RequestMethod.GET)
	public String logout(ModelMap model) {
		return "logout";
	}
 
	
}


