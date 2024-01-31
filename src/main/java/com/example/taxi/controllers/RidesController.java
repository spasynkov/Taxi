package com.example.taxi.controllers;

import org.springframework.web.bind.annotation.*;

import com.example.taxi.entities.Distance;
import com.example.taxi.services.DistanceService;

@RestController
@RequestMapping("api/distance")
public class DistanceController {
	private final DistanceService service;

	public DistanceController(DistanceService service) {
		this.service = service;
	}

	@GetMapping("/")
	public Iterable<Distance> getAll() {
		return service.getAll();
	}

	@PostMapping("/")
	public Distance add(@RequestBody Distance obj) {
		return service.add(obj);
	}
}
