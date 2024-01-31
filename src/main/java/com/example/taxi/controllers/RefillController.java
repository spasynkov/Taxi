package com.example.taxi.controllers;

import org.springframework.web.bind.annotation.*;

import com.example.taxi.entities.Refill;
import com.example.taxi.services.RefillService;

@RestController
@RequestMapping("api/refill")
public class RefillController {
	private final RefillService service;

	public RefillController(RefillService service) {
		this.service = service;
	}

	@GetMapping("/")
	public Iterable<Refill> getAll() {
		return service.getAll();
	}

	@PostMapping("/")
	public Refill add(@RequestBody Refill obj) {
		return service.add(obj);
	}
}
