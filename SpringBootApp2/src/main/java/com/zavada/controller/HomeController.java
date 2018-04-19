package com.zavada.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.zavada.entity.Country;
import com.zavada.entity.Student;
import com.zavada.service.CountryService;
import com.zavada.service.StudentService;

@Controller
@SessionAttributes("countries")
public class HomeController {

	private CountryService countryService;
	private StudentService studentService;

	@Autowired
	public HomeController(CountryService countryService, StudentService studentService) {
		this.countryService = countryService;
		this.studentService = studentService;
	}

	@GetMapping("/")
	public String showHome() {
		return "home";
	}

	@GetMapping("/add-country")
	public String showAddCountry(Model model) {
		model.addAttribute("countryModel", new Country());
		return "add-country";
	}

	@PostMapping("/add-country")
	public String saveCountry(
			@Valid @ModelAttribute("countryModel") Country country,
			BindingResult br) {
		if(br.hasErrors()) {
			return "add-country";
		}
		
		countryService.saveCountry(country);
		return "redirect:/";
	}

	@GetMapping("/add-student")
	public String showAddStudent(Model model) {
		model.addAttribute("studentModel", new Student());
		model.addAttribute("countries", countryService.findAllCountries());
		return "add-student";
	}

	@PostMapping("/add-student")
	public String saveStudent(
			@Valid @ModelAttribute("studentModel") Student student, BindingResult br) {
		if(br.hasErrors()) {
			return "add-student";
		}
		
		studentService.saveStudent(student);
		return "redirect:/";
	}
	
	@GetMapping("/countries")
	public String showCountries(Model model) {
		model.addAttribute("countriesList", countryService.findAllCountries());
		return "countries";
	}

	@GetMapping("/students")
	public String showStudents(Model model) {
		model.addAttribute("studentsList", studentService.findAllStudents());
		return "students";
	}
	
}
