package com.hiFICOder.sancharLogin.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AnonymousAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;


import com.hiFICOder.sancharLogin.model.SancharCard;

@Controller
public class sancharLoginController {

	static String mongoDbPort = "8102";

	@RequestMapping("/welcome")
	public ModelAndView firstPage() {
		return new ModelAndView("welcome");
	}
	@RequestMapping("/getCards")
	public ModelAndView getCards() {
		RestTemplate restTemplate = new RestTemplate();
		ResponseEntity<SancharCard> result = null;
		final String baseUrl = "http://localhost:" + mongoDbPort + "/smartcard/" + currentUser();
		result = restTemplate.getForEntity(baseUrl, SancharCard.class);
		SancharCard card = result.getBody();
		ModelAndView model = new ModelAndView("getCards");
		List<SancharCard> list = new ArrayList<SancharCard>();
		list.add(card);
		model.addObject("cards", list);
		return model;
	}

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String login(Model model, String error, String logout) {
		if (error != null)
			model.addAttribute("errorMsg", "Your username and password are invalid.");

		if (logout != null)
			model.addAttribute("msg", "You have been logged out successfully.");

		return "login";
	}

	private String currentUser() {
		Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
		if (!(authentication instanceof AnonymousAuthenticationToken)) {
			String currentUserName = authentication.getName();
			return currentUserName;
		}
		return null;
	}

}
