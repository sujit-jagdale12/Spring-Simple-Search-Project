package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class SearchController {

	@RequestMapping("/")
	public String search() {
		return "Search";
	}

	
	@RequestMapping("/search")
	public RedirectView getView(@RequestParam("querybox") String querybox) {
		String url = "https://www.google.com/search?q=" + querybox;
		RedirectView redirectView = new RedirectView();
		redirectView.setUrl(url);
		return redirectView;
	}
}
