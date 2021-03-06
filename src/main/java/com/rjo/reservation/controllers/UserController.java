package com.rjo.reservation.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.rjo.reservation.entities.Usuario;
import com.rjo.reservation.repository.UserRepository;

@Controller
public class UserController {
	
	@Autowired
	private UserRepository userRepository;

	@RequestMapping("/showreg")
	public String showRegistrationPage() {
		return "login/registerUser";
	}
	
	@RequestMapping(value="registerUser", method = RequestMethod.POST)
	public String register(@ModelAttribute("user")	 Usuario user) {
		//user.setId(1);
		userRepository.save(user);
		return "login/login";
	}
	
	@RequestMapping(value="/login", method = RequestMethod.POST)
	public String login(@RequestParam("email") String email, @RequestParam("password") String password, 
			            ModelMap modelmap) {
		Usuario user = userRepository.findByEmail(email);
		if(user.getPassword().equals(password)) {
			return "findFlights";
		} else {
			modelmap.addAttribute("msg", "invalid user name or password");
		}
		return "login/login";
	}
}
