package com.example.taxi.controllers;

import org.springframework.web.bind.annotation.*;

import com.example.taxi.entities.Ride;
import com.example.taxi.services.RidesService;

@RestController
@RequestMapping("api/rides")
public class RidesController {
	private final RidesService service;

	public RidesController(RidesService service) {
		this.service = service;
	}

	@GetMapping("/")
	public Iterable<Ride> getAll() {
		return service.getAll();
	}

	@PostMapping("/")
	public Ride add(@RequestBody Ride obj) {
		return service.add(obj);
	}
}
