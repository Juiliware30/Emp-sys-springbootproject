package com.proj.empsystem.controller;

import javax.servlet.http.HttpSession;

import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.proj.empsystem.entity.emp;
import com.proj.empsystem.service.empservice;


@Controller
public class empcontroller {

		@Autowired
		private empservice service;
	
		@GetMapping("/")
		public String home(Model m)
		{
			List<emp> emp=service.getAllEmp();
			m.addAttribute("emp",emp);
			return "index";
		}
		
		@GetMapping("/addemp")
		public String addempform()
		{
			return "add_emp";
		}
		
		@PostMapping("/register")
		public String empregister(@ModelAttribute emp e,HttpSession session)
		{
			System.out.println(e);
			
			service.addemp(e);
			session.setAttribute("msg", "employee added sucessfully..");
			
			return "redirect:/";
		}
		
		@GetMapping("/edit/{id}")
		public String edit(@PathVariable int id,Model m)
		{
			emp e=service.getEmpById(id);
			m.addAttribute("emp",e);
			return "edit";
		}
		
		
		@PostMapping("/update")
		public String updateemp(@ModelAttribute emp e,HttpSession session)
		{
			service.addemp(e);
			session.setAttribute("msg", "emp Update sucessfully");
			return "redirect:/";
		}
		
		@GetMapping("/delete/{id}")
		public String deleteemp(@PathVariable int id,HttpSession session)
		{
			service.delete(id);
			session.setAttribute("msg", "emp delete sucessfully");
			return "redirect:/";
		}
		

}
