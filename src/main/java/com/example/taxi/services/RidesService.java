package com.example.taxi.services;

import org.springframework.stereotype.Service;

import com.example.taxi.entities.Ride;
import com.example.taxi.repositories.RidesRepository;

@Service
public class RidesService {
	private final RidesRepository repository;

	public RidesService(RidesRepository repository) {
		this.repository = repository;
	}

	public Iterable<Ride> getAll() {
		return repository.findAll();
	}

	public Ride add(Ride obj) {
		return repository.save(obj);
	}
}
