package in.sameeerit.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import in.sameeerit.entity.CitizenPlan;
import in.sameeerit.request.SearchRequest;
import in.sameeerit.service.ReportService;

@Controller
public class ReportController {
	
	@Autowired
	private ReportService service;
	
	@PostMapping("/search")
	public String handleSearch(@ModelAttribute ("search")SearchRequest search, Model model) {
		
		List<CitizenPlan> plans = service.search(search);
		model.addAttribute("plans", plans);
		model.addAttribute("search", search);
		
		init(model);
		
		return "index";
	}
	
	@GetMapping("/")
	public String indexPage(Model model) {
		model.addAttribute("search", new SearchRequest());
		init(model);
		
		return "index";
	}

	private void init(Model model) {
		//model.addAttribute("search", new SearchRequest());
		model.addAttribute("names", service.getPlanName());
		model.addAttribute("status", service.getPlanStatus());
	}
	
	

}
