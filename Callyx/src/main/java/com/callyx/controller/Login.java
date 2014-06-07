package com.callyx.controller;  

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;
import javax.servlet.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Login extends AbstractController 
{ 
  private String name,password,successmessage,errormessage;  
  
  @Override
  protected ModelAndView handleRequestInternal(HttpServletRequest request,
			HttpServletResponse response) throws Exception 
    {  
	  ModelAndView model = new ModelAndView("login");
		model.addObject("msg", "Login Page");

		return model;
	  
  /*  if(password.equals("caalyx"))
          {return "success";}  
    else  {return "error";}  */
  
    }  
}  