package com.example.taxi.controllers;

import org.springframework.web.bind.annotation.*;

import com.example.taxi.entities.Income;
import com.example.taxi.services.IncomeService;

@RestController
@RequestMapping("api/income")
public class IncomeController {
	private final IncomeService service;

	public IncomeController(IncomeService service) {
		this.service = service;
	}

	@GetMapping("/")
	public Iterable<Income> getAll() {
		return service.getAll();
	}

	@PostMapping("/")
	public Income add(@RequestBody Income obj) {
		return service.add(obj);
	}
}
