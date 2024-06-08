package com.github.etm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.github.etm.controller.dto.FormPeixe;
import com.github.etm.model.Peixe;
import com.github.etm.repository.PeixeRepository;

@Controller
@RequestMapping("peixes")
public class PeixeController {
	
	@Autowired
	private PeixeRepository peixeRepository;
	
	@GetMapping()
	public String list(Model model) {
		List<Peixe> peixes = peixeRepository.findAll();
		model.addAttribute("peixes", peixes);
		return "peixe/list";
	}
	
	@GetMapping("add")
	public String create(Model model) {
		model.addAttribute("peixe", new FormPeixe());
		return "peixe/form";
	}
	
	@PostMapping("save")
	public String save(@ModelAttribute FormPeixe peixe) {		
		Peixe entity = peixe.toModel();
		peixeRepository.save(entity);
		return "redirect:/peixes/add";
	}

}
